import java.util.Scanner;

public class _4 {
    public static void main(String args[]){
        System.out.print("정수 3개 입력 >>");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int middle = a<b?(c<a?a:(c<b?c:b)):(b<c?b:(a<c?c:a));
        System.out.println(middle);
    }
}
