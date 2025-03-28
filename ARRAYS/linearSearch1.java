// FIND ELEMENT X IN THE ARRAY.TAKE ARRAY AND X AS INPUT
import java.util.*;

public class linearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target Element : ");
        int x = sc.nextInt();
        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.print("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
