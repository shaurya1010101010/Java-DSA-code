import java.util.Scanner;

public class squarePatternDecreasingInteger {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter n");
         int n = sc.nextInt();

         int i = 1;
         int num = 9;
         while (i <= n) {
             int j = 1;
              // Start with 9

             while (j <= n) {
                 System.out.print(num + " ");
                 j++;
                 num--;
             }

             System.out.println();
             i++;
         }
     }
 }


