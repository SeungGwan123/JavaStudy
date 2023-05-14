import java.util.Random;
import java.util.Scanner;

public class _12 {
    public static void main(String args[]){
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        Scanner scan = new Scanner(System.in);
        int total_member = scan.nextInt();
        Person[] P = new Person[total_member];
        for(int i=0;i<total_member;i++){
            System.out.printf("%s번째 선수 이름",i+1);
            P[i] = new Person(scan.next());
        }
        Game_12 G = new Game_12(P,total_member);
    }
}
class Game_12{
    Game_12(Person[] p,int m){
        int sequnce = 0;
        while(true){
            System.out.printf("[%s]:<Enter>",p[sequnce%m].name());
            Scanner scan = new Scanner(System.in);
            Random r = new Random();
            scan.nextLine();
            int first = r.nextInt(1,4);
            int second = r.nextInt(1,4);
            int third = r.nextInt(1,4);
            System.out.printf("\t%d  %d  %d\t",first,second,third);
            if(first==second&&second==third&&third==first){
                System.out.printf("%s님이 이겼습니다!\n",p[sequnce%2].name());
                break;
            }else{
                System.out.println("아쉽군요!");
            }
            sequnce++;
        }
        System.out.println("게임이 끝났습니다!");
    }
}