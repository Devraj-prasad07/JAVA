import java.util.*;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the NUM : ");
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) { // columns
            for (int j = 1; j <= nsp; j++) { // Spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) { // Stars
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}
