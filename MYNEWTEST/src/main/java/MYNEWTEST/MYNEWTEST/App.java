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
		// System.out.println( "Hello World!" );
		System.setProperty("webdriver.chrome.driver","\\usr\\bin\\chromedriver\\chromedriver.exe");
				"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://34.67.212.0:8004/index.php");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='About Us']")).click();
		String exp = driver.findElement(By.cssSelector("p")).getText();
		// String exp = driver.findElement(By.cssSelector("p")).getText();

		// "//*[@id='mp-tfa']/p"

		String body = driver.findElement(By.tagName("body")).getText();
		// String title1 =
		// driver.findElement(By.xpath("//*[@id=\"PID-ab2-pg\"]")).getText();
		// String title2 = driver.findElement(By.xpath("/html/body/p[2]")).getText();
		String Expected = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

		// It is a long established fact that a reader will be distracted by the
		// readable content of a page when looking at its layout. The point of using
		// Lorem Ipsum is that it has a more-or-less normal distribution of letters, as
		// opposed to using 'Content here, content here', making it look like readable
		// English. Many desktop publishing packages and web page editors now use Lorem
		// Ipsum as their default model text, and a search for 'lorem ipsum' will
		// uncover many web sites still in their infancy. Various versions have evolved
		// over the years, sometimes by accident, sometimes on purpose (injected humour
		// and the like).";

		System.out.println(exp);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(body);
		if (Expected.equalsIgnoreCase(body)) {
			System.out.println("Success");

		} else {
			System.out.println("Failed");
		}
		driver.close();

	}
}
