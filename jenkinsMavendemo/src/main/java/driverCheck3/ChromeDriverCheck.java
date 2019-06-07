package driverCheck3;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GSR\\Downloads\\DWNLD\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);	
		driver.quit();
	}

}
