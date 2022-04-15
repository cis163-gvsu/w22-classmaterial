package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car {
    private int doors;
    private String color;
    private int value;
    private String model;
    private String make;

    public Car(int doors, String color, int value, String model, String make) {
        this.doors = doors;
        this.color = color;
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.color;
    }
    public String getModel() {
        return this.color;
    }
    public int getDoors() {
        return this.doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void decreaseValue(int amount) {
        value -= amount;
    }

    public String toString() {
        return doors + " door " + color + " $" + value;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(4, "blue", 15000, "Pontiac", "Grand Am"));
        cars.add(new Car(2, "yellow", 40000, "Honda", "Civic"));
        cars.add(new Car(4, "blue", 28000, "Honda", "Accord"));
        cars.add(new Car(3, "black", 12000, "Chevy", "Cruze"));
        cars.add(new Car(2, "blue", 20000, "Ford", "Mustang"));
        cars.add(new Car(2, "red", 22000, "Chevy", "Corvette"));
        cars.add(new Car(4, "black", 25000, "Honda", "Pilot"));
        cars.add(new Car(4, "blue", 28000, "Honda", "CRV"));
        System.out.println("original cars list");
}
