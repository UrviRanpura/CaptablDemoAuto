package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountProfilePagePO extends BasePo{

    public AccountProfilePagePO(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(name = "firstlastname")
    WebElement FullName;

    @FindBy(name = "email")
    WebElement Email;

    @FindBy(name = "username")
    WebElement Username;

}
