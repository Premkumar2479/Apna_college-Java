package Oops;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        for(int i=0; i<=X; i++){
            if(X%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("odd");    
            }
        }
        sc.close();
    }
}
