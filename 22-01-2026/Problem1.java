// Problem Statement
// Create a Java program that:
// Accepts a number from the user
// Checks whether the number is:
// Positive, Negative, or Zero
// Even or Odd
// Prints the result
// Must Use
// ✔ Variables
// ✔ Data types
// ✔ Operators
// ✔ if-else
// ✔ Input/Output
import java.util.*;

public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if(n>0){
            if(n%2==0){
                System.out.println("Number is Postive Even Number");
            }
            else{
                System.out.println("Number is Positive Odd Number");
            }
        }
        else if(n<0){
            if(n%2==0){
                System.out.println("Number is Negative Even Number");
            }
            else{
                System.out.println("Number is Negative Odd Number");
            }
        }
        else{
            System.out.println("Number is Zero");
        }

    }
}