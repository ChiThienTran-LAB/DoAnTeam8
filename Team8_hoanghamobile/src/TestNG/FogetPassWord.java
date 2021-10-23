package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNG.Listener.class)
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
		String kq_mongdoi = "Email Chuabietcode@gmail.com chưa được đăng ký, vui lòng chọn email khác hoặc thực hiện đăng ký tài khoản";
		String kq_thucte = error.getText();
		boolean kq;
		kq = kq_thucte.equals(kq_mongdoi);
		System.out.println("Kết quả Test case:"+kq);
	
	}
	@Test (priority = 9, enabled = false)
	public static void FP_02() {
		driver.findElement(By.xpath("//a[@id=\"login-modal\"]")).click(); //tắt qc
		driver.findElement(By.xpath("//a[@class=\"ajax-content\"]")).click(); //click quên mk
		driver.findElement(By.xpath("//div[@id=\"close-button-1545222288830\"]")).click(); //tắt q.c l2
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"just-center\"]/p"));
		boolean kq;
		String kq_thucte = error.getText();
		String kq_mongdoi = "Nhập địa chỉ email đăng ký để khởi tạo lại mật khẩu.Bạn phải nhập email";
		kq = kq_mongdoi.equals(kq_thucte);
		System.out.println("Kết quả: "+ kq);
		
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
