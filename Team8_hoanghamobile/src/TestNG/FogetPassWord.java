package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FogetPassWord extends Astractclass {
	@Test (priority = 8)
	public static void FP_01() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		nhap_email.sendKeys("Chuabietcode@gmail.com");
		driver.findElement(By.xpath("//div[@id=\"close-button-1545222288830\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]")).click();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"form-erros\"]/p/strong"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+ error.getText());
	}
	@Test (priority = 9)
	public static void FP_02() {
		driver.findElement(By.xpath("//a[@id=\"login-modal\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"ajax-content\"]")).click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"just-center\"]/p"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+ error.getText());
	}
	@Test (priority = 10,enabled = false)
	public static void FP_03() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		nhap_email.sendKeys("chithien3203.vk.1718@gmail.com");
		driver.findElement(By.xpath("//div[@id=\"close-button-1545222288830\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]")).click();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"block-content block-content-full block-content-narrow\"]/p"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+ error.getText());
	}
}
