package com.sharepoint.qa.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;


public class practise {

	public static void main(String[] args)
			throws InterruptedException, MalformedURLException, IOException, ParseException {

//		WebDriver driver = new InternetExplorerDriver();
		
		HttpURLConnection huc = null;
		try {
			huc = (HttpURLConnection) (new URL("http://nuk-d3-vapp034:9999/Bid%20List/20191105170032").openConnection());
//			huc = (HttpURLConnection) (new URL("http://jigar.mehta1:Mumbai21%40!@nuk-d3-vapp034:9999/Bid%20List/Forms/StandardSecurityView.aspx").openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
		} catch (Exception e) {
			e.printStackTrace();

		}

	
			int responsecode = 0;
			try {
				responsecode = huc.getResponseCode();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("responsecode = " + responsecode);
			if (responsecode == 200) {
	
				Thread.sleep(5000);
//				driver.navigate().to(bidlisturl);

			}
			Thread.sleep(1000);
		


/*		String nextDayDate = "";
		
		LocalDate date = LocalDate.now();
		date = date.plusDays(1);
		org.joda.time.format.DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
		nextDayDate = date.toString(fmt);
		System.out.println(nextDayDate);
*/	
		System.exit(0);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("http://tc3-v-devsp06:9999/SitePages/Home.aspx");

		driver.findElement(By.xpath("//a[@title='Bid List']")).click();

		Thread.sleep(10000);

		List<WebElement> commandbaritems = driver.findElements(By.className("CommandBarItem-commandText"));

		for (int i = 0; i < commandbaritems.size(); i++) {
			System.out.println(commandbaritems.get(i).getText());
			if (commandbaritems.get(i).getText().trim().equals("New")) {
				commandbaritems.get(i).click();
			}
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'Create New Bid')]")).click();

		Thread.sleep(20000);

		driver.findElement(By.xpath("//input[@title='Name Required Field']")).sendKeys("Name1");
		;
		driver.findElement(By.xpath("//input[@title='Bid Title']")).sendKeys("Bid Title 1");
		driver.findElement(By.xpath("//input[@title='Client Name Required Field']")).sendKeys("Client Name 1");
		;

		Select bideventtype = new Select(
				driver.findElement(By.xpath("//select[@title='Bid Event Type Required Field']")));
		bideventtype.selectByVisibleText("BAFO");

		Select bidmanager = new Select(driver.findElement(By.xpath("//select[@id='DropdownNr1']")));
		bidmanager.selectByVisibleText("Charlotte Scott");

		Select saleslead = new Select(driver.findElement(By.xpath("//select[@id='DropdownNr2']")));
		saleslead.selectByVisibleText("Alan Campbell");

		driver.findElement(By.xpath("//input[@title='Submission Date Required Field']")).sendKeys("25/09/2019");
		;

		Select sensitivitylevel = new Select(
				driver.findElement(By.xpath("//select[@title='Sensitivity level Required Field']")));
		sensitivitylevel.selectByVisibleText("Restricted Access");

		driver.findElement(By.xpath("//textarea[@title='Notes']")).sendKeys("Notes 1");

		driver.findElement(By.xpath("//textarea[@title='Security clearance requirements Required Field']"))
				.sendKeys("Security clearance requirements 1");

		driver.findElement(By.xpath("//textarea[@title='Submission instructions Required Field']"))
				.sendKeys("Submission instructions 1");

		driver.findElement(By.xpath("//input[@title='CRM ID']")).sendKeys("CRMID1 ");

		// span[@class='CommandBarItem-commandText']

//		String url = "http://nuk-d3-vapp034:9999/Bid%20List/Forms/StandardSecurityView.aspx";
//		String url = "http://nuk-d3-vapp034:9999/Bid%20List/20190917124441";
//		String username = "jigar.mehta1";
//		String password = "Mumbai20@)";

//		String expectedURL = "http://nuk-d3-vapp034:9999/Bid%20List/Forms/StandardSecurityView.aspx";
//		String expectedURL = "http://jigar.mehta1:Mumbai20@)@nuk-d3-vapp034:9999/Bid%20List/Forms/StandardSecurityView.aspx";
//		String[] splitstring = expectedURL.split("//");
//		System.out.println(splitstring[0]);
//		System.out.println(splitstring[1]);
//		expectedURL.split("/Forms/StandardSecurityView.aspx");

//		String newbidurl = splitstring[0] +  "20190919193042";
//		System.out.println(newbidurl);
//		System.out.println(splitstring[\1]);

		/*
		 * HttpURLConnection huc = (HttpURLConnection)(new
		 * URL(newbidurl).openConnection()); huc.setRequestMethod("HEAD");
		 * huc.connect(); int responsecode = huc.getResponseCode();
		 * System.out.println("responsecode = " + responsecode);
		 */

		/*
		 * String sample = "boo:and:foo"; String[] samplesplit = sample.split(":");
		 * System.out.println(samplesplit[0].toString());
		 */
		/*
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 * LocalDateTime now = LocalDateTime.now(); System.out.println(dtf.format(now));
		 */

//		WebDriver driver = new InternetExplorerDriver();

//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();

//		driver.navigate().to("http://jigar.mehta1:Mumbai20@)@nuk-d3-vapp034:9999/Bid%20List/Forms/StandardSecurityView.aspx");

//		driver.navigate().to("http://nuk-d3-vapp034:9999/Bid%20List/Forms/StandardSecurityView.aspx");
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("jigar.mehta1");

		/*
		 * driver.findElement(By.xpath("//a[@title='Create New Bid']")).click();
		 * Thread.sleep(2000); WebElement frame =
		 * driver.findElement(By.xpath("//iframe[@class='ms-dlgFrame']"));
		 * driver.switchTo().frame(frame);
		 * 
		 * Select bidmanager = new
		 * Select(driver.findElement(By.xpath("(//span[@dir='none']/select)[2]")));
		 * bidmanager.selectByVisibleText("Jigar Mehta");
		 */
//		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@title='Bid Event Type Required Field']/option"));
//		System.out.println(dropdown);

//		List<WebElement> bidmanager = driver.findElements(By.xpath("//span[@dir='none']/select"));

//		for (int i = 0; i < bidmanager.size(); i++) {
//			System.out.println(bidmanager.get(i).getText());
//		}
	}

}
