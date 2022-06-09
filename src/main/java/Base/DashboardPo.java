package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPo extends BasePo{

    public DashboardPo(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding css-1ontqvh']/child::li[2]")
    WebElement InvestTab;

    @FindBy(id = "basic-button")
    WebElement UserDropDown;

    @FindBy(xpath = "//ul[@role='menu']/child::li[1]")
    WebElement AccountDetailsButtonFromDropDown;

    @FindBy(xpath = "//ul[@role='menu']/child::li[2]")
    WebElement MyVaultButtonDropDown;

    @FindBy(xpath = "//ul[@role='menu']/child::li[3]")
    WebElement LogoutButtonDropDown;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement HomeLinkAtTop;

    public void InvestTab()
    {
        InvestTab.click();
    }

    public void UserDropDown()
    {
        UserDropDown.click();
    }

    public void AccountDetailsButtonFromDropDown()
    {
        AccountDetailsButtonFromDropDown.click();
    }

    public void MyVaultButtonDropDown()
    {
        MyVaultButtonDropDown.click();
    }

    public void LogoutButtonDropDown()
    {
        LogoutButtonDropDown.click();
    }

    public void HomeLinkAtTop()
    {
        HomeLinkAtTop.click();
    }
}
