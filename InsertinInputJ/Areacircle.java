package InsertinInputJ;

import java.util.Scanner;

public class Areacircle {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            float radius =sc.nextFloat();
            float area = 3.14f * radius *radius;
            System.out.println(area);
        }
    }

}
