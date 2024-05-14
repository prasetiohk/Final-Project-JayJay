package com.prasetio.apiTest.stepDef;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Random;


public class userDataStepDef {
    public static String userId;

    protected RequestSpecification getDriver() {
            RestAssured.baseURI = "https://dummyapi.io/data/v1";
            RequestSpecification request = RestAssured.given();
            request.header("app-id", "64623ba4afa9951861c8234f")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json");
            return request;
    }
    @Test
    @When("users want to get information from website")
    public void usersWantToGetInformationFromWebsite() {
        RequestSpecification request = getDriver();
        request.when().get("/user");
    }


    @Test
    @When("users want to get information by user id")
    public void usersWantToGetInformationByUserId() {
        RequestSpecification request = getDriver();
        request.when().get("/user/:id/60d0fe4f5311236168a109ca");
    }

    @Test
    @Then("the requested data returned")
    public void theRequestedDataReturned() {
        RequestSpecification request = getDriver();
        Response response = request.when().get("/user");
        response.then().log().all().assertThat().statusCode(200);


        String responseBody = response.getBody().asString();


        Assert.assertTrue(responseBody.contains("data"));
    }
    @Test
    @Then("the requested data returned by ID")
    public void theRequestedDataReturnedByID() {
        RequestSpecification request = getDriver();
        Response response = request.when().get("/user/60d0fe4f5311236168a109ca");
        response.then().log().all().assertThat().statusCode(200);


        String responseBody = response.getBody().asString();


        Assert.assertTrue(responseBody.contains("Sara"));
    }
    @Test
    @When("user create a new user")
    public void userCreateANewUser() {
        String vals = "235317";
        Random random = new Random();
        int index = random.nextInt(vals.length());
        int od3 = vals.charAt(index);
        RequestSpecification request = getDriver();
        String firstName = "siti";
        String lastName = "woman";
        String email ="woman"+od3+"@gmail.com";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstName",firstName);
        jsonObject.put("lastName",lastName);
        jsonObject.put("email",email);
        Response response = request
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .when()
                .post("/user/create")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("firstName", Matchers.equalTo(firstName))
                .assertThat().body("lastName", Matchers.equalTo(lastName))
                .assertThat().body("email", Matchers.equalTo(email))
                .extract().response();

        userId = response.jsonPath().getString("id");
        System.out.println("User ID: " + userId);
    }

    @Test
    @Then("user created")
    public void userCreated() {
        RequestSpecification request = getDriver();
        Response response = request.when().get("/user/"+userId);
        response.then().log().all().assertThat().statusCode(200);


        String responseBody = response.getBody().asString();


        Assert.assertTrue(responseBody.contains("siti"));
    }
    @Test
    @When("update user data on ID")
    public void updateUserDataOnID() {
        RequestSpecification request = getDriver();
        String id = userId;
        String newName = "marlin";
        String fname = request.when().get("/user/"+userId).getBody().jsonPath().get("firstName");
        String lname = request.when().get("/user/"+userId).getBody().jsonPath().get("lastName");
        System.out.println("name before = "+lname);

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", id);
        bodyMap.put("firstName", fname);
        bodyMap.put("lastName", newName);
        JSONObject jsonObject = new JSONObject(bodyMap);

        request.log().all()
                .header("Content-Type","application/json")
                .body(jsonObject.toString())
                .put("/user/"+userId)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("lastName", Matchers.equalTo(newName));
    }
    @Test
    @Then("user data Updated")
    public void userDataUpdated() {
        RequestSpecification request = getDriver();
        Response response = request.when().get("/user/"+userId);
        response.then().log().all().assertThat().statusCode(200)
                .assertThat().body("lastName", Matchers.equalTo("marlin"));
    }

    @Test
    @When("delete user by id")
    public void deleteUserById() {
        RequestSpecification request = getDriver();
        request.log().all()
                .when().delete("/user/"+userId)
                .then().log().all()
                .assertThat().statusCode(200);

    }
    @Test
    @Then("user deleted")
    public void userDeleted() {
        RequestSpecification request = getDriver();
        Response response = request.when().get("/user/"+userId);
        response.then().log().all().assertThat().statusCode(404);
    }
    @Test
    @When("user want to get list of tags")
    public void userWantToGetListOfTags() {
        RequestSpecification request = getDriver();
        request.when().get("/tag");
    }
    @Test
    @Then("user get tag list")
    public void userGetTagList() {
        RequestSpecification request = getDriver();
        Response response = request.when().get("/tag");
        response.then().log().all().assertThat().statusCode(200);


        String responseBody = response.getBody().asString();


        Assert.assertTrue(responseBody.contains("data"));
    }


}
