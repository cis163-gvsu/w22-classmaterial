package inheritance;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void speak() {
        System.out.println("meow");
    }
    public void speak(int loudness) {
        System.out.println("MEOW");
    }
    public void changeName(String newname) {
        super.setName(newname);
    }
    
}
