package com.ecvictor.testng.nebula;

import com.ecvictor.testng.nebula.module.*;
import com.ecvictor.testng.nebula.module.HomePage;
import com.ecvictor.testng.nebula.pageObject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import static com.ecvictor.testng.nebula.module.Navigate_ChS.*;
/* Created by caoc on 2/10/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class ChineseSimpleTest extends BaseTest{

    private static WebDriver driver;

    @BeforeMethod
    public WebDriver setUp() throws Exception {
        driver = setUpBase();
        return driver;
    }

    @Test
    public static void testPage_ChS() throws Exception {
        PageFactory.initElements(driver, Homepage.class);
        PageFactory.initElements(driver, Navigate.class);
        PageFactory.initElements(driver, Aboutpage.class);
        PageFactory.initElements(driver, Teampage.class);
        PageFactory.initElements(driver, Technologypage.class);
        PageFactory.initElements(driver, Advisorspage.class);
        PageFactory.initElements(driver, Contactpage.class);

        //HomePageAction_ChS.clickLogin(driver);

        checkLogin(driver);

        Thread.sleep(2000);

        // Homepage_ChS.checkHomepage(driver);

        HomePage.clickdemo(driver);

        //Homepage_ChS.clicWhitePaper(driver);

        clickAbout(driver);

        AboutPage.checkAIpage(driver);

        AboutPage.clickSAPage(driver);

        AboutPage.clickVedio(driver);

        //clickStrategy();

        clickTechnology(driver);

        TechnologyPage.checkAIpage(driver);

        TechnologyPage.clickSAPage(driver);

        TechnologyPage.clickVideoPage(driver);

        clickTeam(driver);

        TeamPage.checkEachpage_ChS(driver);

        clickAdvisors(driver);

        AdvisorsPage.checkEachpage_ChS(driver);

        clickPartners(driver);

        clickInvestors(driver);

        clickContact(driver);
        ContactPage.checkAICommunity(driver);

        ContactPage.clickExploreNBAI(driver);

        ContactPage.clickGithub(driver);

        ContactPage.clickTwitter(driver);

        ContactPage.clickYoutube(driver);

    }


    @AfterMethod
    public void tearDown() throws Exception {
        tearDownBase(driver);
    }

}
