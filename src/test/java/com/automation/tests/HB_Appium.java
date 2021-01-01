package com.automation.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class HB_Appium {

    private AppiumDriver<MobileElement> driver;


    @Test
    public void test1() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "10.0");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\etsy.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);

        desiredCapabilities.setCapability("appActivity", "com.hepsiburada.ui.home.BottomNavigationActivity");
        desiredCapabilities.setCapability("appPackage", "com.pozitron.hepsiburada");

        driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(3000);

        WebDriverWait wait = new WebDriverWait(driver, 20);


        WebElement profile = driver.findElement(By.id("com.pozitron.hepsiburada:id/account_icon"));
        profile.click();

        WebElement Login = driver.findElementById("com.pozitron.hepsiburada:id/llUserAccountLogin");


        //WebElement plus = driver.findElement(MobileBy.AccessibilityId("plus"));
        Login.click();
        Thread.sleep(3000);
        WebElement email = driver.findElementById("com.pozitron.hepsiburada:id/etLoginEmail");
        WebElement password = driver.findElementById("com.pozitron.hepsiburada:id/etLoginPassword");
        WebElement LgnBtn = driver.findElementById("com.pozitron.hepsiburada:id/btnLoginLogin");
        email.sendKeys("nusretharputlu@gmail.com");
        password.sendKeys("987D412w");
        LgnBtn.click();

        WebElement okBtn = driver.findElementById("android:id/button1");

        okBtn.click();

        Thread.sleep(3000);
//      | HBV00000KKJ56 | Xiaomi Mi Band 4 Akıllı Bileklik Siyah          |







        //driver.closeApp();

      //  AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);


    }

}
