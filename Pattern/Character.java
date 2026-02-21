package Pattern;

import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch ='A';
        int n = 5;
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
        }
        
        sc.close();
    }
}
