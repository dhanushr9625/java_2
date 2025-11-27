public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        
        System.out.println("Length: " + s1.length());
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Concatenation: " + s1 + " " + s2);
        System.out.println("Substring: " + s1.substring(0, 3));
        System.out.println("Equals: " + s1.equals("hello"));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase("hello"));
        
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb);
    }
}