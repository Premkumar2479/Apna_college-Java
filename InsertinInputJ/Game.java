package InsertinInputJ;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Messi goals
        int B = sc.nextInt(); // Messi assists
        int X = sc.nextInt(); // Ronaldo goals
        int Y = sc.nextInt(); // Ronaldo assists

        int messiPoints = 2 * A + B;
        int ronaldoPoints = 2 * X + Y;

        if (messiPoints > ronaldoPoints) {
            System.out.println("Messi");
        } else if (ronaldoPoints > messiPoints) {
            System.out.println("Ronaldo");
        } else {
            System.out.println("Equal");
        }

        sc.close();
    }
}
