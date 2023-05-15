import java.util.Scanner;
import java.util.Vector;

public class _4 {
    public static void main(String[] args){
        Vector<Integer> rain = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        int total =0;
        while(true){
            System.out.print("강수량 입력 (0입력시 종료)>>");
            int record = scan.nextInt();
            if(record == 0)break;
            rain.add(record);
            total+=record;
            for(int i=0;i<rain.size();i++){
                System.out.printf("%d ",rain.get(i));
            }
            System.out.println();
            System.out.printf("현재 평균 %d\n",total/rain.size());
        }
    }
}
