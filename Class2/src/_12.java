import java.util.Scanner;

public class _12 {
    public static void main(String args[]){
        System.out.print("연산 >>");
        Scanner ma = new Scanner(System.in);
        int a = ma.nextInt();
        String m = ma.next();
        int b = ma.nextInt();
        switch(m){
            case "+":System.out.printf("%d%s%d의 계산 결과는 %d",a,m,b,(a+b));
            break;
            case "-":System.out.printf("%d%s%d의 계산 결과는 %d",a,m,b,(a-b));
                break;
            case"*":System.out.printf("%d%s%d의 계산 결과는 %d",a,m,b,(a*b));
                break;
            case"/":if(b==0){
                System.out.println("0으로 나눌 수 없습니다.");
                break;
            }else{
                System.out.printf("%d%s%d의 계산 결과는 %d",a,m,b,(a/b));
                break;
            }
        }
    }
}
