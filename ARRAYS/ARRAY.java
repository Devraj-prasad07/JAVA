// public class ARRAY {
//     public static int linearSearch(int number[], int key) {
//         for (int i = 0; i <= number.length; i++) {
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int number[] = { 21, 22, 23, 45, 67, 8, 99, 78, 56, 89 };
//         int key = 8;
//         int index = linearSearch(number, key);
//         if (index == -1){
//             System.out.println("Not Found");
//         } else {
//             System.out.println("The number was at " + index);
//         }

//     }
// }

// public class ARRAY {
//     public static void isPattern(int num) {
//         for (int i = 1; i <= num; i++) {
//             // For Spaces
//             for (int j = 1; j <= num - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         isPattern(5);
//     }
// }

public class ARRAY {
    public static int isLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 6, 3, 5, 7, 8,9};
        System.out.println(isLargest(num));
    }
}