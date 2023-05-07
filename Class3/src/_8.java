import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.fill;

public class _8 {
    public static void main(String args[]) {
        int[] check = new int[101];
        Random r = new Random();
        Arrays.fill(check, 0);
        System.out.print("정수 몇개?");
        Scanner scanner = new Scanner(System.in);
        int cycle = scanner.nextInt();
        for(int i=1;i<=cycle;i++){
          while(true){
              int num = r.nextInt(100);
              if(check[num]==0){
                  check[num]=1;
                  System.out.printf("%d ",num);
                  break;
              }
          }
          if(i%10==0){
              System.out.println();
          }
        }
    }
}
