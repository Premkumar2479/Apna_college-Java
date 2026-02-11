package Casting;

import java.util.Scanner;

public class Index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float: ");
        float a = sc.nextFloat();
        int b = (int) a;
        System.out.println(b);
        sc.close();
    }
}
