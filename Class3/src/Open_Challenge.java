import java.util.Random;
import java.util.Scanner;

public class Open_Challenge {
    public static void main(String args[]){
        while(true){
            Random random = new Random();
            int answer =random.nextInt()%100;
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            int low =0;
            int high = 99;
            int num=1;
            while(true){
                System.out.printf("%d-%d\n",low,high);
                System.out.printf("%d>>",num);
                Scanner scanner = new Scanner(System.in);
                int user = scanner.nextInt();
                if(user <answer){
                    System.out.println("더 높게");
                    num++;
                    low=user;
                }else if(user > answer){
                    System.out.println("더 낮게");
                    num++;
                    high=user;
                }else{
                    System.out.println("맞았습니다.");
                    break;
                }
            }
            System.out.print("다시하시겠습니까(y/n)>>");
            Scanner game = new Scanner(System.in);
            String regame = game.nextLine();
            if(regame.equals("n")){
                break;
            }
        }
    }
}
