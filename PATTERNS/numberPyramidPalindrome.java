import java.util.*;

public class numberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the NUM : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // Columns
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " "); // Spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Num in Ascending
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " "); // Num in descending
            }
            System.out.println();
        }
    }
}