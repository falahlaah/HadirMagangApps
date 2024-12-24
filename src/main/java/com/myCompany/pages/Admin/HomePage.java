package com.myCompany.pages.Admin;

import com.myCompany.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".css-6eu2y8")
    private WebElement userProfile;

    @FindBy(css = ".css-uajqx8")
    private WebElement btnLogout;




    public void clickUserProfile(){
        userProfile.click();
    }

    public void clickLogoutbtn(){
        btnLogout.click();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }



}
