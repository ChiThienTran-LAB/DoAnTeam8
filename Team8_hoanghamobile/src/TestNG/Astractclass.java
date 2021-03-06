package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Astractclass {
	//Step: Start Web
		public String baseUrl = "https://hoanghamobile.com/";
		public String driverPath ="D:\\chrome\\chromedriver.exe";
		public String webdriver = "webdriver.chrome.driver";
		public static WebDriver driver;
		
		@BeforeTest
		public void before() {
			System.setProperty(webdriver,driverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.manage().window().maximize();
			WebElement qc = driver.findElement(By.xpath("//a[@href=\"#close-modal\"]"));
			qc.click();
			WebElement dn = driver.findElement(By.xpath("//a[text()='Đăng nhập']"));
			dn.click();
		}
		
		@AfterTest
		public void afterTest() {
			driver.close();
		}
}
