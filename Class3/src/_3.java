import java.util.Scanner;

public class _3 {
    public static void main(String args[]){
        System.out.print("정수를 입력하세요>>");
        Scanner num = new Scanner(System.in);
        for(int i=num.nextInt();i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
