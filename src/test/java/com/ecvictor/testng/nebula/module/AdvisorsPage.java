package com.ecvictor.testng.nebula.module;

import com.ecvictor.testng.nebula.BaseTest;
import com.ecvictor.testng.nebula.pageObject.Advisorspage;
import com.ecvictor.testng.nebula.pageObject.Teampage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public  class AdvisorsPage extends BaseTest {

    public static void checkEachpage(WebDriver driver) throws InterruptedException {

        Advisorspage.APageTwo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.XUN_SHI.getText(), "DR. XUN SHI");

        Advisorspage.APageThree.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.ADAM_ALLOUBA.getText(), "ADAM ALLOUBA");
    }

    public static void checkEachpage_ChT(WebDriver driver) throws InterruptedException {

        Advisorspage.APageTwo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.XUN_SHI.getText(), "史遜博士");

        Advisorspage.APageThree.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.ADAM_ALLOUBA.getText(), "ADAM ALLOUBA");
    }

    public static void checkEachpage_ChS(WebDriver driver) throws InterruptedException {

        Advisorspage.APageTwo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.XUN_SHI.getText(), "史逊博士");

        Advisorspage.APageThree.click();
        Thread.sleep(2000);
        Assert.assertEquals(Advisorspage.ADAM_ALLOUBA.getText(), "ADAM ALLOUBA");
    }

}
