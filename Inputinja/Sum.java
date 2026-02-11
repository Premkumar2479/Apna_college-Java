package Inputinja;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  input = sc.nextInt();
        System.out.print(input);

        String name = sc.nextLine();
        System.out.println(name);

        sc.close();
    }
}
