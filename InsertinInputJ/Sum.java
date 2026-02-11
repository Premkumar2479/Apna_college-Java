package InsertinInputJ;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {

            int input = sc.nextInt();
            System.out.println(input);

            sc.nextLine(); // buffer clear

            String name = sc.nextLine();
            System.out.println(name);

            float price = sc.nextFloat();
            System.out.println(price);

            boolean condition = sc.nextBoolean();
            System.out.println(condition);

            short num = 15000;
            System.out.println(num);

            long population = 1400000000L;
            System.out.println(population);
        }
    }
}
