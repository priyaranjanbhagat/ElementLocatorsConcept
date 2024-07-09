package ElementLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {

		/*
		 * CSS Selector 1. Using Class name -> tagName.className -> button.signInBtn 2.
		 * Using ID -> tagName#id -> input#inputUsername 3. TagName[attribute='value']
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("priyaranjan");
		driver.findElement(By.name("inputPassword")).sendKeys("pass123");
		driver.findElement(By.className("submit")).click();

		String errorText = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("Error text is : " + errorText );

		driver.close();

	}

}
