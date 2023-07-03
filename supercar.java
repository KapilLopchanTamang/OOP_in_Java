class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Brand of the vehicle is : " + brand);
    }
}

class Car extends Vehicle {
    int year;

    Car(String brand, int year) {
        super(brand);
        this.year = year;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Year thee car was bought is : " + year);
    }
}

  class superkeyword {
    public static void main(String[] args) {
        Car myCar = new Car("Suzuki", 2023);
        myCar.displayInfo();
    }
}