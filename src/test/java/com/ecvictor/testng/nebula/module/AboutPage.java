package com.ecvictor.testng.nebula.module;

import com.ecvictor.testng.nebula.BaseTest;
import com.ecvictor.testng.nebula.pageObject.Aboutpage;
import com.ecvictor.testng.nebula.pageObject.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public  class AboutPage extends BaseTest {

    public static void checkAIpage(WebDriver driver) throws InterruptedException {

        String parentHandle = driver.getWindowHandle();

        Aboutpage.AIPage.click(); // click some link that opens a new window

        Thread.sleep(3000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)

                Assert.assertEquals(driver.getCurrentUrl(), "http://www.cointime.com/blockchain/10359.html");
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window

    }

     public static void clickSAPage(WebDriver driver) throws InterruptedException {
         String parentHandle = driver.getWindowHandle();

         Aboutpage.SOHUPage.click(); // click some link that opens a new window

         Thread.sleep(3000);
         for (String winHandle : driver.getWindowHandles()) {
             if (!parentHandle.equals(winHandle)) {
                 driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                 Assert.assertEquals(driver.getCurrentUrl(), "http://www.sohu.com/a/222346472_305032");
                 driver.close();
             }
         }// close newly opened window when done with it
         driver.switchTo().window(parentHandle); // switch back to the original window
   }

    public static void clickVedio(WebDriver driver) throws InterruptedException {

        System.out.println("Start ...ksfdlkjfljsdlfjldsf");

        driver.switchTo().frame(Aboutpage.IFrame);

        System.out.println("after frame ...ksfdlkjfljsdlfjldsf");
        Aboutpage.StartPlayVideo.click(); // click some link that opens a new window

        Thread.sleep(5000);

//        Boolean b = Aboutpage.IFrame.getCssValue("video.video-stream.html5-main-video").startsWith("0");
//        if (b) {
//            driver.switchTo().frame();
//        }
        System.out.println("before sdlkfjsdjfljsdg");
        Aboutpage.PlayButton.click();
        Thread.sleep(2000);

        System.out.println("after sdkgjldjgljsdlafj");





        String playtime = Aboutpage.VideoTime.getAttribute("innerHTML");

        System.out.println("time:"+playtime);


        Assert.assertNotEquals(playtime, "0.00");

        driver.switchTo().defaultContent();

    }

}
