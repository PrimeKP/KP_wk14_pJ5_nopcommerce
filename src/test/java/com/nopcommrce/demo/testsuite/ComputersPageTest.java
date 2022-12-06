package com.nopcommrce.demo.testsuite;

import com.nopcommrce.demo.pages.ComputersPage;
import com.nopcommrce.demo.testbase.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersPageTest extends BaseTestClass {

    ComputersPage computersPage = new ComputersPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computersPage.clickOnComputerAndDesktop();
        computersPage.sortComputerDesktops("6");
        Assert.assertEquals(computersPage.gettingListOfProduct(), computersPage.gettingListBeforeSorting());
    }



}
