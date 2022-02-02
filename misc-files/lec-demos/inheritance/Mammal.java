package inheritance;

import java.util.ArrayList;

public class Mammal {
    private String name;
    public Mammal() {
        
    }
    public Mammal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("grr");
    }
    public void setName(String newname) {
        this.name = newname;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        ArrayList<Mammal> lst = new ArrayList<Mammal>();
        /*Cat c = new Cat("ezra");
        c.speak();
        lst.add(c);
        c.changeName("libby");
        System.out.println(lst.get(0).getName());
        c = new Cat("alice");
        System.out.println(lst.get(0).getName());
        lst.add(c);*/
        
        Mammal m = new Cat("abby");
        //m.speak();
        lst.add(m);
        m = new Dog("max");
        //m.speak();
        lst.add(m);
        ((Dog)m).changeName("sam");
        m = new Mammal("lucy");
        //m.speak();
        lst.add(m);

        for(Mammal m3 : lst) {
            System.out.println("name = " + m3.getName());
            m3.speak();
        }
        

        /*
        ArrayList<Mammal> zoo = new ArrayList<Mammal>();
        */

        /*
        Dog d1 = new Dog("chewie");
        d1.speak();
        zoo.add(d1);

        Mammal m1 = new Mammal("sam");
        m1.speak();
        zoo.add(m1);

        m1 = new Dog("max");
        m1.speak();
        zoo.add(m1);
        /*

        /*
        ((Dog)m1).changeName("Lucy");
        */

        /*
        Mammal m2 = new Cat("ezra");
        m2.speak();
        zoo.add(m2);
        */

        /*
        System.out.println("looping through zoo");
        for (Mammal m : zoo) {
            System.out.println("name = " + m.getName());
            m.speak();
        }
        */

    }
}