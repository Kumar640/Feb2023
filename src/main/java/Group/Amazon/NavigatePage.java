package Group.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Simplilearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of the Page is "+driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().back();
		driver.get("https://www.amazon.com");
		System.out.println("Title of 2nd Page is "+driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().back();
		driver.close();
	}

}
