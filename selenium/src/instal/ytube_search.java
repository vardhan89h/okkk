package instal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ytube_search {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("rrr");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("h3[class='title-and-badge style-scope ytd-video-renderer']")).click();
		Thread.sleep(2000);
		//driver.quit();
		
		
		

		
	}

}
