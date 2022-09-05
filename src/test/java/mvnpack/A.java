package mvnpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.ludojs.com/standalone/drag-drop/demo/drag-drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		WebElement we1=	driver.findElement(By.id("ludo-l7orm7v0"));
		
		Thread.sleep(2000);

		WebElement we2=	driver.findElement(By.xpath("//div[@id=\"group-a\"]"));
		
		
		Actions a =new Actions(driver);
		
		Thread.sleep(2000);
		//a.moveToElement(we1);
		
		a.dragAndDrop(we1, we2).build().perform();
		
		
		
		
		
		
	}}
