package ElementLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {
	
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("priyaranjan");
		driver.findElement(By.name("inputPassword")).sendKeys("pass123");
		driver.findElement(By.className("submit")).click();

		//cssSelector with class
		String errorText = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("Error text is : " + errorText );
		
		//linktext locators
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//xpath locators with unique attribute		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Priyaranjan Kumar");
		
		//cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@email.com");
		
		//xpath with index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//cssSelector with index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		
		//xpath with parent tagName and Child tagName
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		
		//cssSelector with .class 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//cssselector with parent child traverse
		String passText = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println("Reset password from paragraph : "+ passText);
		//driver.close();
		
	}
}
