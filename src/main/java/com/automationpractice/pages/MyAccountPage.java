package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.Logger;
import org.bouncycastle.math.ec.tools.F2mSqrtOptimizer;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = Logger.getLogger(MyAccountPage.class.getName());
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//li//a[@class='sf-with-ul']")
    List<WebElement>  menu;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/h5[1]/a[1]")
    WebElement casualDress;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/h5[1]/a[1]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    WebElement dresses;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tshirts;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signInLinks;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement createEmailField;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;
    @CacheLookup
    @FindBy(linkText = "Sign out")
    WebElement signOutLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']")
    WebElement addressBox;
    @CacheLookup
    @FindBy(xpath = "//h5//a[@class='subcategory-name']")
    WebElement subCat;

    public String getAddressBoxText(){
return addressBox.getText();

    }

    public void clickOnMyAddressTab(){
        clickOnElement(myAddressTab);
    }

    public boolean verifySignOutLink() {
        log.info("verify sign out displayed" + signOutLink.getText());
        return signOutLink.isDisplayed();
    }

    public void clickOnSignOut() {
        log.info("click on signout" + signOutLink.getText());
        clickOnElement(signOutLink);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement maleRadio;

    public void selectMrRadio() {
        log.info("select Gender radio buttton" + maleRadio.getText());
        clickOnElement(maleRadio);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstnameField;

    public void setFirstnameField(String first) {
        log.info("Set firstName field" + first);
        sendTextToElement(firstnameField, first);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastnameField;

    public void setLastnameField(String last) {
        log.info("Set lastName field" + last);
        sendTextToElement(lastnameField, last);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    public void setPasswordField(String password) {
        log.info("Set password field" + password);
        sendTextToElement(passwordField, password);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNum;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement futureReference;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id=\"center_column\"]/h1")
    WebElement myAccountText;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement Password;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElement signInButton;

    public void setEmail(String str) {
        log.info("set Email" + str);
        sendTextToElement(email, str);
    }

    public void setPassword(String str) {
        log.info("set password" + str);
        sendTextToElement(Password, str);
    }

    public void clickOnSignButton() {
        log.info("Click on sign in button" + signInButton);
        clickOnElement(signInButton);
    }



    public void setAddress(String address) {
        log.info("Set address field" + address);
        sendTextToElement(addressField, address);
    }



    public void setCityField(String cityField) {
        log.info("Set cityName field" + cityField);
        sendTextToElement(city, cityField);
    }

    public void selectState(String stateName) {
        log.info("Set state" + stateName);
        selectByVisibleTextFromDropDown(state, stateName);
    }

    public void selectCountry(String countryName) {
        log.info("Set country field" + countryName);
        selectByVisibleTextFromDropDown(country, countryName);
    }

    public void setMobileNum(String number) {
        log.info("Set mob number field" + number);
        sendTextToElement(mobileNum, number);
    }

    public void setZipCode(String zip) {
        log.info("Set zip field" + zip);
        sendTextToElement(zipCode, zip);
    }

    public void setFutureReference(String add) {
        log.info("Set futureRef. field" + add);
        sendTextToElement(futureReference, add);
    }

    public void clickOnRegisterButton() {
        log.info("click on register button" + registerButton.getText());
        clickOnElement(registerButton);
    }

    public String getMyAccountText() {
        log.info("get MY Account text" + myAccountText.getText());
        return getTextFromElement(myAccountText);
    }


    public void clickOnCreateAnAccount() {
        clickOnElement(createAnAccountButton);
    }

    public void setCreateEmailField() {
        sendTextToElement(createEmailField, getRandomString(5) + "@gmail.com");
    }

    public void clickOnCategory(String cat)  {

        for (WebElement e : menu) {

            if (e.getText().equalsIgnoreCase(cat)) {
                clickOnElement(women);
            } else {
                clickOnElement(dresses);
            }
        }
    }
    public void clickOnSubCategory(String sub) {
        if (tops.getText().equalsIgnoreCase(sub)) {
            clickOnElement(tops);

        }else{clickOnElement(casualDress);}
    }


    public void clickOnSignIn() {
        log.info("click on sign in link" + signInLinks.getText());
        clickOnElement(signInLinks);
    }


}

