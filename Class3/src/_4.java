import java.util.Scanner;
import java.util.StringTokenizer;

public class _4 {
    public static void main(String args[]){
        System.out.print("알파벳을 입력하세요>>");
        Scanner text = new Scanner(System.in);
        //Scanner에서 char형으로 받는법 -> scanner.next().charAt(0);
        char num = text.next().charAt(0);
        for(int i = num; i>=97; i--){
            for(int j=97;j<=i;j++){
                System.out.printf("%s",(char)j);
            }
            System.out.println();
        }
    }
}
