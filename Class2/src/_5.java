import java.util.Scanner;

public class _5 {
    public static void main(String args[]){
        System.out.print("정수 3개를 입력하시오");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int byun = Math.max(a,Math.max(b,c));
        if(Math.pow(byun,2)==Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)-Math.pow(byun,2)){
            System.out.println("삼각형이 됩니다.");
        }else{
            System.out.println("삼각형이 안됩니다.");
        }
    }
}
