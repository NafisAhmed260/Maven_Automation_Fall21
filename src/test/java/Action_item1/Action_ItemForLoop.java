package Action_item1;

public class Action_ItemForLoop {

    public static void main(String[] args) {

        //iterate through all zipcodes defined by dynamic array using for loop
        String[] zipcode = new String[4];
        zipcode[0] = "11377";
        zipcode[1] = "11435";
        zipcode[2] = "11370";
        zipcode[3] = "11422";

        ///iterate through all street numbers defined by the dynamic array using for loop
            int[] streetNumber  = new int[4];
            streetNumber[0] = 143;
            streetNumber[1] = 254;
            streetNumber[2] = 47;
            streetNumber[3] = 64;

            for(int i =0; i < zipcode.length;i++){
                //print statement

                System.out.println("My zipcode is " + zipcode[i] + " and my street number is " + streetNumber[i]);

        }//end of for loop

        }//end of main method
}//end of java class
