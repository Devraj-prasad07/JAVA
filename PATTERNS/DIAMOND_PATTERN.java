public class DIAMOND_PATTERN {
    public static void diamond_pattern(int n){
                    // 1st half
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
                    // 2nd half
        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_pattern(5);
    }
}
