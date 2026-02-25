package Loop.Forloop;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            int t = sc.nextInt();

            if(t%2 == 0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
