package core;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReportTest {
       public WebDriver driver;
       public ExtentHtmlReporter htmlReporter;
       public ExtentReports extent;
       public ExtentTest logger;
       static Properties p = new Properties();
       static String browser = System.getProperty("browser");     // -Dbrowser="firefox"
       @Test(priority = 0)
       public void SignUpTest() throws Exception {
           logger = extent.createTest("SignUp Page Validation");
           SignUp.validate(logger);
              
    	   Assert.assertEquals(p.getProperty("fname_value"), Common.getValue(By.id(p.getProperty("el_07"))));
           Assert.assertEquals(p.getProperty("lname_value"), Common.getValue(By.id(p.getProperty("el_09"))));
           Assert.assertEquals(p.getProperty("email_value"), Common.getValue(By.id(p.getProperty("el_11"))));
           Assert.assertEquals(p.getProperty("phone_value"), Common.getValue(By.id(p.getProperty("el_13"))));
    	   
    	   
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_01"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_02"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_03"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_04"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_05"))));
              
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_06"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_07"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_08"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_09"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_10"))));
              
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_11"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_12"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_13"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_14"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_15"))));
              
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_16"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_17"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_18"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_19"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_20"))));
              
              Assert.assertTrue(Common.isElementPresent(By.xpath(p.getProperty("el_21"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_22"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_23"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_24"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_25"))));
              
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_26"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_27"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_28"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_29"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_30"))));
              
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_31"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_32"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_33"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_33"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_34"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_35"))));
              
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_36"))));
              Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_37"))));
              Assert.assertTrue(Common.isElementPresent(By.xpath(p.getProperty("el_38"))));
              Assert.assertTrue(Common.isElementPresent(By.xpath(p.getProperty("el_39"))));
              Assert.assertTrue(Common.isElementPresent(By.xpath(p.getProperty("el_40"))));
              Assert.assertTrue(Common.isElementPresent(By.xpath(p.getProperty("el_41"))));
              
              Common.submit(By.id(p.getProperty("el_29")));}
       
       @Test(dependsOnMethods = {"SignUpTest"}, priority = 1)
       public void ConfirmationTest() throws Exception {
                Common.waitTitlePage("Confirmation");
//              logger = extent.createTest("Confirmation Page Validation");
//              Confirmation.validate(logger);
//              
//              Assert.assertEquals(p.getProperty("fname_value"), Common.getValue(By.id(p.getProperty("el_07"))));
//              Assert.assertEquals(p.getProperty("lname_value"), Common.getValue(By.id(p.getProperty("el_09"))));
//              Assert.assertEquals(p.getProperty("email_value"), Common.getValue(By.id(p.getProperty("el_11"))));
//              Assert.assertEquals(p.getProperty("phone_value"), Common.getValue(By.id(p.getProperty("el_13"))));

		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_05"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_06"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_07"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_08"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_09"))));

		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_10"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_11"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_12"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_13"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_14"))));

		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_42"))));
		Assert.assertTrue(Common.isElementPresent(By.id(p.getProperty("el_43"))));
}
       @BeforeClass
       public void beforeClass() throws Exception {
if(browser == null) {System.err.println("Please provide browser: -Dbrowser=firefox"); System.exit(0);}
              else if(!browser.equalsIgnoreCase("chrome") &&
                     !browser.equalsIgnoreCase("firefox") &&
                     !browser.equalsIgnoreCase("safari") &&
                     !browser.equalsIgnoreCase("edge"))
{System.err.println("Framework supports only: Chrome, Firefox, Safari or Edge"); System.exit(0);}
              SignUp.open(browser);
              p.load(new FileInputStream("./input.properties"));}
       @AfterClass
       public void afterClass() {Common.quit();}
       @BeforeTest
       public void startReport() {
htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/extentreports.html");
              extent = new ExtentReports();
              extent.attachReporter(htmlReporter);
              extent.setSystemInfo("User Name", "John Smith");
              extent.setSystemInfo("Browser", browser);
              htmlReporter.config().setDocumentTitle("Sign Up");
              htmlReporter.config().setReportName("Sign Up Validation"); // DARK
              htmlReporter.config().setTheme(Theme.STANDARD);}
       @AfterMethod
       public void getResult(ITestResult result) throws Exception {
              String screenshotPath = Common.getScreenShot(result.getName());
       logger.addScreenCaptureFromPath(screenshotPath);
              if (result.getStatus() == ITestResult.FAILURE) {
       logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
              } else if (result.getStatus() == ITestResult.SKIP) {
       logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
              } else if (result.getStatus() == ITestResult.SUCCESS) {
       logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
              }}
       @AfterTest
       public void endReport() {extent.flush();}
}
