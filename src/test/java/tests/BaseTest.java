package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {
    static AppiumDriver driver;

    public void setup() throws IOException, MalformedURLException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/TestData.properties");
        properties.load(fileInputStream);

        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid(properties.getProperty("udid"));
        options.setPlatformName(properties.getProperty("platformName"));
        options.setAppPackage(properties.getProperty("appPackage"));
        options.setAppActivity(properties.getProperty("appActivity"));
        options.setAutomationName(properties.getProperty("automationName"));
        options.setNoReset(Boolean.parseBoolean(properties.getProperty("noReset")));

        driver = new AppiumDriver(new URL(properties.getProperty("serverUrl")), options);

    }

    public void teardown() {
        driver.quit();
    }
}
