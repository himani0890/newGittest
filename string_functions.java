import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class string_functions {

	@Test
	public void ByVisibleElement() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/prateekkohli/Learning_JAVA/Selenium_Drivers/geckodriver");
		
		WebDriver driver= new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone charger");
		driver.findElement(By.className("nav-input")).click();
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.linkText("AmazonBasics Lightning to USB A Cable - MFi Certified iPhone Charger - White, 6-Foot, 2-Pack")).click();
		driver.findElement(By.id("priceblock_ourprice"));
		String price= "15.98";
		System.out.println("the price of an item is " +price );
		driver.close();
		
	}
}
