package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OTPPo extends BasePo {

    public OTPPo(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//strong[contains(text(),'Resend OTP')]")
    WebElement ResendOTPLink;

    @FindBy(xpath = "//button[contains(text(),'Back')]")
    WebElement Backbutton;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement NextButton;

    public void ResendOTPLink()
    {
        ResendOTPLink.click();
    }

    public void Backbutton()
    {
        Backbutton.click();
    }

    public void NextButton()
    {
        NextButton.click();
    }
}
