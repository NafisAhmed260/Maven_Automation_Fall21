package Action_item6;

import Day9_01082022.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express extends Reusable_Annotations {
    @Test()
    public void ExpressTest() throws BiffException, IOException, WriteException, InterruptedException {
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(1);
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(1);
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);
        int i = 1;
        while (i < rowCount2) {
            String size = writableSheet.getCell(0, i).getContents();
            System.out.println("My values are " + size);
            String quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + quantity);
            String firstName = writableSheet.getCell(2, i).getContents();
            System.out.println("My values are " + firstName);
            String lastName = writableSheet.getCell(3, i).getContents();
            System.out.println("My values are " + lastName);
            String email = writableSheet.getCell(4, i).getContents();
            System.out.println("My values are " + email);
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            System.out.println("My values are " + phoneNumber);
            String address = writableSheet.getCell(6, i).getContents();
            System.out.println("My values are " + address);
            String zipcode = writableSheet.getCell(7, i).getContents();
            System.out.println("My values are " + zipcode);
            String city = writableSheet.getCell(8, i).getContents();
            System.out.println("My values are " + city);
            String state = writableSheet.getCell(9, i).getContents();
            System.out.println("My values are " + state);
            String cardNumber = writableSheet.getCell(10, i).getContents();
            System.out.println("My values are " + cardNumber);
            String ExpMo = writableSheet.getCell(11, i).getContents();
            System.out.println("My values are " + ExpMo);
            String ExpYear = writableSheet.getCell(12, i).getContents();
            System.out.println("My values are " + ExpYear);
            String SecCode = writableSheet.getCell(13, i).getContents();
            System.out.println("My values are " + SecCode);
            String ErrorCode = writableSheet.getCell(14, i).getContents();
            System.out.println("My values are " + ErrorCode);
            driver.navigate().to("https://www.express.com");
            driver.manage().window().fullscreen();
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Express - Men's & Women's Clothing ")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }
            Reusable_Actions_Loggers.clickMethod(driver, "//*[@id='onetrust-accept-btn-handler']", logger, "close pop-up");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[@class='close_button-20856-button close_button-20856-button-d2 bluecoreCloseButton']", logger, "close popup");
            Reusable_Actions_Loggers.mouseHover(driver, "//*[contains(@href,'womens-clothing?W_HEADER_WOMENSCLOTHING')]", logger, "href");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@href,'womens-clothing/dresses/cat550007')]", logger, "Dresses");
            Thread.sleep(3000);
            Reusable_Actions.scrollByPixelMethod(driver, "0", "450", "scroll");
            Reusable_Actions_Loggers.clickByIndex(driver, "//*[@class='cdS1D9eKI7bXTMHp5xeAA']", 1, logger, "Second Pic");
            Thread.sleep(3000);
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + size + "']", logger, "Size");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Add to Bag']", logger, "Add to Bag");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='View Bag']", logger, "View Bag");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + quantity + "']", logger, "quantity");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout']", logger, "Checkout");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout as Guest']", logger, "Checkout as Guest");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='firstname']", firstName, logger, "firstname");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='lastname']", lastName, logger, "lastname");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='email']", email, logger, "email");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='confirmEmail']", email, logger, "email");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='phone']", phoneNumber, logger, "phoneNumber");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.line1']", address, logger, "Shipping");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.postalCode']", zipcode, logger, "zipcode");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.city']", city, logger, "city");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[@name='shipping.state']", logger, "state");
            Reusable_Actions_Loggers.selectByVisibleText(driver, "//*[@name='shipping.state']", state, logger, "state");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='creditCardNumber']", cardNumber, logger, "creditcardnumber");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[@name='expMonth']", logger, "expMonth");
            Reusable_Actions_Loggers.selectByVisibleText(driver, "//*[@name='expMonth']", ExpMo, logger, "expMonth");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[@name='expYear']", logger, "expMonth");
            Reusable_Actions_Loggers.selectByVisibleText(driver, "//*[@name='expYear']", ExpYear, logger, "ExpYear");
            Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='cvv']", SecCode, logger, "cvv");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Place Order']", logger, "Place Order");
            //String code = Reusable_Actions_Logger.getTextMethod(driver,"//*[text()='We experienced a problem submitting your payment. Please try again.']",logger,"Error Code");
            //capture the result
            String result = Reusable_Actions_Loggers.getTextMethod(driver, "//*[@class='_2paT8dZ2 _1gNCYBQ3']", logger, "Error");
            System.out.println("The error is " + result);

            //Step 5: storing the values to the writable excel sheet
            Label label = new Label(14, i, result);

            //I need to write back to the writable sheet
            writableSheet.addCell(label);
            driver.manage().deleteAllCookies();

            //increment
            i = i + 1;
        }//end of
        //end the logger
        writableFile.write();
        writableFile.close();
    }
}

