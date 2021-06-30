package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	//Launch Browser
	public static void launchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}


	//		Launch url
	public static void launchUrl(String url) 
	{
		driver.get(url);
	}

	//		Get Current Url
	public static String getUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}

	//			Get Current Title 
	public static String getTitle() 
	{
		String title = driver.getCurrentUrl();
		return title;
	}

	//		Quit Browser
	public static void quitBrowser() 
	{
		driver.quit();
	}

	//		Close Browser
	public static void closeBrowser() 
	{
		driver.close();
	}

	//		Find Element
	public static WebElement findElementById(String id) 
	{
		return driver.findElement(By.id(id));
	}
	public static WebElement findElementByName(String name) 
	{
		return driver.findElement(By.name(name));
	}
	public static WebElement findElementByXpath(String xpath) 
	{
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement findElementByClassName(String ClassName) 
	{
		return driver.findElement(By.className(ClassName));
	}
	public static WebElement findElementByTagName(String tagName) 
	{
		return driver.findElement(By.tagName(tagName));
	}

	//		Fill Text Box
	public static void fillTextBox(WebElement e,String value)
	{
		e.sendKeys(value);
	}

	//		Button Click
	public static void btnClick(WebElement e) 
	{
		e.click();
	}

	//		Get Text
	public static String getText(WebElement e) 
	{
		String s= e.getText();
		return s;
	}

	//		Get Attribute
	public static String getAttribute(WebElement e) 
	{
		return e.getAttribute("value");
	}

	//		Move To Element
	public static void moveToElement(WebElement target)
	{
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}

	//		Drag And Drop 
	public static void dragAndDrop(WebElement source,WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	//		Context Click
	public static void contextClick(WebElement target)
	{
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
	}

	//		Double Click
	public static void doubleClick(WebElement target)
	{
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}

	//		Alert
	public static void acceptAlert() 
	{
		Alert sa=driver.switchTo().alert();
		sa.accept();
	}
	public static void dismissAlert() 
	{
		Alert ca=driver.switchTo().alert();
		ca.dismiss();
	}
	public static void textAlert(String text) 
	{
		Alert pa=driver.switchTo().alert();
		pa.sendKeys(text);
		pa.accept();
	}


	//		select by 
	//		index
	public static void selectByIndex(WebElement e,int index) 
	{
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	//		value
	public static void selectByValue(WebElement e,String value) 
	{
		Select s=new Select(e);
		s.selectByValue(value);
	}
	//		VisibleText
	public static void selectByVisibletext(WebElement e,String value) 
	{
		Select s=new Select(e);
		s.selectByVisibleText(value);
	}

	//		deselect by
	//		index
	public static void deselectByIndex(WebElement e,int index) 
	{
		Select s=new Select(e);
		s.deselectByIndex(index);
	}
	//		value
	public static void deselectByValue(WebElement e,String value) 
	{
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	//		VisibleText
	public static void deselectByVisibletext(WebElement e,String value) 
	{
		Select s=new Select(e);
		s.deselectByVisibleText(value);
	}

	//		Get All Option
	public static void getAllOption(WebElement e) 
	{
		Select s=new Select(e);
		List<WebElement> op = s.getOptions();
		for (WebElement eachOption : op) {
			String text= eachOption.getText();
			System.out.println(text);
		}
	}

	//		Get All Selected Option
	public static void getAllSelectedOption(WebElement e) 
	{
		Select s=new Select(e);
		List<WebElement> allSelect = s.getAllSelectedOptions();
		for (WebElement as : allSelect) {
			String text= as.getText();
			System.out.println(text);
		}
	}

	//		is multiple
	public static boolean isMultiple(WebElement e)
	{
		Select s=new Select(e);
		boolean tt= s.isMultiple();
		return tt;
	}

	//		First Selected Option
	public static String firstSelectOption(WebElement e) 
	{
		Select s=new Select(e);
		WebElement first = s.getFirstSelectedOption();
		String text = first.getText();
		return text;
	}

	//		Is Displayed
	public static Boolean isDisplayed(WebElement e) 
	{
		boolean d= e.isDisplayed();
		return d;
	}

	//		Is Enabled
	public static Boolean isEnabled(WebElement e) 
	{
		boolean en= e.isEnabled();
		return en;
	}

	//		Is Selected
	public static Boolean isSelected(WebElement e) 
	{
		boolean s= e.isSelected();
		return s;
	}



	//		JavaScriptExecutor
	//		Scroll Down
	public static void scrollDown(WebElement e) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	//		Scoll Up
	public static void scrollUp(WebElement e) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}

	//		Insert value or Sendkeys by JavaScriptExecutor
	public static void FillUpByJSE(WebElement e,String v) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+v+"')", e);	
	}

	//		Get Text by JavaScriptExecutor
	public static String getTextByJSE(WebElement e) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object obj = js.executeScript("return arguments[0].innerText", e);
		String s=(String)obj;
		return s;
	}

	//		Get Attribute by JavaScriptExecutor
	public static String getAttributeByJSE(WebElement e) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=(String)obj;
		return s;

	}

	//		Button Click by JavaScriptExecutor 
	public static void btnClickByJSE(WebElement e) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);	
	}

	//		WindowsHandling
	public static void switchWindows(int index) 
	{
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		List<String> li = new LinkedList<>();
		li.addAll(allId);
		String id = li.get(index);
		driver.switchTo().window(id);
	}

	//		Frames
	public static void framesByIndex(int i)
	{
		driver.switchTo().frame(i);
	}
	public static void framesByString(String name)
	{
		driver.switchTo().frame(name);
	}
	public static void framesByWebelement(WebElement e)
	{
		driver.switchTo().frame(e);
	}

	//		maximize
	public static void maximize()
	{
		driver.manage().window().maximize();
	}

	//		wait
	public static void wait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	//		getData from Xlsx
	public static String getdata(String sheetName,int rowno,int cellno) throws IOException 
	{
		File loc= new File("C:\\Users\\Arun2\\eclipse-workspace\\MavenJunit\\src\\test\\resources\\Excel\\Excel.xlsx");
		//			file Input Stream
		FileInputStream st=new FileInputStream(loc);
		//			Workbook
		Workbook w=new XSSFWorkbook(st);
		//			Sheet 
		Sheet s = w.getSheet(sheetName);
		//			row
		Row r = s.getRow(rowno);
		//			cell
		Cell c = r.getCell(cellno);
		//			cell Type
		int type = c.getCellType();
		String value=null;
		if(type==1)
		{
			value = c.getStringCellValue();

		}
		else
		{
			if(DateUtil.isCellDateFormatted(c))
			{
				Date date = c.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd-mmm-yyyy");
				value = sf.format(date);
			}
			else
			{
				double db = c.getNumericCellValue();
				long ln=(long)db;
				value = String.valueOf(ln);
			}
		}
		return value;	  

	}


	public static void getdate() 
	{
		Date d=new Date();
		System.out.println(d);
	}

	//	Url Assertion for Invalid login
	public static void urlAssertionForInvalidLogin()
	{
		WebElement adactinText = findElementByXpath("//b[contains(text(),'Invalid Login details')]");
		String text = adactinText.getText();
		Assert.assertTrue("Verify login", text.contains("Invalid Login"));

	}

	//	Assertion For Valid Login
	public static void assertionForValidLogin()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue("Successful", url.contains("SearchHotel"));
	}

	//	Assertion For Invalid Login Without Entering Credentials
	public static void assertionForInvalidLoginWithoutEnteringCredentials() {
		WebElement text = findElementByXpath("//span[text()='Enter Username']");
		String txt = text.getText();
		Assert.assertTrue("Verify login", txt.contains("Enter"));
	}

	//	Take ScreenShot	
	public static void takeScreenshot(String imgName) throws IOException 
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File des = new File("C:\\Users\\Arun2\\eclipse-workspace\\MavenCucumberAdactin\\src\\test\\resources\\Reports\\Screenshots\\"+imgName+"_"+timestamp+".png");
		FileUtils.copyFile(src, des);
	}





}
