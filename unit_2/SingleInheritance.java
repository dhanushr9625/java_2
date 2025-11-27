class Animal {
    
    String name;
    Animal(String n) {
        name = n;
    }
    void speak() {
        System.out.println(name + " makes a sound");
    }
}
class Dog extends Animal {
    Dog(String n) {
        super(n);
    }
    
    @Override
    void speak() {
        System.out.println(name + " barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.speak(); // Output: Rex barks
    }
}