package com.ecvictor.testng.nebula.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Contactpage {
    @FindBy(how= How.XPATH, using="//*[@id=\"fullpage\"]/div[9]/div/a[2]")
    public static WebElement ExploreNBAI;

    @FindBy(how = How.XPATH, using = "//*[@id=\"fullpage\"]/div[9]/div/div[5]/a[1]/i")
    public static WebElement Github;

    @FindBy (how = How.XPATH, using = "//*[@id=\"fullpage\"]/div[9]/div/div[5]/a[2]/i")
    public static WebElement Twitter;

    @FindBy(how = How.XPATH, using = "//*[@id=\"fullpage\"]/div[9]/div/div[5]/a[3]/i")
    public static WebElement AICommunity;

    @FindBy(how = How.XPATH, using ="//*[@id=\"fullpage\"]/div[9]/div/div[5]/a[4]/i")
    public static WebElement Youtube;
}
