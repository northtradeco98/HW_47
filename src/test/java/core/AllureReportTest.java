package core;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.*;

public class AllureReportTest {

	public WebDriver driver;
	static Properties p = new Properties();
	static String browser = System.getProperty("browser"); // -Dbrowser="firefox"

	@Step("Step [set value] - [{1}]")
	public void setValueTest(By by, String value) {
		Common.setValue(by, value);
	};

	@Step("Step [validate element] - Expected: {0}/Actual: {1}")
	public void assertElement(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	};

	@Test(priority = 1, description = "SignUp Page Validating")
	@Description("SignUp Page: Elements Validation")
	public void SignUpTest() throws Exception {

		p.load(new FileInputStream("./input.properties")); 

		setValueTest(By.id(p.getProperty("el_07")), p.getProperty("fname_value"));
		assertElement(p.getProperty("fname_value"), 
				Common.getValue(By.id(p.getProperty("el_07")))); 
		
		setValueTest(By.id(p.getProperty("el_09")), p.getProperty("lname_value")); 
																					
		assertElement(p.getProperty("lname_value"), 
				Common.getValue(By.id(p.getProperty("el_09"))));

		setValueTest(By.id(p.getProperty("el_11")), p.getProperty("email_value"));
		assertElement(p.getProperty("email_value"), Common.getValue(By.id(p.getProperty("el_11"))));

		setValueTest(By.id(p.getProperty("el_13")), p.getProperty("phone_value"));
		assertElement(p.getProperty("phone_value"), Common.getValue(By.id(p.getProperty("el_13"))));

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

		Common.submit(By.id(p.getProperty("el_29")));
	}

	@Test(dependsOnMethods = { "SignUpTest" }, priority = 2, description = "Confirmation Page Validating")
	@Description("Confirmation: Elemets Validation")
	public void ConfirmationTest() throws Exception {
		Common.waitTitlePage("Confirmation");

		assertElement(p.getProperty("fname_value"), Common.getValue(By.id(p.getProperty("el_07"))));
		assertElement(p.getProperty("lname_value"), Common.getValue(By.id(p.getProperty("el_09"))));
		assertElement(p.getProperty("email_value"), Common.getValue(By.id(p.getProperty("el_11"))));
		assertElement(p.getProperty("phone_value"), Common.getValue(By.id(p.getProperty("el_13"))));

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
	@Step("Step [open browser]")
	public void setUp() throws Exception {
		if (browser == null) {
			System.err.println("Please provide browser: -Dbrowser=firefox");
			System.exit(0);
		} else if (!browser.equalsIgnoreCase("chrome") && !browser.equalsIgnoreCase("firefox")
				&& !browser.equalsIgnoreCase("safari") && !browser.equalsIgnoreCase("edge")) {
			System.err.println("Framework supports only: Chrome, Firefox, Safari or Edge");
			System.exit(0);
		}
		SignUp.open(browser);
		p.load(new FileInputStream("./input.properties"));
	}

	@AfterClass
	@Step("Step [close browser]")
	public void tearDowm() {
		Common.quit();
	}
}
