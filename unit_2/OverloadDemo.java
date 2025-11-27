class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("2.5 + 3.5 = " + calc.add(2.5, 3.5));
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));
    }
}