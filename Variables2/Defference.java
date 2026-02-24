package Variables2;

import java.util.Scanner;

public class Defference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a-b;

        System.out.println("Defference of product" + total);
        sc.close();
    }
}
