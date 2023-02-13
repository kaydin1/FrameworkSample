package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id="identifierId")
    public WebElement emailOrPhoneTextField;

    @FindBy(xpath="//span[text()='Next']")
    public WebElement nextEmailPageButton;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordTextField;

    @FindBy(xpath="//span[text()='Next']")
    public WebElement nextPasswordPageButton;


    @FindBy(xpath="//span[starts-with(text(),'Wrong')]")
    public WebElement errorMessage;



    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}
