package org.objectrepository;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass
 {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	public WebElement location;

	@FindBy(id = "hotels")
	public WebElement hotels;

	@FindBy(id = "room_type")
	public WebElement roomType;

	@FindBy(id = "room_nos")
	public WebElement noOfRooms;

	@FindBy(id = "adult_room")
	public WebElement adults;

	@FindBy(id = "child_room")
	public WebElement childrens;

	@FindBy(id = "Submit")
	public WebElement search;

	@FindBy(id = "radiobutton_0")
	public WebElement select;

	@FindBy(id = "continue")
	public WebElement cont;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildrens() {
		return childrens;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
}
