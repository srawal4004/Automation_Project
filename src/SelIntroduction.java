import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Invoking browser-- Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\srust\\Documents\\Learning\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//INvoking browser - Microsoft Edge
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srust\\Documents\\Learning\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//Invoking browser-- chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srust\\Documents\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
		

	}

}
