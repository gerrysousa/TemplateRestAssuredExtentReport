package com.TemplateRestAssuredExtentReport.requests;

import com.TemplateRestAssuredExtentReport.GlobalParameters;
import com.TemplateRestAssuredExtentReport.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetTokenRequest extends RequestRestBase {
    public GetTokenRequest(String user, String password){
        url= GlobalParameters.URL_TOKEN;
        requestService = "token/"+user+"/"+password;
        method = Method.GET;
    }
}
