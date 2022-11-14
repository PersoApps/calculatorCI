package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {
	
	public static void main (String args[]) {
		System.out.println("Execute selenium test");

		WebDriver safariDriver = new SafariDriver();
		safariDriver.get("https://selenium.dev");
		safariDriver.get("http://youtube.com");
		
		WebElement element = safariDriver.findElement(By.name("search_query"));
		element.sendKeys("Selenium Automation");
		safariDriver.findElement(By.id("search-icon-legacy")).click();
		
		safariDriver.get("http://www.google.com");
		safariDriver.findElement(By.name("q")).sendKeys("selenium"+Keys.RETURN);

		
	}

}
