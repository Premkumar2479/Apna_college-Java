package Conditionalstatem;

import java.util.Scanner;

public class Incometex {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long income = sc.nextLong();

    if(income<5L){
        System.out.println("Icome less than 5L");
    }
    else if(income>=5L && income<=10L){
        System.out.println("Income between 5-10L");
    }
    else if(income>10L){
        System.out.println("Income is 10L above");
    }
    else{
        System.out.println("Garib");
    }
    sc.close();
    }
}
