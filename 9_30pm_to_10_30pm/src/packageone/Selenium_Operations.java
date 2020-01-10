package packageone;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_Operations extends Globals{
	
	//how to intialize webdriver
	
	WebDriver driver = new FirefoxDriver();
	
	By StudentName = By.id("input_9_1");
	By StudentMailId = By.id("input_9_2");
	By StudentPhoneNumber = By.xpath("//*[@id='input_9_3']");
	By StudentModeOfTraining = By.name("input_5");
	By StudentState = By.xpath("//input[@id='input_9_16']");
	By SubmitButton = By.id("gform_submit_button_9");
	By HeaderError = By.xpath("//form[@id='gform_9']/div[2]");
	By FieldError = By.xpath("//li[@id='field_9_15']/div[2]");
	
	@Test
	public void Student_Enrollment() throws InterruptedException{
		driver.findElement(StudentName).sendKeys(DataMap.get("Student_Name"));
		Thread.sleep(2000);
		driver.findElement(StudentMailId).sendKeys(DataMap.get("Student_Email_Id"));
		Thread.sleep(2000);
		driver.findElement(StudentPhoneNumber).sendKeys(DataMap.get("Student_Phone"));
		Thread.sleep(2000);
		
		WebElement Mode_Of_Training = driver.findElement(StudentModeOfTraining);
		Select MOT = new Select(Mode_Of_Training);
		MOT.selectByVisibleText(DataMap.get("Student_Mode_Training"));
		Thread.sleep(2000);
		
		driver.findElement(StudentState).sendKeys(DataMap.get("Student_State"));
		
		//driver.findElement(By.id("gform_submit_button_9")).click();
		driver.findElement(SubmitButton).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		String Error_Header = driver.findElement(HeaderError).getText();
		System.out.println(Error_Header);
		if(Error_Header.equals("There was a problem with your submission. Errors have been highlighted below.")){
			System.out.println("Error message at header is displayed correcty");
		}else{
			System.out.println("Error mssage at header is not displayed correctly");
		}
		
		String Error_at_Field = driver.findElement(FieldError).getText();
		System.out.println(Error_at_Field);
		if(Error_at_Field.equals("This field is required.")){
			System.out.println("Error message at field is displayed correctly ");
		}else{
			System.out.println("Error message at field is not displayed correctly");
		}
		
		
	}
	
	@AfterTest
	public void Browser_Close(){
		driver.quit();
	}

	
	@BeforeTest
	public void Navigation() throws InterruptedException{
		//driver.navigate().to("https://twitter.com/");
		//driver.get("https://nareshit.in/");
		driver.get("https://nareshit.in/course-schedule/");
		//driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		//driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		//driver.navigate().to("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		Thread.sleep(8000);
	}
	
	public void Screenshot() throws IOException{
		TakesScreenshot TSS = ((TakesScreenshot)driver);
		File Screenshot = TSS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("C:/Users/Satish/workspace/9_30pm_to_10_30pm/Screen_Shots/Nareshit.png"));
	}
	
	public void WindowsHandle() throws InterruptedException{
		
		String Current_Window = driver.getWindowHandle();
		
		LinkedList<String> Windows = new LinkedList<String>();
		Windows.addAll(driver.getWindowHandles());
		
		driver.switchTo().window(Windows.get(1));
		String value = driver.findElement(By.xpath("//h1[text()='Core Java Training']")).getText();
		System.out.println(value);
		
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Current_Window);
		
		driver.quit();
		
	}
	
	
	public void PopUp() throws InterruptedException{
		
		driver.findElement(By.xpath("(//span[@class='css-901oao css-16my406 r-1qd0xha r-ad9z0x r-bcqeeo r-qvutc0'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).sendKeys("TestUser");
	}
	
	public void WebTable() throws InterruptedException{
		
		List<WebElement> Courses = driver.findElements(By.xpath("//*[@id='tablepress-37']/tbody/tr/td[1]/b/a"));
		LinkedList<String> Before_sort = new LinkedList<String>();
		
		for(int i=0;i<Courses.size();i++){
			String value = Courses.get(i).getText();
			Before_sort.add(value);
		}
		
		System.out.println(Before_sort);
		
		driver.findElement(By.xpath("//*[@id='tablepress-37']/thead/tr/th[1]")).click();
		Thread.sleep(2000);
		
		List<WebElement> Element_After_Sort = driver.findElements(By.xpath("//*[@id='tablepress-37']/tbody/tr/td[1]/b/a"));
		LinkedList<String> After_Sort = new LinkedList<String>();
		
		for(int i=0;i<Element_After_Sort.size();i++){
			String value = Element_After_Sort.get(i).getText();
			After_Sort.add(value);
		}
		
		System.out.println("After sorting the list from the application"+After_Sort);
		
		Collections.sort(Before_sort);
		System.out.println("Before_sort"+Before_sort);
		boolean flag = true;
		for(int i=0;i<After_Sort.size();i++){
			if(Before_sort.get(i).equals(After_Sort.get(i))){
				continue;
			}else{
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Testcase passed");
		}else{
			System.out.println("Testcase failed");
		}
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("CORE JAVA");
		Thread.sleep(2000);
		
		List<WebElement> Faculty_COREJAVA= driver.findElements(By.xpath("//*[@id='tablepress-37']/tbody/tr/td[2]"));
		LinkedList<String> Faculty_Core_Java = new LinkedList<String>();
		
		for(int i=0;i<Faculty_COREJAVA.size();i++){
			String value = Faculty_COREJAVA.get(i).getText();
			Faculty_Core_Java.add(value);
		}
		System.out.println(Faculty_Core_Java);
		
		driver.findElement(By.xpath("//td[text()='Mr. Srinivas']/../td[1]/b/a")).click();
		Thread.sleep(8000);
	}
	
	public void Mouse_Hover() throws InterruptedException{
		WebElement to = driver.findElement(By.xpath("//span[text()='New Batches']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(to);
		act.perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='New Batches – Hyderabad']")).click();
	}
	
	public void Drag_Drop(){
		WebElement From = driver.findElement(By.xpath("//*[@id='block-3']/h1"));
		WebElement To = driver.findElement(By.xpath("//*[@id='block-2']/h1"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(From, To);
		act.perform();
	}
	
	public void RadioButton() throws InterruptedException{
		
		driver.findElement(By.xpath("(//label[text()='Female'])[2]")).click();
		String Gender_Label = driver.findElement(By.xpath("(//label[text()='Female'])[2]/input")).getAttribute("value");
		System.out.println(Gender_Label);
		driver.findElement(By.xpath("//label[text()='0 to 5']")).click();
		String Age = driver.findElement(By.xpath("//label[text()='0 to 5']/input")).getAttribute("value");
		System.out.println(Age);
		driver.findElement(By.xpath("//button[text()='Get values']")).click();
		Thread.sleep(4000);
		
	    String  Value = driver.findElement(By.xpath("//p[text()='Sex : Female']")).getText();
	    System.out.println(Value);
		if(Value.contains(Gender_Label)&&Value.contains(Age)){
			System.out.println("Test case passed");
		}else{
			System.out.println("Testcase failed.");
		}
	}
	
	public void Checkbox() throws InterruptedException{
		driver.findElement(By.xpath("//*[text()='Option 2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Option 3']")).click();
		Thread.sleep(2000);
		String Before_click =driver.findElement(By.id("check1")).getAttribute("value");
		System.out.println(Before_click);
		driver.findElement(By.id("check1")).click();
		String After_click = driver.findElement(By.id("check1")).getAttribute("value");
		System.out.println(After_click);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
