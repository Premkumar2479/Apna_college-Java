package Conditionalstatem;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases
        
        while (T-- > 0) {
            int X = sc.nextInt();  // Jerry's speed
            int Y = sc.nextInt();  // Tom's speed
            
            if (Y > X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
