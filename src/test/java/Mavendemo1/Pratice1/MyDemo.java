package Mavendemo1.Pratice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//THIS IS BY MADHU
//And this is me
//Thanks you
public class MyDemo {
	

		public static void main(String[] args) {
			
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("hades@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Hades@23");
			driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
		}

	}

