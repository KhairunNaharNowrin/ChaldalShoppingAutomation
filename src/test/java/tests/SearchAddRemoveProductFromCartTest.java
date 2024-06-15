package tests;

import pages.ChaldalHomePage;

import java.io.IOException;

public class SearchAddRemoveProductFromCartTest extends BaseTest{

    public static void main(String[] args) throws IOException, InterruptedException {
        SearchAddRemoveProductFromCartTest test = new SearchAddRemoveProductFromCartTest();
        test.setup();

        ChaldalHomePage chaldalHomePage = new ChaldalHomePage(driver);

        chaldalHomePage.openApp();
        chaldalHomePage.searchProduct("toothbrush");
        chaldalHomePage.scrollAndSelectProduct("Colgate Gentle Sensitive Toothbrush");
        chaldalHomePage.addOneItemToCart();
        chaldalHomePage.addTwoItemToCart();
        chaldalHomePage.addThreeItemToCart();
        chaldalHomePage.close();
        chaldalHomePage.goToCartPage();
        chaldalHomePage.removeFirstProductFromCart();
        chaldalHomePage.removeSecondProductFromCart();
        chaldalHomePage.removeThirdProductFromCart();

        if (chaldalHomePage.isNothingToSeeHereDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        test.teardown();
    }
}
