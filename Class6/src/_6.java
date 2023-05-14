import java.util.Calendar;
import java.util.Scanner;

public class _6 {
    public static void main(String args[]){
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        Scanner scan = new Scanner(System.in);
        String[] member = {"황기태","이재문"};
        int[] start = new int[member.length];
        int[] end = new int[member.length];
        int[] result = new int[member.length];

        for(int i=0;i<2;i++) {
            System.out.printf("%s 시작 <Enter>키>>",member[i]);
            Calendar cal = Calendar.getInstance();
            scan.nextLine();
            start[i] = cal.get(Calendar.SECOND);
            System.out.printf("\t현재 초 시간 = %d\n", start[i]);
            Calendar calen = Calendar.getInstance();
            System.out.printf("10초 예상 후 <Enter>키>>");
            scan.nextLine();
            end[i] = calen.get(Calendar.SECOND);
            System.out.printf("\t현재 초 시간 = %d\n", end[i]);

            if(start[i]>end[i]){
                result[i] = 60-start[i]+end[i];
            }else if(start[i]==end[i]){
                result[i]=60;
            }else{
                result[i]=end[i]-start[i];
            }
        }
        if(result[0]>result[1]) {
            System.out.printf("%s의 결과 %d, %s의 결과 %d, 승자는 %s", member[0], result[0], member[1], result[1], member[0]);
        }else{
            System.out.printf("%s의 결과 %d, %s의 결과 %d, 승자는 %s", member[0], result[0], member[1], result[1], member[1]);

        }
    }
}
