package Pages;

import com.PageObjectModel.DriverManager;
import com.PageObjectModel.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends DriverManager {

//   public LoginPage()
//   {
//       PageFactory.initElements(driver, this);
//   }



//   @FindBy(how = How.XPATH, using = "//a[@class='ico-login']\"")
//   private WebElement login;
//   @FindBy(how = How.XPATH, using = "//input[@class='email']")
//    private WebElement username;
//   @FindBy(how = How.XPATH, using = "//input[@class='password']")
//    private WebElement password;
//   @FindBy(how = How.XPATH, using = "//input[@class='button-1 login-button']")
//    private WebElement loginbtn;


   public void navigateToNopcommerpage()
   {
//       driver.navigate().to("http://demo.nopcommerce.com/");
   }

   public void homePageLink()
   {
//       login.click();
   }

   public void loginAttempt()
   {
//       username.sendKeys("aaa@aa.aa");
//       Utils.waitForSomeTime();
//       password.sendKeys("123456");
//       Utils.waitForSomeTime();
   }

   public void clickOnLoginButton()
   {
//       loginbtn.click();
//       Utils.waitForSomeTime();
   }
}
