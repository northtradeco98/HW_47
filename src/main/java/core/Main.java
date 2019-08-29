package core; //NA ETOT KLASS NE NADO BRASHAT VNIMANYA!

//import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.safari.SafariDriver;
//
//public class Main {
//	static WebDriver driver;
//	
//	static String getValue(By by) {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        if (!driver.findElements(by).isEmpty() &&
//        driver.findElement(by).isDisplayed() && driver.findElement(by).getTagName().equalsIgnoreCase("input"))
//        return driver.findElement(by).getAttribute("value").toString().trim();
//        
//        else if (!driver.findElements(by).isEmpty() &&
//                driver.findElement(by).isDisplayed() && driver.findElement(by).getTagName().equalsIgnoreCase("span"))
//                       return driver.findElement(by).getText().trim();
//        
//		return "null";}
//	
//	static void setValue(By by, String value) {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        if (!driver.findElements(by).isEmpty() && driver.findElement(by).isDisplayed())
//             driver.findElement(by).sendKeys(value);}
//	
//	
//	public static void main (String[] args) {
//		
//		Logger.getLogger("").setLevel(Level.OFF);
//		driver = new SafariDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://alex.academy/exe/signup/www/index.php");
//
//		setValue(By.id("id_fname"), "loh");
//		
//		System.out.println("result: " + getValue(By.id("id_fname")));
//		driver.quit();
//	
//	}
//
//}
