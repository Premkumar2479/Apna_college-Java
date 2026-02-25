package Loop.Forloop;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            System.out.print(n);
        }
        sc.close();
    }
}
