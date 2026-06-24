package recursionPep;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printDecreasing(n);
    }
    public static void printDecreasing(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

}


