// Loops & Logic Building
// Problem Statement 2
// Write a Java program to:
// Print numbers from 1 to N
// Print all even numbers between 1 and N
// Calculate the sum of numbers from 1 to N
// Must Use
// ✔ for loop
// ✔ while loop
// ✔ Variables
// ✔ Operators

import java.util.Scanner;

public class problem2 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    printNumbers(n);
    EvenNumbers(n);
    System.out.println(Sum(n));
 }   
 public static void printNumbers(int n){

    for(int i=1;i<=n;i++){
        System.out.print(i+" ");
    }
    System.out.println();
 }
 public static void EvenNumbers(int n){
    int i=1;
    while(i<=n){
        if(i%2==0){
            System.out.print(i+" ");
        }
        i++;
    }
    System.out.println();
 }
  public static int Sum(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    return sum;
 }
}
