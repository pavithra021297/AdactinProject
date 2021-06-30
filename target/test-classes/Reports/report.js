$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "To validate Login functionality.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginAdactin.user_is_in_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Login using Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User enter valid Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginAdactin.user_enter_valid_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginAdactin.user_enter_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must displayed with Successful Login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginAdactin.User_must_displayed_with_Successful_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Search.feature");
formatter.feature({
  "name": "To Validate Hotel functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate Hotel Booking functionality using valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is in Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" and click Login",
  "keyword": "And "
});
formatter.step({
  "name": "User is in Search page, user enter details for Search hotel",
  "keyword": "When "
});
formatter.step({
  "name": "User click Search button",
  "keyword": "And "
});
formatter.step({
  "name": "user book the hotel by filling details \"\u003cfirstname\u003e\",\"\u003clastname\u003e\"and\"\u003caddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user pay the amount using \"\u003ccc_num\u003e\" and \"\u003ccvv\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click bookNow button and id number is generated",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "firstname",
        "lastname",
        "address",
        "cc_num",
        "cvv"
      ]
    },
    {
      "cells": [
        "pavithra97",
        "pavithra97",
        "pavithra",
        "chandar",
        "chennai",
        "1234567887654321",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate Hotel Booking functionality using valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginAdactin.user_is_in_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"pavithra97\" and \"pavithra97\" and click Login",
  "keyword": "And "
});
formatter.match({
  "location": "BookSteps.user_enter_and_and_click_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in Search page, user enter details for Search hotel",
  "keyword": "When "
});
formatter.match({
  "location": "BookSteps.user_is_in_Search_page_user_enter_details_for_Search_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "BookSteps.user_click_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user book the hotel by filling details \"pavithra\",\"chandar\"and\"chennai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BookSteps.user_book_the_hotel_by_filling_details_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pay the amount using \"1234567887654321\" and \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookSteps.user_pay_the_amount_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click bookNow button and id number is generated",
  "keyword": "And "
});
formatter.match({
  "location": "BookSteps.user_click_bookNow_button_and_id_number_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});