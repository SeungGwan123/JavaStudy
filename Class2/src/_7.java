import java.util.Scanner;

public class _7 {
    public static void main(String args[]){
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        if(x<=200&&x>=100&&y<=200&&y>=100){
            System.out.printf("(%d,%d)는 사각형 안에 있습니다.",x,y);
        }else{
            System.out.printf("(%d,%d)는 사각형 안에 없습니다.",x,y);
        }
    }
}
