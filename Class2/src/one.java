import java.util.Scanner;

public class one {
    public static void main(String args[]){
        System.out.print("원화를 입력하세요(단위 원)>> ");
        Scanner scanner = new Scanner(System.in);
        float dollar = scanner.nextFloat();
        float won = dollar/(float)1100.0;
        System.out.print("3300원은 $"+won+"입니다.");
    }
}
