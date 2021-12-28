import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class execise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://tamilgun.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("keywords")).sendKeys("Kodiyil Oruvan (2021) HD");
		driver.findElement(By.className("searchbutton")).click();
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/section/div/article/div/section/a")).click();
		//driver.findElement(By.linkText("PLAY")).click();
		//driver.findElement(By.xpath("//*[@id='botr_IhWWQi0W_8dFt9uSF_div']/div[2]/div[4]/video")).click();
		//driver.manage().window().maximize();
		//driver.quit();
		//driver.findElement(By.xpath("//*[@id=\"videoframe\"]/div/a/img")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebElement button =driver.findElement(By.linkText("//*[@id=\"videoframe\"]/div/a"));	
		
		js.executeScript("document.getElementById(\"video\").play()");
		}
	
	

}
   