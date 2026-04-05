package Interviewpractice;

import java.util.*;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            int current = 0;
            int maxHappy = 0;
            int minHappy = 0;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                
                if (x >= l && x <= r) {
                    current += 1;
                } else {
                    current -= 1;
                }
                
                maxHappy = Math.max(maxHappy, current);
                minHappy = Math.min(minHappy, current);
            }
            
            System.out.println(maxHappy + " " + minHappy);
        }
        
        sc.close();
    }
}
