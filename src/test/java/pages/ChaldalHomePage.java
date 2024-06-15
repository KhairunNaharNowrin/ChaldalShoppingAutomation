package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;


public class ChaldalHomePage {

    private AppiumDriver driver;


    public ChaldalHomePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void openApp() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(116)"))
                .click();

    }

    public void searchProduct(String productName) throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Search Products\")"))
                .sendKeys(productName);
        Thread.sleep(2000);
    }

    public void scrollAndSelectProduct(String productName) throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + productName + "\"))"))
                .click();
        Thread.sleep(2000);
    }

    public void addOneItemToCart() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(201)"))
                .click();
        Thread.sleep(2000);
    }

    public void addTwoItemToCart() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(215)"))
                .click();
        Thread.sleep(2000);
    }

    public void addThreeItemToCart() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(215)"))
                .click();
        Thread.sleep(2000);
    }

    public void close() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Close\")"))
                .click();
        Thread.sleep(2000);
    }

    public void goToCartPage() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(114)"))
                .click();
        Thread.sleep(2000);
    }

    public void removeFirstProductFromCart() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(216)"))
                .click();
        Thread.sleep(2000);
    }

    public void removeSecondProductFromCart() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(216)"))
                .click();
        Thread.sleep(2000);
    }

    public void removeThirdProductFromCart() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(216)"))
                .click();
        Thread.sleep(2000);
    }

    public boolean isNothingToSeeHereDisplayed() {
        return driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Nothing to see here\")")).isDisplayed();
    }



}
