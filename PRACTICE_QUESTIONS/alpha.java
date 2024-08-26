// import java.util.*;

// public class alpha{
//     public static void main(String[] args) {
//         int i = 1;
//         do{
//             System.out.println("Hello World");
//             i++;
//         } while(i<=10);
//     }
// }

// import java.util.*;

// public class alpha {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             if (i == 4) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//     }
// }

// import java.util.*;

// public class alpha {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter the number: ");
//             int a = sc.nextInt();
//             if (a % 10 == 0){
//                 break;
//             }
//             System.out.println(a);
//         }
//       while(true);
//     }
// }

// import java.util.*;

// public class alpha{
// public static void main(String[] args) {
//     for(int i = 0; i < 10; i++){
//         if(i == 3){
//             continue;
//         }
//         System.out.println(i);
//     }
// }
// }

// import java.util.*;

// public class alpha{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter the Number: ");
//             int a = sc.nextInt();
//             if(a % 10 == 0){
//                 continue;
//             }
//             System.out.println("The output is " + a);
//         } 
//         while (true);
//     }
// }

// public class alpha{
//     public static void main(String[] args) {
//         for(int i = 0; i < 5; i++){
//             System.out.println("hello");
//            i = i + 2;
//         }
//     }
// }

// import java.util.*;

// public class alpha {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the No to check whether it is Prime or Not: ");
//         int n = sc.nextInt();
//         if(n == 2){
//             System.out.println("n is prime");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(n); i++){
//                 if (n % i == 0){
//                      isPrime = false;
//                 }
//             }
//             if(isPrime == true){
//                 System.out.println( n + " is prime");
//             } else {
//                 System.out.println( n + " is not prime");
//             }
//         }
//     }
// }

// import java.util.*;

// public class alpha{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         do{
//          System.out.print("Enter the number: ");
//          int num = sc.nextInt();

//          if(num % 2 == 0){
//             evenSum = evenSum + num;
//          } else {
//             oddSum = oddSum + num;
//          }

//          System.out.println("Do you want to continue ? press 1 for yes or 0 for no ");
//           choice = sc.nextInt();
//         } while (choice == 1);

//         System.out.println("Sum of even num : " + evenSum);
//         System.out.println("Sum of odd num : " + oddSum);
//     }
// }

// import java.util.*;

// public class alpha{
//     public static void main(String[] args) {
//         for(int i = 0; i <= 10; i++){
//             System.out.println(i);
//         }
//     }
// }

// import java.util.*;

// public class alpha {

//     public static void main(String[] args) {
//         for(int line = 1; line <= 4; line++){
//             for(int star = 1; star <= line; star++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class alpha{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int line = 1; line <= n; line++){
//             for (int star = 1; star <= n - line + 1; star++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class alpha{
//     public static void main(String[] args) {
//         int n = 5;
//         for (int line = 1; line <= n; line++){
//             for (int num = 1; num <= line; num++){
//                 System.out.print(num);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class alpha{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the input to print numbers:  ");
//         int a = sc.nextInt();
//         for (int line = 1; line <= a; line++){
//         for (int num = 1; num <= line; num++){
//             System.out.print(num);
//         }
//         System.out.println();
//         }
//     }
// }

// public class alpha{
//     public static void helloWorld(){
//     System.out.println("hello world");
//     System.out.println("hello world");
//     System.out.println("hello world"); 
//     }
//     public static void main(String[] args) {
//         helloWorld(); // Function call
//     }
// }

// import java.util.*;

// public class alpha{
//     public static int calculateSum(int num1 , int num2){
//     int sum = num1 + num2;
//     return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner (System.in);
//         System.out.print("Enter the value of A: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of B: ");
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("The sum value of A and B is : " + sum); 
//     }
// }

// import java.util.*;

// public class  alpha{
//     public static void swap(int a, int b){
//     int temp = a;
//      a = b;
//      b = temp;
//     }
//     public static void main(String[] args) {
//         int a = 5; 
//         int b = 10;
//         swap(a, b);
//         System.out.println("The value of a is : " + a);
//         System.out.println("The value of b is : " + b);
//     }
// }

