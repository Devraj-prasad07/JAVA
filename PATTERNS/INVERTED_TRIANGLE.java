import java.util.*;

public class INVERTED_TRIANGLE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of lines: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                if (i % 2 == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((char) (j + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}

// import java.util.*;

// public class Pattern1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No of lines: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(2 * j - 1 + " ");
//             }
//             System.out.println();
//         }
//     }

// }

// import java.util.*;

// public class Pattern1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No of lines: ");
//         int n = sc.nextInt();
//         int a = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(a + " ");
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }
