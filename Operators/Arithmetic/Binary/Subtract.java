package Operators.Arithmetic.Binary;

import java.util.Scanner;

public class Subtract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y = sc.nextInt();
        int diff = x-y;
        System.out.println(diff);
        sc.close();
    }
}
