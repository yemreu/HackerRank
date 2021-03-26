package _30_Days_of_Code.Day5_Loops;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d%n",n,i,n * i);
        }
    }
}