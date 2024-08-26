package PRACTICE_QUESTIONS;
// While loops....
// <----------------->

// import java.util.*;
// public class loops {
//     public static void main (String args[]){
//         int i = 0;
//         while(i <= 10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// import java.util.*;

// public class loops {
//     public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the num: ");
//        int range = sc.nextInt();
//        int counter = 1;
//        while(counter <= range){
//        System.out.println(counter);
//        counter++;
//        }
//         }
// }

// import java.util.*;

// public class loops {
//     public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the num: ");
//        int n = sc.nextInt();
//        int range = 1;
//        while(range <= n){
//        System.out.println(range);
//        range++;
//        }
//         }
// }

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the num: ");
//         int num = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while (i <= num) {
//             sum = sum + i;
//             i++;
//         }
//          System.out.println(sum);
//     }
// }

// <------------------>
// For loops
// <---------------->

// import java.util.*;
// public class loops{
//     public static void main (String args[]){
//         for(int i = 0; i<=10; i++){
//             System.out.println("hello world");
//         }
//     }
// }

// import java.util.*;
// public class loops{
//     public static void main (String args[]){
//         for(int i = 1; i<=4; i++){
//             System.out.println("* * * *");
//         }
//     }
// }

// Print the reverse of the given Number..
// import java.util.*;
// public class loops{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the number whose reverse you want : ");
//         int num = sc.nextInt();
//         while (num > 0){
//         int reverse = num % 10;
//         System.out.print(reverse);
//         num = num / 10;
//       }
//       System.out.println();
//     }

// }

// import java.util.*;
// public class loops{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the number whose reverse you want: ");
//         int num = sc.nextInt();
//         int rev = 0;
//          while (num > 0){
//             int lastDigit = num % 10;
//             rev = (rev * 10) + lastDigit;
//             num = num / 10;
//          }
//          System.out.println(rev);
//     }
// }

// Do While Loops

// public class loops{
//     public static void main (String args[]){
//         int i = 0;
//         do{
//             System.out.println("Hello World");
//             i++;
//         } while(i <= 10);
//     }
// }

// public class loops{
//     public static void main (String args[]){
//         for (int i = 0; i <= 10; i++){
//             if(i == 7){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("You are out of the loop");
//     }
// }

// import java.util.*;
// public class loops{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         do{
//         System.out.print("Enter the Number: ");
//         int num = sc.nextInt();
//         if(num % 10 == 0){
//             break;
//         }
//         System.out.println(num);
//         } while(true);
//     }
// }

// Continue Keyword
// public class loops{
//     public static void main (String args[]){
//         for(int i = 1; i <= 10; i++){
//             if(i == 3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// WAP to check whether the no is Prime or not....

// import java.util.*;

// public class loops {
//     public static void main (String args []){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         if(num==2){
//             System.out.println(" Num is Prime");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(num); i++ ){
//                 if(num % i == 0){
//                  isPrime = false;
//                 } 
//             }
//         }
//         if (isPrime == 0){
//             System.out.println("The Number is Prime");
//         } else {
//             System.out.println("The number is not prime");
//         }
//     }
// }

// public class loops {
//     public static void main (String args []){
//         for(int i = 0; i <= 5; i++){
//             System.out.println("Hello World");
//             i = i+2;
//         }
//     } 
// }

//  Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// import java.util.*;

// public class loops{
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);
//         int num;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do{
//             System.out.print("Emter the number: ");
//             num = sc.nextInt();
//             if(num % 2 == 0){
//                 evenSum = evenSum + num;
//             } else {
//                 oddSum = oddSum + num;
//             }
//             System.out.println("Do you want to continue ? Press 1 for YES and 0 for NO");
//             choice = sc.nextInt();
//         } while (choice == 1);
//         System.out.println("Sum of Even numbers is : " + evenSum);
//         System.out.println("Sum of Odd numbers is : " + oddSum);
//     }
// }

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.println("Enter 1 to continue, or 0 to exit");
//             choice = sc.nextInt();
//             if (choice == 1) {
//                 System.out.print("Enter the number: ");
//                 num = sc.nextInt();
//                 if (num % 2 == 0) {
//                     evenSum = evenSum + num;
//                 } else {
//                     oddSum = oddSum + num;
//                 }
//             } else if (choice != 0) {
//                 System.out.println("Invalid choice. Please enter 1 or 0.");
//             }
//         } while (choice != 0);

//         sc.close();

//         System.out.println("Sum of Even numbers is : " + evenSum);
//         System.out.println("Sum of Odd numbers is : " + oddSum);
//  }
// }


//  Write a program to find the factorial of any number entered by the user.

// import java.util.*;

// public class loops{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int factorial = 1;

//         System.out.print("Enter the number whose factorial you want: ");
//         int num = sc.nextInt();

//         for(int i = 1; i <= num; i++){
//             factorial = factorial * i;
//         }
//         System.out.println("The factorial is : " + factorial);
//     }
// }

