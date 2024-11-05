package com.api.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class APIConfig {

    public static Response apiCall(String httpCall, String baseURI, String basePATH, Map<String, Object> headersMap,
                            String payload){
        httpCall = httpCall.toLowerCase();
        Response resp = null;
        switch (httpCall){
            case "post":
                resp = RestAssured
                        .given()
                        .baseUri(baseURI)
                        .basePath(basePATH)
                        .headers(headersMap)
                        .body(payload)
                        .when().post()
                        .then().extract().response();
                break;

            case "get":
                resp = RestAssured
                        .given()
                        .baseUri(baseURI)
                        .basePath(basePATH)
                        .headers(headersMap)
                        .when().get()
                        .then().extract().response();
                break;

            case "put":
                resp = RestAssured
                        .given()
                        .baseUri(baseURI)
                        .basePath(basePATH)
                        .headers(headersMap)
                        .body(payload)
                        .when().put()
                        .then().extract().response();
                break;

            case "delete":
                resp = RestAssured
                        .given()
                        .baseUri(baseURI)
                        .basePath(basePATH)
                        .headers(headersMap)
                        .when().delete()
                        .then().extract().response();
                break;

            default:
                throw new RuntimeException("Invalid HTTP protocall");
        }
        return resp;
    }
}
