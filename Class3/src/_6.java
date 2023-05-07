import java.util.Scanner;

public class _6 {
    public static void main(String args[]){
        System.out.print("금액을 입력하시오>>");
        Scanner money = new Scanner(System.in);
        int wallet = money.nextInt();
        int[] trans = {50000,10000,1000,500,100,50,10,1};
        for(int i=0;i<8;i++){
            if(wallet/trans[i]!=0) {
                System.out.printf("%d원 짜리 : %d\n", trans[i], wallet / trans[i]);
                wallet %= trans[i];
            }
        }
    }
}
