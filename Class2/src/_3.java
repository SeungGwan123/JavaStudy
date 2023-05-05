import java.util.Scanner;
public class _3 {
    public static void main(String agrs[]){
        System.out.print("금액을 입력하시오>>");
        Scanner money = new Scanner(System.in);
        int total = money.nextInt();
        System.out.println("오만원권 "+total/50000+"매");
        total %= 50000;
        System.out.println("만원권 "+total/10000+"매");
        total %=10000;
        System.out.println("천원권 "+total/5000+"매");
        total %=5000;
        System.out.println("백원 "+total/100+"매");
        total %=100;
        System.out.println("오십원 "+total/50+"매");
        total %=50;
        System.out.println("십원 "+total/10+"매");
        total %=10;
        System.out.println("일원 "+total+"매");
    }
}
