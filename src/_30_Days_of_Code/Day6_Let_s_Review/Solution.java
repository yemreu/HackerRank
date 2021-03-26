package _30_Days_of_Code.Day6_Let_s_Review;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        char[] sChars;
        String S;
        for(int i=0;i<T;i++){
              S = scan.nextLine();
              sChars = S.toCharArray();
              for(int j=0;j<sChars.length;j+=2){
                  System.out.print(sChars[j]);
              }
              System.out.print(" ");
              for(int k=1;k<sChars.length;k+=2){
                  System.out.print(sChars[k]);
              }
              System.out.println();
        }
        scan.close();
    }
}