package com.TemplateRestAssuredExtentReport.requests;

import com.TemplateRestAssuredExtentReport.bases.RequestRestBase;
import io.restassured.http.Method;

public class GetActivitiesRequest extends RequestRestBase {
  public GetActivitiesRequest(String ActivityId){
    requestService = "/v1/Activities/"+ActivityId;
    method = Method.GET;
  }
}

