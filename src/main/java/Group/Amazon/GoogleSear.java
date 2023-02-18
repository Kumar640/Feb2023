package Group.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Simplilearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Amazon");
		driver.findElement(By.name("btnK")).submit();
		String str1=driver.getTitle();
		System.out.println("Title of page is "+str1);
		String str2="Amazon - Google Search";
		if(str1.equals(str2))
		{
			System.out.println("Test Case passes");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		Thread.sleep(1000);
		
		driver.close();
	}

}
