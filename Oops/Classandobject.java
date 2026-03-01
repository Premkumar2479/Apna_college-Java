package Oops;

public class Classandobject {
    public static void main(String[] args){

        // Objects of pen class
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);


        //Object of BankAccount class
        BankAccount myAcc = new BankAccount();

        myAcc.username = "Nick john";
        myAcc.setPassword("abcdefghi");
    }
}


// This is class
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}


// This is a class
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;

    float percentage;  //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}