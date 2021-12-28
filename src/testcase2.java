import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Class name = ChromeDriver */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().to("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://tamilgun.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
