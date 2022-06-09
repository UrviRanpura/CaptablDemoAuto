package Base;

import Utilities.DriverManager;
import Utilities.SeleniumHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

//TestDone

public class BaseTest {
protected WebDriver driver;
protected SeleniumHelpers selenium;
private DriverManager drivermanager;

//Connect with GitHub

@BeforeTest
@Parameters({"browser"})
public void setUp(@Optional("chrome") String browser) throws InterruptedException {
    drivermanager = new DriverManager();
    driver = drivermanager.setUp(browser);
    selenium = new SeleniumHelpers(driver);
    driver.get("https://dyt7guzap04ox.cloudfront.net/login");
    Thread.sleep(7000);
}

@Test(priority = 2)
public void Logintest() throws InterruptedException
{
    LoginPo LPage = new LoginPo(driver);

    LPage.LoginButton();
    Thread.sleep(5000);

    //Password & UserName Incorrect Validation Test
    LPage.Username("8511339702");
    LPage.Password("Test@123");
    Thread.sleep(5000);
    LPage.SignInButton();
    Thread.sleep(10000);
    //ValidationAlertMessage
    LPage.AlertMessageofValidation();
    Thread.sleep(5000);


    //Both Fields are blank
    LPage.UsernameClear();
    LPage.Username("");
    LPage.PasswordClear();
    LPage.Password("");
    Thread.sleep(5000);
    LPage.SignInButton();
    Thread.sleep(10000);
    //ValidationAlertMessage
    LPage.FieldRequiredAlert();

    //Only numeric values allowed in username validation
    LPage.UsernameClear();
    LPage.Username("vbjsmkgobkl");
    LPage.PasswordClear();
    LPage.Password("");
    Thread.sleep(5000);
    LPage.SignInButton();
    Thread.sleep(10000);
    //ValidationAlertMessage
    LPage.AlertMessageofValidation();

    //Minimum 10 characters required for username validation
    LPage.UsernameClear();
    LPage.Username("52361");
    LPage.PasswordClear();
    LPage.Password("");
    Thread.sleep(5000);
    LPage.SignInButton();
    Thread.sleep(10000);
    //ValidationAlertMessage
    LPage.AlertMessageofValidation();

    //Maximum 15 characters are allowed for username validation
    LPage.UsernameClear();
    LPage.Username("151564165464215612316511");
    LPage.PasswordClear();
    LPage.Password("");
    Thread.sleep(5000);
    LPage.SignInButton();
    Thread.sleep(10000);
    //ValidationAlertMessage
    LPage.AlertMessageofValidation();

    //Successfully Login Testcase
    LPage.UsernameClear();
    LPage.Username("8511339701");
    LPage.PasswordClear();
    LPage.Password("Test@123");
    Thread.sleep(5000);
    LPage.SignInButton();
    Thread.sleep(20000);

}

@Test(priority = 3)
public void DashboardTest() throws InterruptedException {

    DashboardPo DPage = new DashboardPo(driver);

    DPage.UserDropDown();
    Thread.sleep(2000);
    DPage.AccountDetailsButtonFromDropDown();
    Thread.sleep(5000);

}

@Test(priority = 1)
public void RegistrationTest() throws InterruptedException
{
    RegistrationPo RPage = new RegistrationPo(driver);

    RPage.RegistrationButton();
    Thread.sleep(10000);
    RPage.FirstLastName("Test 258");
    RPage.Email("Test258@yopmail.com");
    RPage.UserName("9444038834");
    RPage.Address("Baroda, Gujarat, 391750");
    RPage.Password("Test@123");
    RPage.ConfirmPassword("Test@123");
    RPage.Female();
    Thread.sleep(5000);
    RPage.Next();
    Thread.sleep(7000);
    RPage.AccountExistsAlertMessage();
    Thread.sleep(7000);
    RPage.UserName("8511339706");
    Thread.sleep(10000);

}

@AfterTest
public void tearDown(ITestResult result)
{
    drivermanager.tearDown();
}

}
