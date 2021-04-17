package com.TemplateRestAssuredExtentReport.requests;

import com.TemplateRestAssuredExtentReport.bases.RequestRestBase;
import com.TemplateRestAssuredExtentReport.utils.GeneralUtils;
import io.restassured.http.Method;

public class PostActivitiesRequest extends RequestRestBase {
  public PostActivitiesRequest(){
    requestService = "/v1/Activities/";
    method = Method.POST;
  }

  public void setJsonBody(String id,
      String title,
      String dueDate,
      String completed)
  {
    jsonBody = GeneralUtils.readFileToAString("src/test/java/com/TemplateRestAssuredExtentReport/jsons/PostActivity.json");

    jsonBody = jsonBody.replace("$id", id)
        .replace("$title", title)
        .replace("$dueDate", dueDate)
        .replace("$completed", completed);
  }
}
