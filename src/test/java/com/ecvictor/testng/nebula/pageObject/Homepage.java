package com.ecvictor.testng.nebula.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-content\"]/p[3]/button[1]/span")
    public static WebElement ViewVideo;

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-content\"]/p[3]/button[2]/span")
    public static WebElement ViewDemo;

    @FindBy(how= How.XPATH, using="//*[@id=\"p1-content\"]/p[3]/button[2]")
    public static WebElement WhitePaper;


}
