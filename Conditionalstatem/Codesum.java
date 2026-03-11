package Conditionalstatem;

import java.util.Scanner;

public class Codesum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int A = sc.nextInt();
        int M = sc.nextInt();
        int B = sc.nextInt();

        int profit = (M * B) - (N * A);
        System.out.println(profit);
        sc.close();
    }
}
