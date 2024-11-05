package com.api.testcases;

import com.api.base.APIConfig;
import com.api.base.Config;
import com.api.testdata.Constants;
import com.api.utils.HttpStatus;
import com.api.utils.JSONutils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestCases extends Config {
    Map<String, Object> headers;
    @Test
    public void validatePOSTcall(){
        headers = new LinkedHashMap<>();
        Response resp = APIConfig.apiCall("Get", Constants.baseURI, Constants.basePATH, headers, "");
        Assert.assertEquals(HttpStatus.OK.getCode(), 200, "Unable to fetch data");
        System.out.println("Response : " +resp.asString());
        Map<String, Object> map = (Map<String, Object>) JSONutils.getObjectFromResponse(resp.asString());
        System.out.println("Response Code : "+resp.statusCode());
        System.out.println("Response : " +map);
    }
}
