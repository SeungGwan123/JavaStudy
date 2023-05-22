import java.util.Random;
import java.util.Scanner;

public class _9 {
    public static void main(String args[]){
        Game G = new Game();
    }
}
class Game{
    Game(){
        Player P = new Player();
        Computer C = new Computer();
        while(true){
            int player = P.Player();
            int computer = C.Computer();
            if(player==4){
                break;
            }
            String[] gg = {"다시","가위","바위","보"};
            System.out.printf("철수(%s) : 컴퓨터(%s)\n",gg[player],gg[computer]);
            if(player==computer){
                System.out.println("비겼습니다.");
            }else{
                if(player==1&&computer==2){
                    System.out.println("컴퓨터가 이겼습니다.");
                    continue;
                }
                if(player==2&&computer==3){
                    System.out.println("컴퓨터가 이겼습니다.");
                    continue;
                }
                if(player==3&&computer==1){
                        System.out.println("컴퓨터가 이겼습니다.");
                }else{
                    System.out.println("철수가 이겼습니다.");
                }
            }
        }
        System.out.println("게임이 종료되었습니다.");
    }
}
class Player{
    public int Player(){
        System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        Scanner scan = new Scanner(System.in);
        int game = scan.nextInt();
        return game;
    }
}
class Computer{
    public int Computer(){
        Random r = new Random();
        int com = r.nextInt(1,4);
        return com;
    }
}