package com.ecvictor.testng.nebula.module;

import com.ecvictor.testng.nebula.BaseTest;
import com.ecvictor.testng.nebula.pageObject.Homepage;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public  class HomePage extends BaseTest {

    public static void clickVideo(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Homepage.ViewVideo.click(); // click some link that opens a new window
        Thread.sleep(1000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://www.youtube.com/watch"));
                driver.close(); // close newly opened window when done with it
            }
        }
        driver.switchTo().window(parentHandle); // switch back to the original window;
    }

     public static void clickdemo(WebDriver driver) throws InterruptedException {
         String parentHandle = driver.getWindowHandle();

         Homepage.ViewDemo.click(); // click some link that opens a new window
         Thread.sleep(1000);
         for(String winHandle : driver.getWindowHandles()){
             driver.switchTo().window(winHandle);
             //driver.navigate().refresh();
         }
         // switch focus of WebDriver to the next found window handle (that's your newly opened window)

                    assertThat(driver.getCurrentUrl(), containsString("http://quantum.nebula-ai.network/"));
                    driver.close();
                    // close newly opened window when done with it
         driver.switchTo().window(parentHandle); // switch back to the original window;
   }

    public static void clicWhitePaper(WebDriver driver) throws InterruptedException {
        String parentHandle = driver.getWindowHandle();

        Homepage.WhitePaper.click(); // click some link that opens a new window
        Thread.sleep(1000);
        for (String winHandle : driver.getWindowHandles()) {
            if (!parentHandle.equals(winHandle)) {
                driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
                assertThat(driver.getCurrentUrl(), containsString("https://nebula-ai.com/whitepaper/NBAI_whitepaper_EN.pdf"));
                driver.close();
            }
        }// close newly opened window when done with it
        driver.switchTo().window(parentHandle); // switch back to the original window;
    }

}
