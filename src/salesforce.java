import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://salesforce.com");
		driver.findElement(By.linkText("Login")).click(); 
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("1234567");
		//driver.findElement(By.className("input r4 wide mb16 mt8 password")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	    System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	    driver.close();
		}
	

}
   