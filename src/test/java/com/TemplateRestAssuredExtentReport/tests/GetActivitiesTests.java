package com.TemplateRestAssuredExtentReport.tests;

import com.TemplateRestAssuredExtentReport.bases.TestBase;
import com.TemplateRestAssuredExtentReport.requests.GetActivitiesRequest;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetActivitiesTests extends TestBase {
  GetActivitiesRequest getActivitiesRequest;

  @Test
  public void GetActivityByIdSuccessfully(){
    SoftAssert softAssert = new SoftAssert();

    //Arrange
    String activityId = "10";
    int statusCode = HttpStatus.SC_OK;
    String title = "Activity 10";
    String dueDate = "2021-04-18T00:36:00.2498363+00:00";
    boolean completed = true;

    //Act
    getActivitiesRequest = new GetActivitiesRequest(activityId);
    Response response = getActivitiesRequest.executeRequest();

    //Assert
    Assert.assertEquals(response.statusCode(), statusCode);
    softAssert.assertEquals(response.body().jsonPath().get("id").toString(), activityId, "Validate id");
    softAssert.assertEquals(response.body().jsonPath().get("title").toString(), title, "Validate title");
    //softAssert.assertEquals(response.body().jsonPath().get("dueDate").toString(), dueDate, "Validate dueDate");//Due Date is random on Fake Api
    softAssert.assertEquals(response.body().jsonPath().get("completed"), completed,  "Validate completed");
    softAssert.assertAll();
  }
}