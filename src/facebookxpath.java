import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("This is my first project");
		
		/*     //Tagname[@attribute='value']   */
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234567");
		driver.findElement(By.xpath("//*[@value='1']")).click();
		System.out.println(driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText());
		driver.quit();
		}

}
