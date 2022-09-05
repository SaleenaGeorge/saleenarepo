package saleenaexam1package;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2contains {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
	driver.manage().window().maximize();
	
	
	
	driver.findElement(By.xpath("//input[contains(@name,'weblog_title')]")).sendKeys("123");
	
	driver.findElement(By.xpath("//input[contains(@name,'user_name')]")).sendKeys("salee");
	driver.findElement(By.xpath("//input[contains(@name,'admin_password')]")).sendKeys("salee");
	driver.findElement(By.xpath("//input[contains(@name,'admin_email')]")).sendKeys("salee@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,'blog_public')]")).click();
	driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).click();
	}}