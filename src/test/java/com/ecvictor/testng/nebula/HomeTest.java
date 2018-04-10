package com.ecvictor.testng.nebula;

import com.ecvictor.testng.nebula.module.*;
import com.ecvictor.testng.nebula.module.Navigate_ChS;
import com.ecvictor.testng.nebula.module.Navigate_ChT;
import com.ecvictor.testng.nebula.module.Navigate_En;
import com.ecvictor.testng.nebula.pageObject.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.ecvictor.testng.nebula.module.ContactPage.clickHome;
import static com.ecvictor.testng.nebula.module.Navigate_En.*;
/* Created by caoc on 2/10/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class HomeTest extends BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public WebDriver setUp() throws Exception {
        driver = setUpBase();
        return driver;

    }

    @Test
    public void tesPage_En() throws Exception {
        //TitleTest.testOpenHomePage();
       PageFactory.initElements(driver, Homepage.class);
        PageFactory.initElements(driver, Navigate.class);
        PageFactory.initElements(driver, Contactpage.class);
        clickContact(driver);

        ContactPage.clickExploreNBAI(driver);

        ContactPage.clickGithub(driver);

        ContactPage.clickTwitter(driver);

        ContactPage.clickFacebook(driver);

        ContactPage.checkAICommunity(driver);

        ContactPage.clickYoutube(driver);

        clickHome(driver);

    }

    @AfterTest
    public void tearDown() throws Exception {
        tearDownBase(driver);
    }

}
