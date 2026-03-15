package Oops;

class Car {

    String brand;
    int price;

    Car(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 5000000);
        c1.display();
    }
}
