import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("1234567");
		driver.findElement(By.linkText("Forgot Password?")).click(); 
		System.out.println(driver.getTitle());
		driver.navigate().to("http://salesforce.com");
		driver.get("http://salesforce.com");
		driver.findElement(By.linkText("Login")).click(); 
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("1234567");
		driver.findElement(By.className("input r4 wide mb16 mt8 password")).click();
		driver.findElement(By.name("Login")).click();
	}

}
