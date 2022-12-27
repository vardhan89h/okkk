package instal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_til_URL {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		String tittle = driver.getTitle();
		System.out.println(tittle);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.close();
	}

}
