package Action_item2;

public class Assignment1_Conditional_Statement {
    public static void main(String[] args) {

        //create a dynamic array for 4 different cities, iterate through the values but only print when city is near
        //brooklyn or manhattan

        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Bronx";

        int j = 0;
        while(j <cities.length){
            //two if conditions
            //when you are not sure if the value is in upper case , lower case or mixed case
            if(cities[j].toLowerCase().equals("brooklyn")){
                System.out.println("City is " + cities[j]);
            }else if(cities[j].toUpperCase().equals("MANHATTAN")) {
                System.out.println("City is " + cities[j]);
            }//end of conditions
            j++;
        }//end of while loop



    }//end of main
}//end of java class
