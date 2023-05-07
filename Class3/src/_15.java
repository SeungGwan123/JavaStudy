import java.util.InputMismatchException;
import java.util.Scanner;

public class _15 {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        while(true) {
            try {
                System.out.print("곱하고자 하는 두 수 입력>>");
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.print(n + "x" + m + "=" + n * m);
                scanner.close();
                break;
            }catch(InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine();
            }
        }
    }
}
