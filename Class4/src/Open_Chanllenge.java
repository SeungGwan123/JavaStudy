import java.lang.reflect.Array;
import java.util.Scanner;

public class Open_Chanllenge {
    public static void main(String args[]){
        run();
    }
    public static void run(){
        System.out.println("끝말잇기 게임을 시작합니다....");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        Scanner scan = new Scanner(System.in);
        int member = scan.nextInt();
        int i=0;
        String[] player = Player(member);
        String word = "아버지";
        System.out.printf("시작하는 단어는 %s입니다\n",word);
        while(true) {
            System.out.printf("%s>>",player[i%member]);
            String temp = scan.next();
            if(checkSuccess(word,temp)){
                word = temp;
                i++;
            }else{
                System.out.printf("%s이 졌습니다.",player[i%member]);
                break;
            }
        }
    }
    public static String[] Player(int a){
        String[] player = new String[a];
        for(int i=0;i<a;i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            Scanner scan = new Scanner(System.in);
            player[i]=scan.nextLine();
        }
        return player;
    }

    public static boolean checkSuccess(String a,String b){
        int lastIndex = a.length() -1;
        char lastChar = a.charAt(lastIndex);
        char firstChar = b.charAt(0);
        if(lastChar == firstChar){
            return true;
        }else{
            return false;
        }
    }
}
