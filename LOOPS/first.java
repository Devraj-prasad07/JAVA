// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i < 10) {
//             System.out.println("hello world");
//             i++;
//         }
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         for(int i = 1 ; i <= num; i++){
//          sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no of lines you want to Print: ");
//         int num = sc.nextInt();
//         for(int lines = 1; lines <= num; lines++  ){
//             System.out.println("* * * *");
//         }
//         System.out.println("Stars Printed Successfully");
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No from where you want to print : ");
//         int num = sc.nextInt();
//         for (int i = num; i <= num + 10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// import java.util.*;

// public class first {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the start No: ");
//         int start = sc.nextInt();
//         System.out.print("Enter the End No: ");
//         int end = sc.nextInt();
//         int sum = 0;
//         for (int i = start; i <= end; i++) {
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the no to print Factorial : ");
//         int num = sc.nextInt();
//         int mul = 1;
//         for(int i = 1 ; i <= num; i++ ){
//             mul = mul * i;
//         }
//         System.out.println(mul);
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No : ");
//         int num = sc.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " * " + i + " = " + (num * i));
//         }
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Start No : ");
//         int start = sc.nextInt();
//         System.out.print("Enter the End No : ");
//         int end = sc.nextInt();
//         for(int i = start; i >= end; i--){
//             System.out.println(i);
//         }
//     }
// }

// Write a program to print all even numbers between 1 and 20 using a loop.
// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 20;i++){
//          if(i % 2 == 0 ){
//             System.out.println(i);
//          }
//         }
//     }
// }

// Write a program that takes an integer input and calculates the sum of its digits using a loop.
// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No : ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num > 0) {
//             int digit = num % 10;
//             sum = digit + sum;
//             num = num / 10;
//         }
//         System.out.println("Sum of Digits : " + sum);
//     }
// }

//  Print a Triangle Pattern
// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No : ");
//         int n = sc.nextInt();
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.println(" * ");
//             }
//         }
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the No : ");
//         int n = sc.nextInt();
//         int rev = 0;
//         while(n > 0){
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n = n / 10;
//         }
//         System.out.println(rev);
//     }
// }

// import java.util.*;

// public class first {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Input: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         int counter = 1;
//         while(counter <= num){
//             sum = sum + counter ;
//             counter ++;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// public class first {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the No : ");
//                 int n = sc.nextInt();
//                 for (int i = n; i <= n * 10; i = i + n) {
//                         System.out.println(i);
//                 }
//         }
// }

// import java.util.*;

// public class first {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the No : ");
//                 int n = sc.nextInt();
//                 System.out.print("Enter the No of times : ");
//                 int times = sc.nextInt();
//                 for (int i = n; i <= n * times; i++) {
//                         if(i % n == 0){
//                                 System.out.println(i);
//                         }
//                 }
//         }
// }

// import java.util.*;

// public class first {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the No : ");
//                 int n = sc.nextInt();
//                 int start = 3, ratio = 4;
//                 for(int i = 1; i <= n; i++){
//                         System.out.print(start + " ");
//                         start = start * ratio;
//                 } 
//         }
// }

// import java.util.*;

// // Print the HF of N
// public class first {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.print("Enter the No : ");
//                 int n = sc.nextInt();
//                 int hf = 1;
//                 for (int i = n - 1; i >= 1; i--) {
//                         if (n % i == 0) {
//                                 hf = i;
//                                 break;
//                         }
//                 }
//                 System.out.println("The Highest Common Factor of " + n + " is " + hf);
//         }
// }

// import java.util.*;

// // Check whether a no is prime or not
// public class first {
//         public static void main(String[] args) {
//                 int x = 4, y = 0;
//                 while( x >= 0){
//                      x--;
//                      y++;
//                 if(x == y) continue;
//                 else System.out.println(x + " " + y);
//                 }
//         }
// }

import java.util.*;

// Count the total digit in the number
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the NO : ");
        // int multi = 1;
        // boolean foundEven = false;
        // while (num > 0) {
        //     int lastDigit = num % 10;
        //     if (lastDigit != 0 && lastDigit % 2 == 0) {
        //         multi *= lastDigit;
        //         foundEven = true;
        //     }
        //     num /= 10;
        // }
        // if (foundEven) {
        //     System.out.println(multi);
        // } else {
        //     System.out.println("NO even No Found");
        // }

        // Print Reverse of a no
        // int rev = 0;
        // while(num > 0){
        //     int lastDigit = num % 10;
        //     rev = rev * 10 + lastDigit;
        //     num = num / 10;
        // }
        // System.out.println(rev);

        // Print the sum of given no and its reverse
        int num = sc.nextInt(), num1 = num, rev = 0;
        while(num1 != 0){
            int lastDigit = num1 % 10;
            rev = rev * 10 + lastDigit;
            num1 /= 10;
        }
        System.out.println(rev);
        System.out.println(num);
        System.out.println(rev + num);
    }
}
