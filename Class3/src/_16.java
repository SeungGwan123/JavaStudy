import java.util.Random;
import java.util.Scanner;

public class _16 {
    public static void main(String args[]){
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String[] com = {"가위","바위","보"};
        while(true){
            System.out.print("가위 바위 보!>>");
            Scanner scan = new Scanner(System.in);
            String user = scan.nextLine();
            if(user.equals("그만")){
                System.out.println("게임을 종료합니다......");
                break;
            }
            Random r = new Random();
            int c = r.nextInt(3);
            if(user.equals(com[c])){
                System.out.println("비겼습니다.");
                System.out.printf("%s %s\n",user,com[c]);
                continue;
            }
            if(user.equals("가위")&&com[c].equals("바위")){
                System.out.println("졌습니다.");System.out.printf("%s %s\n",user,com[c]);
                continue;
            }
            if(user.equals("바위")&&com[c].equals("보")){
                System.out.println("졌습니다.");System.out.printf("%s %s\n",user,com[c]);continue;
            }
            if(user.equals("보")&&com[c].equals("가위")){
                System.out.println("졌습니다.");System.out.printf("%s %s\n",user,com[c]);
            }else{
                System.out.println("이겼습니다.");System.out.printf("%s %s\n",user,com[c]);
            }
        }
    }
}
