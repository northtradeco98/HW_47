package core;
 
import java.io.FileInputStream;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;
 
class SignUp {
 
       static Properties p = new Properties();
       static Writer report;
 
       static void open(String browser) throws Exception {
              p.load(new FileInputStream("./input.properties"));
              Common.open(browser, p.getProperty("url"));}
 
       static void validate(ExtentTest logger) throws Exception {
              p.load(new FileInputStream("./input.properties"));
             
              // 01 :: First Name
              Common.setValue(By.id(p.getProperty("el_07")), p.getProperty("fname_value"));
              Common.writeInfoLine("First Name", p.getProperty("fname_value"),              
Common.getValue(By.id(p.getProperty("el_07"))), logger);
 
              // 02 :: Last Name
              Common.setValue(By.id(p.getProperty("el_09")), p.getProperty("lname_value"));
              Common.writeInfoLine("Last Name", p.getProperty("lname_value"),               
Common.getValue(By.id(p.getProperty("el_09"))), logger);
 
              // 03 :: Email Name
              Common.setValue(By.id(p.getProperty("el_11")), p.getProperty("email_value"));
              Common.writeInfoLine("Email", p.getProperty("email_value"),
Common.getValue(By.id(p.getProperty("el_11"))), logger);
 
              // 04 :: Phone Name
              Common.setValue(By.id(p.getProperty("el_13")), p.getProperty("phone_value"));
              Common.writeInfoLine("Phone", p.getProperty("phone_value"),
Common.getValue(By.id(p.getProperty("el_13"))), logger);
       }
}
