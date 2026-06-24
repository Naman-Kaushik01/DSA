package recursionPep;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printDecreasing(n);
        printIncreasing(n);
    }
    //printing n to 0
    public static void printDecreasing(int n){
        if (n == 0) {
            return;
        }
        System.out.println("Decreasing Order -> " +n);
        printDecreasing(n-1);
    }

    //printing 1 to n
    public static void printIncreasing(int n){
       if (n == 0) {
           return;
       }
        printIncreasing(n-1);
       System.out.println("Increasing Order -> " + n);
    }


}


