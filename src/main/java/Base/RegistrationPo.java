package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPo extends BasePo{

    public RegistrationPo(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegistrationButton;

    @FindBy(name = "firstlastname")
    WebElement FirstLastName;

    @FindBy(name = "email")
    WebElement Email;

    @FindBy(name = "username")
    WebElement UserName;

    @FindBy(name = "address")
    WebElement Address;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(name = "confirmPassword")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//input[@value='Male']")
    WebElement Male;

    @FindBy(xpath = "//input[@value='Female']")
    WebElement Female;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement Next;

    @FindBy(xpath = "//div[contains(text(),'An account with the given phone_number already exists.')]")
    WebElement AccountExistsAlertMessage;

    public void RegistrationButton()
    {
        RegistrationButton.click();
    }

    public void FirstLastName(String FLName)
    {
        FirstLastName.sendKeys(FLName);
    }

    public void Email(String email)
    {
        Email.sendKeys(email);
    }

    public void UserName(String UName)
    {
        UserName.clear();
        UserName.sendKeys(UName);
    }

    public void Address(String Add)
    {
        Address.sendKeys(Add);
    }

    public void Password(String Pass)
    {
        Password.sendKeys(Pass);
    }

    public void ConfirmPassword(String CPass)
    {
        ConfirmPassword.sendKeys(CPass);
    }

    public void Male()
    {
        Male.click();
    }

    public void Female()
    {
        Female.click();
    }

    public void Next() throws InterruptedException {
        selenium.pageScrollInView(Next);
        Thread.sleep(5000);
        Next.click();
    }

    public void AccountExistsAlertMessage() throws InterruptedException {
        selenium.waitTillElementIsVisible(AccountExistsAlertMessage);
        Thread.sleep(5000);
        selenium.getText(AccountExistsAlertMessage);
    }
}
