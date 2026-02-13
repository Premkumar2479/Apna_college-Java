package Conditionalstatem;

public class Largesthree {
    public static void main(String[] args){
    int A = 1, B = 3, C = 6;
    
    if((A>=B) && (A>=C)){
        System.out.println("largest is a");
    }
    else if(B>=C){
        System.out.println("largesst is b");
    }
    else {
        System.out.println("largest is c");
    }
    }
}
