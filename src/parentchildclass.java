import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tamilgun.com");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//div[@id='inputwrapper']/input")).sendKeys("selenium code"));
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("tamildhool");
		//driver.findElement(By.xpath("div#inputWrapper")).sendKeys("hello");
		driver.findElement(By.xpath("//div[@class='row content-block ']/div/div/div/form/fieldset/input")).sendKeys("Laabam");
		driver.findElement(By.xpath("//div[@class='row content-block ']/div/div/div/form/fieldset/input[2]")).click();

	}

}
