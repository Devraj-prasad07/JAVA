
// FIND THE MAXIMUM VALUE OUT OF ALL THE ELEMENTS IN THE ARRAY.
import java.util.*;

public class linearSearch2 {
    public static void main(String[] args) {
        int arr[] = { 98, 38, 34, 55, 65, 76, 24, 86 };
        int max = 0 , min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The max no is : " + max);
        System.out.print("The min no is : " + min);
    }
}
