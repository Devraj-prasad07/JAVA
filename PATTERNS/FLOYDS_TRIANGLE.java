public class FLOYDS_TRIANGLE {
    public static void floyds_triangle(int num) {
        int counter = 1;
        // Outer loop
        for (int i = 1; i <= num; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(10);
    }
}
