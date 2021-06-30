package org.stepdefinition;

import org.base.BaseClass;
import org.objectrepository.BookHotel;
import org.objectrepository.LoginPojo;
import org.objectrepository.SearchHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSteps extends BaseClass {
	
	
	@Given("User enter {string} and {string} and click Login")
	public void user_enter_and_and_click_Login(String user, String pass) {
		LoginPojo p=new LoginPojo();
		fillTextBox(p.gettxtUserName(), user);
		fillTextBox(p.gettxtPassword(), pass);
		btnClick(p.getbtnLogin());
	    
	}

	@When("User is in Search page, user enter details for Search hotel")
	public void user_is_in_Search_page_user_enter_details_for_Search_hotel() throws InterruptedException {
		SearchHotel s=new SearchHotel();
	    selectByVisibletext(s.getLocation(), "London");
	    selectByVisibletext(s.getHotels(), "Hotel Sunshine");
	    selectByValue(s.getRoomType(), "Deluxe");
	    selectByValue(s.getNoOfRooms(), "3");
	    selectByVisibletext(s.getAdults(), "2 - Two");
	    selectByVisibletext(s.getChildrens(), "1 - One");
	    Thread.sleep(3000);
	    btnClick(s.getSearch());
	    
	}

	@When("User click Search button")
	public void user_click_Search_button() throws InterruptedException {
		SearchHotel s1=new SearchHotel();
		 btnClick(s1.getSelect());
	      Thread.sleep(2000);
	      btnClick(s1.getCont());
	    
	}

	@Then("user book the hotel by filling details {string},{string}and{string}")
	public void user_book_the_hotel_by_filling_details_and(String fname, String lname, String add) {
		BookHotel b=new BookHotel();
		fillTextBox(b.getFirstName(), fname);
		fillTextBox(b.getLastName(), lname);
		fillTextBox(b.getAddress(), add);
    }

	@Then("user pay the amount using {string} and {string}")
	public void user_pay_the_amount_using_and(String creditno, String cvv) throws InterruptedException {
		BookHotel b1=new BookHotel();
		fillTextBox(b1.getCreditNo(), creditno);
	    fillTextBox(b1.getCardType(), "AMEX");
	    fillTextBox(b1.getMonth(), "December");
	    fillTextBox(b1.getYear(), "2022");
	    Thread.sleep(2000);
	    fillTextBox(b1.getCvvNo(), cvv);
	    
	}

	@Then("User click bookNow button and id number is generated")
	public void user_click_bookNow_button_and_id_number_is_generated() throws InterruptedException {
		BookHotel b2=new BookHotel();
		btnClick(b2.getBookNow());
	    Thread.sleep(7000);
	    System.out.println("Order no = "+getAttribute(b2.getOrderNo()));
	    
	}



}
