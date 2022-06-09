package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPo extends BasePo{


    public LoginPo(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement LoginButton;

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root mt-4 css-wa977u-MuiPaper-root-MuiCard-root']")
    WebElement AlertMessage;

    @FindBy(xpath = "//input[@name='username']")
    WebElement Username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement SignInButton;

    @FindBy(xpath = "//div[@class='MuiBox-root css-j7qwjs']/child::div[2]")
    WebElement FieldRequiredAlert;

    public void LoginButton()
    {
        LoginButton.click();
    }

    public void Username(String UName)
    {
        Username.sendKeys(UName);
    }

    public void UsernameClear()
    {
        Username.clear();
    }

    public void Password(String Pass)
    {
        Password.sendKeys(Pass);
    }

    public void PasswordClear()
    {
        Password.clear();
    }

    public void SignInButton() throws InterruptedException
    {
        selenium.pageScrollInView(SignInButton);
        Thread.sleep(5000);
        SignInButton.click();
    }

    public void AlertMessageofValidation() throws InterruptedException {
        selenium.scrollDownUP(AlertMessage);
        selenium.waitTillElementIsVisible(AlertMessage);
        Thread.sleep(7000);

    }

    public void FieldRequiredAlert() throws InterruptedException {
        selenium.waitTillElementIsVisible(FieldRequiredAlert);
        selenium.pageScrollInView(FieldRequiredAlert);
        Thread.sleep(5000);
        selenium.getText(FieldRequiredAlert);
    }

}
