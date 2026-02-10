package Variables;

import java.util.Scanner;

public class Perimeterectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int Breath = sc.nextInt();

        int Perimeter = 2*(Length+Breath);

        System.out.println(Perimeter);
        sc.close();
    }
}
