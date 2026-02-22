package Functionmethod;

// import java.util.Scanner;

public class Swaping {
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;

    }

    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;

        
    }


    public static void main(String args[]){
        //swap - values exchange
        int a=5;
        int b=10;
        swap(a,b);


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //swap
        
    
    }
}
