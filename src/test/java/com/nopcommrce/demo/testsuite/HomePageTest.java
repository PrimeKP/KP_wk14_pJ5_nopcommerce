package com.nopcommrce.demo.testsuite;

import com.nopcommrce.demo.pages.HomePage;
import com.nopcommrce.demo.testbase.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTestClass {

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation(){

        String actClick = homePage.selectMenu("Computers");
        String expClick = "Computers";
        Assert.assertEquals(actClick,expClick,"Not matching");

    }

}
