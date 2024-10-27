package testBase;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties propt;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os, String br) throws IOException {
		 // loading config properties
		FileReader file = new FileReader("./src//test//resources//config.properties");
		propt=new Properties();
		propt.load(file);
		
		// cross browser 
		switch(br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver();break;
		case "edge" : driver = new EdgeDriver();break;
		case "firefox":driver= new FirefoxDriver();break; 
		default:System.out.println("Invalid browser name");return;		
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propt.getProperty("appUrl"));
		driver.manage().window().maximize();
	}
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
}
