package com.TemplateRestAssuredExtentReport.requests;

import com.TemplateRestAssuredExtentReport.bases.RequestRestBase;
import com.TemplateRestAssuredExtentReport.utils.GeneralUtils;
import io.restassured.http.Method;

public class PostActivitiesRequest extends RequestRestBase {
  public PostActivitiesRequest(){
    requestService = "/pet";
    method = Method.POST;
  }

  public void setJsonBody(String id,
      String categoryId,
      String categoryName,
      String name,
      String photoUrl,
      String tagId,
      String tagName,
      String status){
    jsonBody = GeneralUtils.readFileToAString("src/test/java/com/TemplateRestAssuredExtentReport/jsons/PostPetJson.json");

    jsonBody = jsonBody.replace("$id", id)
        .replace("$categoryId", categoryId)
        .replace("$categoryName", categoryName)
        .replace("$name", name)
        .replace("$photoUrl", photoUrl)
        .replace("$tagId", tagId)
        .replace("$tagName", tagName)
        .replace("$status", status);
  }
}