// import java.util.*;
// public class alpha{
//     public static int multiply(int a , int b){
//         int product =  a * b;
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the value of A : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of B : ");
//         int b = sc.nextInt();
//         int prod = multiply(a, b);
//         System.out.println("The product of A and b is : " + prod);
//     }
// }

// public class alpha{
//     public static int sum(int a , int b){
//     return a + b;
//     }
//     public static float sum(float a, float b, float c){
//     return a + b + c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(5, 7));
//         System.out.println(sum(2.4f, 5.6f, 4.5f));
//     }
// }

// public class alpha {
//     public static boolean isPrime(int n) {
//         for (int i = 2; i <= n - 1; i++) {
//             if (n % 2 == 0) {
//                 return false;
//             }
//         } return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(8));
//     }

// }  

// public class alpha{
//     public static boolean isPrime(int n){
//         if (n == 2){
//             return true;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         } return true;
//     }
//     public static void isPrimeCheck(int n){
//         for(int i = 2; i <= n; i++){
//             if(isPrime(i)){
//                 System.out.print(" " + i);
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         isPrimeCheck(1000);
//     } 
// }

// import java.util.*;

// public class alpha{
//     public static void binToDec(int binNum){
//         int ans = binNum;
//         int decNum = 0; 
//         int pow = 0;
//         while(binNum > 0){
//             int lastDigit = binNum % 10; 
//              decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
//              pow++;
//              binNum = binNum / 10;
//         }
//           System.out.println(" Decimal of " + ans + " is : " + decNum );
//     } 
//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0; 
//         int binNum = 0;
//         while (n > 0){
//         int rem = n % 2;
//         binNum = binNum + (rem * (int) Math.pow(10,pow));
//         pow++;
//         n = n / 2;
//         }
//         System.out.println(" Binary of " + myNum + " is : " + binNum);
//     }
//     public static void main(String[] args) {
//       decToBin(23);
//     }
// }

//Write a program to compute the avg of three nos using methods
// import java.util.*;
// public class alpha{
// public static int avg(){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of A : ");
//     int a = sc.nextInt();
//     System.out.print("Enter the value of B : ");
//     int b = sc.nextInt();
//     System.out.print("Enter the value of C : ");
//     int  c = sc.nextInt();
//     int ans = (a + b + c) / 3;
//     return ans;
// }
// public static void main(String[] args) {
// System.out.println("The value of A + B + C is : " + avg());
// }
// }

// Write a method named isEven that accepts an int argument. The method should return true if the argument    is even, or false otherwise. Also write a program to test your method.

// import java.util.*;

// public class alpha {
//     public static boolean isEven(int num) {
//         if (num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the Num to check whether it is Even or Not : ");
//         int num = sc.nextInt();
//         if (isEven(num)) {
//         System.out.println("Even Integer");
//         } else {
//             System.out.println("Odd Integer");
//         }
//     }
// }

// import java.util.*;

// public class alpha {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num;

//         System.out.print("Enter an integer : ");
//         num = sc.nextInt();

//         if (isEven(num)) {
//             System.out.println("Number is Even");
//         } else {
//             System.out.println("Number is Odd");
//         }
//     }

//     public static boolean isEven(int num) {
//         if (num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

// import java.util.Scanner;

// public class alpha {
//     public static boolean isPalindrome(int num) {
//         int original = num;
//         int reversed = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num = num / 10;
//         }

//         return original == reversed;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to check if it's a palindrome: ");
//         int number = sc.nextInt();

//         if (isPalindrome(number)) {
//             System.out.println(number + " is a palindrome.");
//         } else {
//             System.out.println(number + " is not a palindrome.");
//         }
//     }
// }


// Write a Java method to compute the sum of the digits in an integer.

// import java.util.*;

// public class alpha {

//     public static int sumDigit(int num){
//         int sumOfDigit = 0;
//         while (num > 0) {
//             int lastDigit = num % 10;
//             sumOfDigit = sumOfDigit + lastDigit;
//             num = num / 10;
//         }
//         return sumOfDigit;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the Integer: ");
//         int digit = sc.nextInt();
//         System.out.println(sumDigit(digit));
//     }
// }

