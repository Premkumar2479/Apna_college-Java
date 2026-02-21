package Conditionalstatem;

import java.util.Scanner;

public class Ifcode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int K = sc.nextInt();

        // Step 2: Absolute difference
        int diff = Math.abs(X - Y);

        // Step 3: Condition check
        if (diff <= K) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
