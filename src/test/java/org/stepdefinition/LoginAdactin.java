package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.objectrepository.LoginPojo;
import org.objectrepository.SearchHotel;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAdactin extends BaseClass {

	public SearchHotel s;

	@Given("User is in Adactin login page")
	public void user_is_in_Adactin_login_page() {
		launchUrl("https://adactinhotelapp.com/");
	}

	@When("User enter Login button")
	public void user_enter_Login_button() throws InterruptedException {
		LoginPojo l2 = new LoginPojo();
		btnClick(l2.getbtnLogin());
		Thread.sleep(3000);
	}

	@When("User enter valid Username and Password")
	public void user_enter_valid_Username_and_Password() {
		LoginPojo l3 = new LoginPojo();
		fillTextBox(l3.gettxtUserName(), "pavithra97");
		fillTextBox(l3.gettxtPassword(), "pavithra97");

	}

	@Then("User must displayed with Successful Login")
	public void User_must_displayed_with_Successful_Login() {
		assertionForValidLogin();
	}

	// @When("User enter invalid {string} and {string}")
	// public void user_enter_invalid_and(String user, String pass) {
	// LoginPojo l1=new LoginPojo();
	// fillTextBox(l1.txtusername, user);
	// fillTextBox(l1.txtpassword,pass);
	// }

	// @Then("User must validate the result based on {string}")
	// public void user_must_validate_the_result_based_on(String type) throws
	// InterruptedException {
	// if(type.equals("positive"))
	// {
	// assertionForValidLogin();
	// }
	// else if(type.equals("negative"))
	// {
	// urlAssertionForInvalidLogin();
	// Thread.sleep(3000);
	// }
	//
	// }
	//
	// @Then("User must displayed with Error Message")
	// public void user_must_displayed_with_Error_Message() throws
	// InterruptedException {
	// urlAssertionForInvalidLogin();
	// Thread.sleep(5000);
	// }

	// @Then("User must be in invalid Credential page")
	// public void user_must_be_in_invalid_Credential_page() throws
	// InterruptedException {
	// assertionForInvalidLoginWithoutEnteringCredentials();
	// Thread.sleep(3000);
	//
	// }

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable d) {
		// 1 Dimensional without Header
		// List<String> li=d.asList();
		// String user=li.get(0);
		// String pass=li.get(1);
		//
		//// 2 dimensional without Header
		//// List<List<String>> lists=d.asLists();
		//// List<String> li=lists.get(1);
		//// String user=li.get(0);
		//// String pass=li.get(1);
		//
		//// 1 Dimensional with Header
		Map<String, String> mp = d.asMap(String.class, String.class);
		String user = mp.get("username");
		String pass = mp.get("password");
		//
		// 2 Dimensional with header
		// List<Map<String,String>>maps=d.asMaps();
		// Map<String,String> mp=maps.get(2);
		// String user=mp.get("username");
		// String pass=mp.get("password");

		LoginPojo l1 = new LoginPojo();
		fillTextBox(l1.gettxtUserName(), user);
		fillTextBox(l1.gettxtPassword(), pass);
	}
}
