package Interviewpractice;

import java.util.*;

public class Arrayques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of players
        int k = sc.nextInt();  // height of Gi-Hun and Ali

        int count = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if (h > k) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
