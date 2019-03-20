package gitted;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class baidu {

	@Test
	public void openfirefox() throws InterruptedException {
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		String url2="https://www.baidu.com";
		driver.get(url2);
		WebElement inputbox=driver.findElement(By.id("kw"));
		Thread.sleep(1000);
		inputbox.sendKeys("selenium");
		WebElement buton=driver.findElement(By.id("su"));
		buton.click();
 }
}
