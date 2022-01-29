package Action_item1;

public class Action_Item_WhileLoop{

  public static void main(String[] args) {

      //iterate through all zipcodes defined by dynamic array using while loop
      String[] zipcode = new String[4];
      zipcode[0] = "11377";
      zipcode[1] = "11435";
      zipcode[2] = "11370";
      zipcode[3] = "11422";

      ///iterate through all street numbers defined by the dynamic array using while loop
      int[] streetNumber  = new int[4];
      streetNumber[0] = 143;
      streetNumber[1] = 254;
      streetNumber[2] = 47;
      streetNumber[3] = 64;

      //declare and define the initial starting point
      int i = 0;
      //define while loop with your end point(condition)
      while(i<streetNumber.length){
          System.out.println("My zipcode is " + zipcode[i] + " and my street number is " + streetNumber[i]);
          i = i+1; //if there is no incrementation, the while loop becomes infinite loop


      }// end of while loop

}//end of main
}//end of java class


