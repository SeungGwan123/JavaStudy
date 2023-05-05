import java.util.Scanner;

public class _10 {
    public static void main(String args[]){
        Scanner circle = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 >>");

        int x = circle.nextInt();
        int y = circle.nextInt();
        int r1 = circle.nextInt();
        System.out.print("두번째 원의 중심과 반지름 >>");
        int a = circle.nextInt();
        int b = circle.nextInt();
        int r2 = circle.nextInt();
        if(Math.sqrt((Math.pow(Math.abs(x-a),2))+Math.pow((Math.abs(y-b)),2))<=(r1+r2)){
            System.out.println("원은 겹칩니다!");
        }else{
            System.out.println("안겹칩니다!");
        }
    }
}
