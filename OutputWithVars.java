import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); //sets up the Scanner for input
      int userNum, userNum2; //two variables to hold the user's inputs

      System.out.println("Enter integer:");
      userNum = scnr.nextInt(); //gets the first user input
      
      //print out the square of the number and the cube of the number
      //hint: you can square or cube a number by multiplying the number by itself
      int userNumFinal = (userNum * userNum);
        System.out.println(userNum + " squared = " + userNumFinal);

        int userNumFinal2 = (userNum * userNum * userNum);
        System.out.println(userNum + " cubed = " + userNumFinal2);

      System.out.println("Enter another integer:");
      userNum2 = scnr.nextInt(); //gets the second user input
      //print out the sum of the two numbers (add them together)
      //print out the product of the two numbers (multiply them together)
       int userNumFinal3 = (userNum + userNum2);
        System.out.println(userNum + " + " + userNum2 + " = " + userNumFinal3);

        int userNumFinal4 = (userNum * userNum2);
        System.out.println(userNum + " * " + userNum2 + " = " + userNumFinal4);
      
   }
}