package Conditionalstatem;

import java.util.Scanner;

public class Codchef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (Y > X) {
                System.out.println("PROFIT");
            } else if (Y < X) {
                System.out.println("LOSS");
            } else {
                System.out.println("NEUTRAL");
            }
        }
        sc.close();
    }
}
