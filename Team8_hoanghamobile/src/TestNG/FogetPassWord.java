package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FogetPassWord extends Astractclass {
	@Test (groups = "forget password", priority = 8)
	public static void FP_01() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		nhap_email.sendKeys("Chuabietcode@gmail.com");
		WebElement error = driver.findElement(By.xpath("//div[@class=\"form-erros\"]/p/strong"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+ error.getText());
	}
	@Test (groups = "forget password",priority = 9)
	public static void FP_02() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"just-center\"]/p"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+ error.getText());
	}
	@Test (groups = "forget password", priority = 10)
	public static void FP_03() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		nhap_email.sendKeys("chithien3203.vk.1718@gmail.com");
		WebElement error = driver.findElement(By.xpath("//div[@class=\"block-content block-content-full block-content-narrow\"]/p"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+ error.getText());
	}
}
