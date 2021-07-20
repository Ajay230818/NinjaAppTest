package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void LoginTest(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("parthivajay123@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Ajay@098765");
	    driver.close();
	}
	@Test
	public void LoginTest1(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("parthjay123@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Ajay@098765");
	    Assert.fail("Test Case 2 is failed Ajaka");
	    driver.close();
	}
	@Test
	public void LoginTest2(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("parthivajay123@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Ajay@098765");
	    driver.close();
	}
	@Test
	public void LoginTest3(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("parthdsffsiva123@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("Ajay@098765");
	    Assert.fail("Test case 4 is failed");
	    driver.close();
	}
}
