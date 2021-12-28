import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1223455");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//driver.findElement(By.cssSelector("input[type*='submit'])")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='div_login_error']")).getText());
		driver.quit();
		

	}

}
