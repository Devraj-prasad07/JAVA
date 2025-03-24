import java.util.*;
public class crossStar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the No of lines: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(j == i || j + i == n + 1){
                        System.out.print("*" + " ");
                    } else{
                        System.out.print(" " + " ");
                    }
                }
                System.out.println();
            }
        }
    }
