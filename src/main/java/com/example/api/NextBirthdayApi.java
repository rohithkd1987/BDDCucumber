package com.example.api;

import static io.restassured.RestAssured.given;

public class NextBirthdayApi {
    private static final String BASE_URL = "https://lx8ssktxx9.execute-api.eu-west-1.amazonaws.com/Prod/next-birthday";

    public static String getTimeLeft(String dateOfBirth, String unit) {
        return given()
                .queryParam("dateofbirth", dateOfBirth)
                .queryParam("unit", unit)
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getString("message");
    }
}
