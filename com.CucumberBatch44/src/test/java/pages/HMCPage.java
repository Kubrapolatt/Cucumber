package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {

public HMCPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement mainPageLoginLink;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement başarılıGirişYazısıElementi;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girişYapılamadıYazısıElementi;

}
