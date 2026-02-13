package Conditionalstatem;

public class Ifelse {
    public static void main(String[] args){
        int age =17;
        if(age>=18){
            System.out.println("You are eligible to Vote ");
        }
        
        if(age>13 && age<18){
            System.out.println("Teenager");
        }
        
        
        else{
            System.out.println("You are not to eligible to Vote");
        }
    }
}
