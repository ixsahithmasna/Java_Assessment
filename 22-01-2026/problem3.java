
// Methods & Reusability
// Problem Statement
// Create a Java program that has the following methods:
// add(int a, int b) → returns sum
// isEven(int number) → returns true/false
// findFactorial(int number) → returns factorial
// Call these methods from main() and print results.
// Must Use
// ✔ Methods
// ✔ Return types
// ✔ Parameters
// ✔ Method calls

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Adding of two Numbers " + add(a, b));
        System.out.println(CheckEven(a));
        System.out.println(Factorial(a));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean CheckEven(int a) {
        return a % 2 == 0;
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * Factorial(n - 1);
    }
}
