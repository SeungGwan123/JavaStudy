import java.util.Scanner;

public class _8 {
    public static void main(String args[]){
        System.out.print("두점을 입력하세요>>");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        int a = num.nextInt();
        int b = num.nextInt();
        if((x<=200&&x>=100||a<=200&&a>=100)&&(y<=200&&y>=100||b<=200&&b>=100)){
            System.out.print("충돌합니다!");
        }else{
            System.out.print("충돌 안합니다!");
        }
    }
}
