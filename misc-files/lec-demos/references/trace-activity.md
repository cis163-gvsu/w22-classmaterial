# Tracing References in Code

Consider the following code:

```
    String color;
    int doors;

    public Car(String color, int doors) {
        this.color = color;
        this.doors = doors;
    }
    public int getDoors() {
        return this.doors;
    }
    public void setDoors(int d) {
        this.doors = d;
    }
    public void repaint(String c) {
        color = c;
    }
    public String getColor() {
        return this.color;
    }
    public void crash(Car c2, Car c3) {
        Car c4 = c3;
        Car c5 = new Car("orange", 2);
        c3 = c5;
        this.repaint(c2.getColor());
        this.doors -= 1;
        c4.setDoors(c4.getDoors()-2);
        c2 = this;
        c3.repaint(this.color);
        c5.repaint("blue");
        c2 = c5;
    }

    public static void main(String[] args) {
        Car c1 = new Car("black", 4);
        Car c2 = new Car("yellow", 3);
        Car c3 = new Car("green", 2);

        c3.crash(c1,c2);
        
        System.out.println(c1.getColor());
        System.out.println(c2.getColor());
        System.out.println(c3.getColor());

        System.out.println(c1.getDoors());
        System.out.println(c2.getDoors());
        System.out.println(c3.getDoors());

        Car c4 = new Car("black", 4);
        Car c5= new Car("green", 2);

        c4.crash(c5,c5);
        System.out.println(c4.getColor());
        System.out.println(c5.getColor());
        System.out.println(c4.getDoors());
        System.out.println(c5.getDoors());
    }
}
```

What is the output of this code?

Line 1:

Line 2:

Line 3:

Line 4:

Line 5:

Line 6:

Line 7:

Line 8:

Line 9:

Line 10:
