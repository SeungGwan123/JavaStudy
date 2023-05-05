import java.util.Scanner;

public class _9 {
    public static void main(String args[]){
        System.out.print("원의 중심과 반지름 입력>>");
        Scanner circle = new Scanner(System.in);
        float x = circle.nextFloat();
        float y = circle.nextFloat();
        float r = circle.nextFloat();
        System.out.print("점을 입력하세요>>");
        float a = circle.nextFloat();
        float b = circle.nextFloat();
        if((a<=x+r||a>=x-r)&&(b<=y+r||b>=y-r)){
            // 실수 소수점 자리 정하는법 ~~
            System.out.printf("점 (%.1f,%.1f)는 원 안에 있다.",a,b);
        }else{
            System.out.printf("점 (%f,%f)는 원 안에 없다.",a,b);
        }
    }
}
