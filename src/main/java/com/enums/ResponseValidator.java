package com.enums;

import io.restassured.RestAssured;

public class ResponseValidator {
    public void validateResponse(HttpStatusEnum expectedStatus, String responseBody) {
        int actualStatus = RestAssured.given().get("/api/test").then()
                .statusCode(expectedStatus.getCode()).extract().statusCode();
        if (actualStatus != expectedStatus.getCode()) {
            throw new AssertionError("Expected "+expectedStatus+" but got "+actualStatus);
        }
    }
}
