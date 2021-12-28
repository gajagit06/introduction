import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reach\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leons.ca");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//System.out.println(driver.findElement(By.xpath("//div[@id='inputwrapper']/input")).sendKeys("selenium code"));
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("tamildhool");
		//driver.findElement(By.xpath("div#inputWrapper")).sendKeys("hello");
		//driver.findElement(By.xpath("//div[@class='row content-block ']/div/div/div/form/fieldset/input")).sendKeys("BigBoss season5");
		//driver.findElement(By.xpath("//div[@class='row content-block ']/div/div/div/form/fieldset/input/input")).click();
		driver.findElement(By.xpath("//*[@id=\"close-button\"]/a")).click();
		driver.findElement(By.xpath("//form[@role='search']/div/div/input[2]")).sendKeys("Cleopatra 9-Piece Dining Room Set - Oak");
		driver.findElement(By.xpath("//div[@class='search_box']/button")).click();

	}

}
