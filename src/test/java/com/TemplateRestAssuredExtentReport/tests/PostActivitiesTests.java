package com.TemplateRestAssuredExtentReport.tests;

import com.TemplateRestAssuredExtentReport.bases.TestBase;
import com.TemplateRestAssuredExtentReport.requests.PostActivitiesRequest;
import org.testng.asserts.SoftAssert;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PostActivitiesTests extends TestBase {

  PostActivitiesRequest postActivitiesRequest;

  @Test
  public void postActivitySuccessfully() {
    //Arrange
    String id = "9999";
    String title = "9999";
    String dueDate = "2021-04-17T14:50:07.607Z";
    String completed = "true";
    int statusCode = HttpStatus.SC_OK;

    //Act
    postActivitiesRequest = new PostActivitiesRequest();
    postActivitiesRequest.setJsonBody(id, title, dueDate, completed);
    Response response = postActivitiesRequest.executeRequest();

    //Assert
    SoftAssert softAssert = new SoftAssert();
    Assert.assertEquals(response.statusCode(), statusCode);
    softAssert.assertEquals(response.body().jsonPath().get("id").toString(), id, "Validate id");
    softAssert.assertEquals(response.body().jsonPath().get("title").toString(), title, "Validate title");
    softAssert.assertEquals(response.body().jsonPath().get("dueDate").toString(), dueDate, "Validate dueDate");
    softAssert.assertEquals(response.body().jsonPath().get("completed").toString(), completed, "Validate completed");
    softAssert.assertAll();
  }
}
