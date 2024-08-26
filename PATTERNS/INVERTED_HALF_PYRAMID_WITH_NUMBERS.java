public class INVERTED_HALF_PYRAMID_WITH_NUMBERS {
    public static void inverted_half_pyramid(int num){
        for(int i = 1; i <= num; i++){
            for ( int j = 1; j <= num - i + 1; j++ ){
                System.out.print(j + " ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(5);
    }
}
