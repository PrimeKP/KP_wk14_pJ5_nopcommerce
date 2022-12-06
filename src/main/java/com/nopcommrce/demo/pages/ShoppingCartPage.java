package com.nopcommrce.demo.pages;

import com.nopcommrce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class ShoppingCartPage extends Utility {

    By clickComputer = By.xpath("//a[@href='/computers']");
    By clickDesktop = By.xpath("//a[@title='Show products in category Desktops']");
    By sort = By.id("products-orderby");
    By clickCart = By.xpath("(//button[contains(text(),'to cart')])[1]");
    //By actualVerifyText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selctComputer = By.name("product_attribute_1");


    public void clickOnComputerAndDesktop() {
        clickOnElement(clickComputer);
        clickOnElement(clickDesktop);
    }

    public void sortComputerDesktopsToAtoZ(String value) {
        selectByValueFromDropDown(sort, value);
    }

    public void clickOnShoppingCart() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(clickCart);
    }


    public void selectPentiumComputer(String name) {
        selectByVisibleTextFromDropDown(selctComputer, name);
    }

    //this method will select by what ever name provide from dropdown
    public void selectByDropDown(String message, By by, String name){
        selectByVisibleTextFromDropDown(by, name);
    }


    //==================these methods allow to compare text by taking parameters==============
    public String exptectedTextMessage(String expected) {
        System.out.println("Expected Text or Message is : " + expected);
        return expected;
    }

    public String actualTextToVerify(By by) {
        String actual = driver.findElement(by).getText();
        System.out.println("Actual Text or Message is : " + actual);
        return actual;
    }
    //==================these methods allow to compare text by taking parameters==============

    public void selectMemory8GB(String name) {
        selectByVisibleTextFromDropDown(By.name("product_attribute_2"), name);

    }

    public void selectingHDD400GB() {
        clickOnElement(By.id("product_attribute_3_7"));
    }


    public void selectRadioButton(String message, By by){
        clickOnElement(by);
    }

    public void selectCheckBox(String message, By by){
        clickOnElement(by);
    }

    public void selectPressButton(String message, By by){
        clickOnElement(by);
    }

    public void mouseHoveronShoppingCartAndClickOnGoToCart(){
        mouseHoverOnElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        WebElement goToCart = driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        goToCart.click();

    }

    public void changeTheQuantityTo2AndClickOnUpdateShoppingCart(){
        clearContent(By.xpath("//input[@class='qty-input']"));
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
        clickOnElement(By.id("updatecart"));
    }

    public void fillingMandatoryFields(String message, String sendText, By by){
        sendTextToElement(by, sendText);
    }

    public void randomEmailGeneratorAndSendText(By by, String firstName, String lastName){
        Random randomGenerator = new Random();
        int emailNum = randomGenerator.nextInt(9999);
        String email = firstName + "." + lastName + emailNum + "@email.com";
        sendTextToElement(by, email);
    }


}
