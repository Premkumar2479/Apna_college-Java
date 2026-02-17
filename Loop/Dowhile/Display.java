package Loop.Dowhile;

import java.util.Scanner;

public class Display {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter your number :");
            n = sc.nextInt();

            if(n % 10 == 0){
                System.out.println("Multiple of 10 entered. Loop stopped.");
                break;
            }

            System.out.println("Number was : " + n);

        } while(true);

        sc.close();
    }
}
