public class MAX_SUBARRAY_OF_ARRAY_KADANES_ALGO {
    // public static void maxSubArray(int num[]) {
    // int sum = num[0];
    // int maxSum = num[0];
    // for (int i = 0; i < num.length; i++) {
    // if (sum >= 0) {
    // sum = sum + num[i];
    // } else {
    // sum = num [i];
    // }
    // if (sum > maxSum){
    // maxSum = sum;
    // }
    // }
    // System.out.print(maxSum);
    // // return maxSum;
    // }

    public static void maxSubArray(int num[]) {
        int maxSum = num[0], minSum = num[0], sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (sum > 0) {
                maxSum += sum;
            }
            if (sum < 0) {
                minSum += sum;
            }
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 4, -7, 8 };
        maxSubArray(num);
    }
}
