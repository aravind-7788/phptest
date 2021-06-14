package MYNEWTEST.MYNEWTEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\\usr\\bin\\chromedriver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.get("http://34.67.212.0:8004/index.php");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='About Us']")).click();
		String exp = driver.findElement(By.cssSelector("p")).getText();
		
		String body = driver.findElement(By.tagName("body")).getText();
		
		String expected = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

		
		System.out.println(exp);
		logger.log("-------------------------------------------------------------------------------------------------------");
		System.out.println(body);
		if (expected.equalsIgnoreCase(body)) {
			
		           logger.log("Success");

		} else {
			  logger.log("Failed");
		}
		driver.close();

	}
}
