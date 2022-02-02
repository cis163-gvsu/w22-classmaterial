package inheritance;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    public void speak() {
        System.out.println("woof woof");
    }

    public void changeName(String newname) {
        super.setName(newname);
    }

    public void setName(String name) {
        super.setName(name.toUpperCase());
    }


}
