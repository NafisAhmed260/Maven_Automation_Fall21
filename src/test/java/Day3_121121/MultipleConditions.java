package Day3_121121;

public class MultipleConditions {

    public static void main(String[] args) {

        //define the set of vaiables
        int a = 1;
        int b = 3;
        int c = 4;

        //verify a+b > c, a+b < c or a+b == c
        if(a+b >c){
            System.out.println("A & b is greater than c");
        }else if(a+b < c) {
            System.out.println("a & b is less than c");
        }else {
            System.out.println("a & b is equal than c");
        }


    }//emd of main
}//end of java class

