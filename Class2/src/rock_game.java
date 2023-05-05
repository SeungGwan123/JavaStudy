import java.util.Scanner;

public class rock_game {
    public static void main(String args[]){
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("철수 >>");
        String a = scanner.nextLine();
        System.out.print("영희 >>");
        String b = scanner.nextLine();
        if(a.equals(b)){
            System.out.print("비겼습니다.");
        }
        if(a.equals("가위")){
            if(b.equals("바위")){
                System.out.print("영희가 이겼습니다.");
            }else{
                System.out.print("철수가 이겼습니다.");
            }
        }
        if(a.equals("보")){
            if(b.equals("가위")){
                System.out.print("영희가 이겼습니다.");
            }else{
                System.out.print("철수가 이겼습니다.");
            }
        }
        if(a.equals("바위")){
            if(b.equals("보")){
                System.out.print("영희가 이겼습니다.");
            }else{
                System.out.print("철수가 이겼습니다.");
            }
        }
    }
}
