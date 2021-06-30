package org.objectrepository;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	public BookHotel() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "first_name")
	public WebElement firstName;

	@FindBy(id = "last_name")
	public WebElement lastName;

	@FindBy(id = "address")
	public WebElement address;

	@FindBy(id = "cc_num")
	public WebElement creditNo;

	@FindBy(id = "cc_type")
	public WebElement cardType;

	@FindBy(id = "cc_exp_month")
	public WebElement month;

	@FindBy(id = "cc_exp_year")
	public WebElement year;

	@FindBy(id = "cc_cvv")
	public WebElement cvvNo;

	@FindBy(id = "book_now")
	public WebElement bookNow;
	
	@FindBy(id="order_no")
	 public WebElement orderNo;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditNo() {
		return creditNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}


}
