import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car {
    private int doors;
    private String color;
    private int value;
    public Car(int doors, String color, int value) {
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
    public int getDoors() {
        return this.doors;
    }

    public void decreaseValue(int amount) {
        value -= amount;
    }

    public String toString() {
        return doors + " door " + color + " $" + value;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(4, "blue", 15000));
        cars.add(new Car(2, "yellow", 40000));
        cars.add(new Car(3, "black", 12000));
        cars.add(new Car(2, "blue", 20000));
        cars.add(new Car(4, "black", 25000));
        System.out.println("original cars list");
        System.out.println(cars);

        /*
        for(int i=0; i<cars.size(); i++) {
            cars.get(i).decreaseValue(1000);
        }
        */

        // Actually modifies the underlying cars
        cars.stream().forEach(c -> c.decreaseValue(1000));

        // Creates new cars with modified values
        // Note this one casts the output to an ArrayList
        ArrayList<Car> diffcars = (ArrayList<Car>) cars.stream()
            .map(c -> new Car(c.getDoors(),c.getColor(),c.getValue()-1000))
            .collect(Collectors.toList());
        System.out.println(diffcars);

        // Same think except this one goes directly to an array list
        ArrayList<Car> diffcars2 = cars.stream()
            .map(c -> new Car(c.getDoors(),c.getColor(),c.getValue()-1000))
            .collect(Collectors.toCollection(ArrayList::new));

        // All blue cars sorted by number of doors
        List<Car> blues = cars.stream()
                              .filter(c -> c.getColor().equals("blue"))
                              .sorted((c1,c2) -> ((Integer)c1.getDoors()).compareTo(c2.getDoors()))
                              .collect(Collectors.toList());

        // All cars sorted by color
        List<Car> colorsorted = cars.stream()
                              .sorted((c1,c2) -> (c1.getColor()).compareTo(c2.getColor()))
                              .collect(Collectors.toList());

        // Sum of all of the cars value
        double x = cars.stream()
            .mapToDouble(Car::getValue) // could replace with .mapToDouble(c -> c.getValue())
            .sum();

        
        System.out.println(x);
        //System.out.println(colorsorted);
    }
}
