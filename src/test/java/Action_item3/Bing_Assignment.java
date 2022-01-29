package Action_item3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bing_Assignment {
    public static void main(String[] args) throws InterruptedException {


        //set an arrayWebDriver driver = new ChromeDriver(options);
        String[] sports = new String[6];
        sports[0] = "Bowling";
        sports[1] = "Football";
        sports[2] = "Tennis";
        sports[3] = "Boxing";
        sports[4] = "Cricket";
        sports[5] = "Hockey";

        //define the webdriver outside of the for loop
        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //declare all arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);


        for (int i = 0; i < sports.length; i++) {
            //simply open the bing website
            driver.navigate().to("https://www.bing.com");

            //maximize my browser
            driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for countries on bing search field
            driver.findElement(By.xpath("//*[@name='q']"));
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys((sports[i]));


            //hit submit on bing search button
            driver.findElement(By.xpath("//*[@type='search']")).submit();

            //another wait statement since we came to a new page(result page)
            Thread.sleep(3000);

            //capture the search result
            String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();
            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //now print the search number only
            System.out.println("My search result for sport " + sports[i] + " is " + arrayResult[0]);

        }
        driver.quit();


    }// end of main
}//end of java
