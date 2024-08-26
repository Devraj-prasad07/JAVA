public class PALENDROMIC_WITH_NUMBER {
    public static void palendromic_pattern_with_number(int n){
        for(int i = 1; i <= n; i++){
            // FOR SPACES
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            // FOR DESCENDING ORDER
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            // FOR ASCENDING ORDER
            for(int l = 2; l <= i; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palendromic_pattern_with_number(5);
    }
}
