package _30_Days_of_Code.Day10_Binary_Numbers;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int max = 0;
        int c = 0;
        int remainder = 0;
        while(n > 1){
            remainder = n % 2;
            n /= 2;
            if(remainder == 1){
                c++;
                if(n == 1 && ++c > max) max = c;
            }else if(remainder == 0){
                if(c > max) max = c;
                c = 0;
            }
        }
        System.out.println(max);
        scanner.close();
    }
}


