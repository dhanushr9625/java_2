class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix elements:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

class AccessDemo {
    private final int age = 25; 
    
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        System.out.println("Age: " + demo.age);
    }
}