package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LG_test extends Astractclass {
	
	@Test (priority = 1)
	public static void LG01_test() //LG01 là login fail
	{
		String UserName = "Tester1";
		String Password = "12345qqq";
		WebElement login_click = driver.findElement(By.xpath("//a[text()='Đăng nhập']"));
		login_click.click();
		WebElement user_name = driver.findElement(By.xpath("//input[@id='UserName']"));
		user_name.clear();
		user_name.sendKeys(UserName);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.clear();
		pass.sendKeys(Password);
		WebElement btn_login = driver.findElement(By.xpath("//button[@class='btn btn-submit']"));
		btn_login.click();
		WebElement ket_qua = driver.findElement(By.xpath("//div[@class='internal']/div"));
		String text_kq = ket_qua.getText();
		System.out.println("Dang nhap that bai do: " +'\n'+text_kq);
		
	}
	@Test (priority = 2)
	public static void close_noti() {
		WebElement close =driver.findElement(By.xpath("//div[@class='ins-web-smart-recommender-main-wrapper']/div/div[@class='ins-selectable-element ins-element-wrap ins-element-close-button']"));
		close.click();
	}
	@Test (priority = 3)
	public static void LG2_test() //LG02 là login true
	{
		String UserName = "TranChiThien";
		String Password = "0964253892";
		//xpath //div[@class='container modal']//div[@class='internal']/form/div[@class='row'][1]/div[2]/input
		WebElement user_name = driver.findElement(By.xpath("//input[@id='UserName']"));
		user_name.clear();
		user_name.sendKeys(UserName);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.clear();
		pass.sendKeys(Password);
		WebElement btn_login = driver.findElement(By.xpath("//button[@class='btn btn-submit']"));
		btn_login.click();	
	}
}
