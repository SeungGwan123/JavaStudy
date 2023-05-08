import java.util.Scanner;

public class Open_Chanllenge {
    public static void main(String args[]){
        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        Scanner scan = new Scanner(System.in);
        for(int i=scan.nextInt();i>=1;i--){
            System.out.print("참가자의 이름을 입력하세요>>")
        }
    }
    public void Run(){
        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        Scanner scan = new Scanner(System.in);
        int member = scan.nextInt();
        Player(member);
        String word = "아버지";
        System.out.printf("시작하는 단어는 %s입니다.",word);
    }
    public void Player(int a){
        String[] player = new String[a];
        for(int i=0;i<a;i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            Scanner scan = new Scanner(System.in);
            player[i]=scan.nextLine();
        }
    }
}
