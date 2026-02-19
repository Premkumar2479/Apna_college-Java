package Conditionalstatem;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int read = sc.nextInt();
        int exectly = sc.nextInt();

        if(hour*read>=exectly){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sc.close();

    }    
}
