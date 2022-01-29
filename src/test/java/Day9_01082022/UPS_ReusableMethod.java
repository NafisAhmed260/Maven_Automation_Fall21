package Day9_01082022;

import org.openqa.selenium.WebDriver;

import java.util.ResourceBundle;

public class UPS_ReusableMethod {
    public static void main(String[] args) {

        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to ups
        driver.navigate().to("https:///www.ups.com/us/en/Home.page");

        //click on Track
        Reusable_Actions.clickMethod(driver, "//*[text()='Tracking']", "Track");

        //click on track a package
        Reusable_Actions.clickMethod(driver, "//*[text()='Track a Package']", "Track a Package");

        //enter any tracking number
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","11111111111","enter tracking");

        //click on Track Button
        Reusable_Actions.clickMethod(driver, "//*[@id='stApp_btnTrack']", "Track Button");


        //capture the error message and print out only 'We could not locate the shipment'
        String resultValue = Reusable_Actions.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error Message");
        //declare array and split
        String[] arrayResult = resultValue.split("details");
        System.out.println("My error info is " + arrayResult[0]);



    }//end of test
    }//end of java
