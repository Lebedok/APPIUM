package com.tech;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumIntro {


    @Test

    public void test1() throws MalformedURLException {

        File appFile = new File("src/test/resources/ApiDemos-debug.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Nargiza");
        desiredCapabilities.setCapability("platform","android");
        desiredCapabilities.setCapability("app", appFile.getAbsolutePath());

        URL appiumServerURL = new URL("http://localhost:4723/wd/hub");

       /* AndroidDriver <AndroidElement> driver = new AndroidDriver(appiumServerURL,desiredCapabilities);
        AndroidElement accessibilityLink =  driver.findElement(By.xpath("//android.widget.TextView[@text=‘Accessibility’]"));
        String accessibilityLinkText = accessibilityLink.getText();
        System.out.println(accessibilityLinkText);
        accessibilityLink.click();
        */

        AndroidDriver <AndroidElement>driver=new AndroidDriver(appiumServerURL, desiredCapabilities);
        AndroidElement accecibilityLink=
                driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']"));
        String accecibilityLinkText=accecibilityLink.getText();
        System.out.println(accecibilityLinkText);
        accecibilityLink.click();




    }

}
