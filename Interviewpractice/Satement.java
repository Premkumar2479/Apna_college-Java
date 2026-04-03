package Interviewpractice;

import java.util.Scanner;

public class Satement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        int cuboidVolume = A * B * C;
        int cubeVolume = X * X * X;

        if (cuboidVolume > cubeVolume) {
            System.out.println("Cuboid");
        } else if (cubeVolume > cuboidVolume) {
            System.out.println("Cube");
        } else {
            System.out.println("Equal");
        }
            sc.close();

    }
}
