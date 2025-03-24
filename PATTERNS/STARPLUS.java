
import java.util.*;

public class STARPLUS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of lines: ");
        int n = sc.nextInt();
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (mid == i || mid == j) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}