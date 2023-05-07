import java.util.Scanner;

import static java.sql.Types.NULL;

public class _11 {
    public static void main(String args[]){
        System.out.print("Average>>");
        Scanner scanner = new Scanner(System.in);
        float total = 0;
        float kind=0;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            total+=(float)num;
            kind++;
        }
        //intellij에서는 scanner로 eof처리가 힘드니 ctrl+D를 눌러서 작동을 끝내자.
        System.out.printf("%.1f",total/kind);
    }
}
