class Person {
    public String name = "Alice";
    private int age = 25;
    protected String city = "Bengaluru";
    
    public void showPublic() {
        System.out.println("Public: " + name);
    }
    
    private void showPrivate() {
        System.out.println("Private Age: " + age);
    }
    
    public void accessPrivate() {
        showPrivate(); 
    }
}
public class AccessDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);   
        p.showPublic();                 
        p.accessPrivate();              
        System.out.println(p.city);     
    }
}