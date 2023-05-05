import java.util.Scanner;

public class _2 {
    public static void main(String args[]){
        System.out.print("2자리수 정수 입력(10~99)>>");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = num%10;
        if(num/10==first){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }else{
            System.out.println("NO!");
        }
    }
}
