package Conditionalstatem;

import java.util.Scanner;

public class Codecalcuate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

         int result = Y + (X - 1);
         System.out.println(result);
         sc.close();

    }
}
