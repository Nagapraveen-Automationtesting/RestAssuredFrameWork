package com.api.utils;

import io.restassured.path.json.JsonPath;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONutils {

    public static String readJSONfromFile(String path){
        String readJSON;
        try {
            readJSON = new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return readJSON;
    }

    public static Object getObjectFromResponse(String response){
        Object snippet;
        JsonPath jsonPath = new JsonPath(response);
        snippet = jsonPath.getMap("$");
        return snippet;
    }

}
