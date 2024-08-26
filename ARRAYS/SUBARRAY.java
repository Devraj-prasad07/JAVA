public class SUBARRAY {
    public static void subArray(int num[]) {
        int totalSum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                totalSum++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("The Total Sum is : " + totalSum);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        subArray(num);
    }
}
