package com.TemplateRestAssuredExtentReport.steps;

import com.TemplateRestAssuredExtentReport.GlobalParameters;
import com.TemplateRestAssuredExtentReport.requests.GetTokenRequest;
import io.restassured.response.Response;

public class AuthenticationSteps {
    public static void getToken(String user, String password){
        GetTokenRequest getTokenRequest = new GetTokenRequest(user, password);
        Response response = getTokenRequest.executeRequest();
        GlobalParameters.setToken(response.body().jsonPath().get("token").toString());
    }
}
