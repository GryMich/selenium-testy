package pl.lait.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver; 
	
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MICHAŁ\\chromedriver.exe");
    	DesiredCapabilities cap = DesiredCapabilities.chrome(); // DesiredCapabilities oświadcza na jakiej przeglądarce będzie działał test
    	driver = new ChromeDriver(); 
    	driver.get("http://newtours.demoaut.com");
    	String pageTitle = driver.getTitle();
    	System.out.println(pageTitle);
    	driver.findElement(By.linkText("SIGN-ON")).click(); // tutaj program znajduje link po nazawie, a następnie na niego klika
    	driver.findElement(By.name("userName")).sendKeys("Bobek");
    	driver.findElement(By.name("password")).sendKeys("bobek");
    	driver.findElement(By.name("login")).click();
    	}
}
