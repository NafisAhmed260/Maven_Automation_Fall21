package Action_item5;

import Day9_01082022.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu {

    WebDriver driver ;


    @BeforeSuite
    public void SetTheDriver (){
        driver = Reusable_Actions.setDriver();


    } // setting up the webdriver

    @Test(priority = 1)
    public void huluTestcase ()  {


        ArrayList<String> email = new ArrayList<>();

        email.add("uipta46346454545445454545545454545458@gmail.com");
        email.add("dipta22454545454545454545454545454545@gmail.com");

        ArrayList<String> password = new ArrayList<>();
        password.add("fnEkenfe3");
        password.add("fWejnfej");

        ArrayList <String> name = new ArrayList<>();
        name.add("helloHulu");
        name.add("hello world");

        ArrayList <String> month = new ArrayList<>();
        month.add("May");
        month.add("June");

        ArrayList<String> day = new ArrayList<>();
        day.add("1");
        day.add("2");

        ArrayList <String> year = new ArrayList<>();
        year.add("1990");
        year.add("1998");

        ArrayList<String> Gender = new ArrayList<>();
        Gender.add("Male");
        Gender.add("Female");


        for(int i = 0; i < day.size(); i++) {

            driver.navigate().to("https://www.hulu.com");

            String Title = driver.getTitle();
            if(Title.contains("Stream TV and Movies")) {
                System.out.println("Title is correct");
            }else {
                System.out.println("Title is not correct " + Title);
            } //verify the title

            Reusable_Actions.ScrollingPixel(driver, "0", "5000");

            Reusable_Actions.clickMethod(driver, "//*[text()='SELECT']", "Clicking on Select");


            Reusable_Actions.sendMethod(driver, "//*[@id='email']", email.get(i), "Email");

            Reusable_Actions.sendMethod(driver, "//*[@id='password']", password.get(i),"Password");

            Reusable_Actions.sendMethod(driver,"//*[@id='firstName']",name.get(i),"Name");

            // click birthday
            Reusable_Actions.clickMethod(driver,"//*[text()='Month']","Clicking month dropdown");
            Reusable_Actions.clickMethod(driver,"//*[text()='"+month.get(i)+"']","Birthday");

            //clicking on day

            Reusable_Actions.clickMethod(driver,"//*[text()='Day']","Clicking on Day");
            Reusable_Actions.clickMethod(driver,"//*[text()='"+day.get(i)+"']","Days");

            //Clicking on Year

            Reusable_Actions.clickMethod(driver,"//*[text()='Year']","Clicking on Year");
            Reusable_Actions.clickMethod(driver,"//*[text()='"+year.get(i)+"']","Years");

            // Clicking Gender

            Reusable_Actions.clickMethod(driver,"//*[text()='Select']","Clicking on gender");
            Reusable_Actions.clickMethod(driver,"//*[text()='"+Gender.get(i)+"']","Gender");


            //clicking on CONTINUE
            Reusable_Actions.clickMethod(driver,"(//*[text()='CONTINUE']) [2] ","CONTINUE");

            String total = Reusable_Actions.getTextMethod(driver,"//*[@class='ledger__content']","Total due");
            String Money = Reusable_Actions.getTextMethod(driver,"//*[@class='panel large'][2]","$$");

            System.out.println("Total :" + total + " " + Money);



            driver.manage().deleteAllCookies();



        } // end of for loop

    } // end of test 1



    @Test (dependsOnMethods = "huluTestcase")

    public void HuluTestcase2(){
        driver.navigate().to("https://www.hulu.com");

        Reusable_Actions.clickMethod(driver,"//*[text()='Log In']","Log In");

        Reusable_Actions.sendMethod(driver,"//*[@id='email_id']","uipta46346454545445454545545454545458@gmail.com","Email");

        Reusable_Actions.sendMethod(driver,"//*[@id='password_id']","fnEkenfe3","Password");

        Reusable_Actions.clickMethod(driver,"//*[text()='LOG IN']","Click on");

        String Name =  Reusable_Actions.getTextMethod(driver,"//*[text()='helloHulu')]","Display Name");
        System.out.println("The name of the account is " + Name);
    }


    @AfterSuite
    public void  quitSession(){
        driver.manage().deleteAllCookies();
        driver.quit();

    }
    
} // end of TestNG
