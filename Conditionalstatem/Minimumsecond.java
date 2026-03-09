package Conditionalstatem;

import java.util.Scanner;

public class Minimumsecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int second;

            if ((a >= b && a <= c) || (a >= c && a <= b))
                second = a;
            else if ((b >= a && b <= c) || (b >= c && b <= a))
                second = b;
            else
                second = c;

            System.out.println(second);
        }
        
        sc.close();
    }
}
