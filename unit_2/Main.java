class Student {
    String name;
    int age;
    static String college = "Christ University";
    
    Student() {
        name = "Unknown";
        age = 18;
    }
    
    Student(String n, int a) {
        name = n;
        age = a;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Dhanush", 21);
        s1.display();
        s2.display();
    }
}