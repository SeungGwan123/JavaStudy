import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class _12 {
    public static void main(String args[]){
        WordQuiz_12 wq = new WordQuiz_12();
        wq.Run();

    }
}
class WordQuiz_12{
    private Vector<Word_12> v;
    WordQuiz_12(){
        this.v = new Vector<Word_12>();
        this.v.add(new Word_12("love","사랑"));
        this.v.add(new Word_12("apple","사과"));
        this.v.add(new Word_12("accident","사고"));
        this.v.add(new Word_12("mango","망고"));
        this.v.add(new Word_12("watermelon","수박"));
        this.v.add(new Word_12("tomato","토마토"));
        this.v.add(new Word_12("orange","오렌지"));
        this.v.add(new Word_12("airplane","비행기"));
        this.v.add(new Word_12("house","집"));
        this.v.add(new Word_12("people","사람"));
        this.v.add(new Word_12("monkey","원숭이"));
    }
    public void Run(){
        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("단어 테스트:1, 단어삽입:2, 종료:3>>");
            int action = scan.nextInt();
            if(action==1) {
                System.out.printf("현재 %d개의 단어가 들어 있습니다.\n", this.v.size());
                for (int i = 0; i < this.v.size(); i++) {
                    Random r = new Random();
                    System.out.printf("%s?\n", this.v.elementAt(i).get_eng());
                    int answer = r.nextInt(1, 5);
                    for (int j = 1; j < 5; j++) {
                        if (j == answer) {
                            System.out.printf("(%d)%s ", j, this.v.elementAt(i).get_kor());
                        } else {
                            System.out.printf("(%d)%s ", j, this.v.elementAt(r.nextInt(0, this.v.size())).get_kor());
                        }
                    }
                    System.out.print(":>");
                    int user_ans = scan.nextInt();
                    if (user_ans == -1) break;
                    if (user_ans == answer) System.out.println("Excellent !!");
                    else System.out.println("No !!");
                }
                System.out.println("\"퀴즈\"를 종료합니다.....");
            }else if(action==2){
                System.out.print("영어 단어에 그만을 입력하면 입력을 종료합니다.\n");
                while(true){
                    System.out.printf("영어 한글 입력 >>");
                    String temp = scan.next();
                    if(temp.equals("그만"))break;
                    String mean = scan.next();
                    this.v.add(new Word_12(temp,mean));
                }
            }else if(action==3){
                System.out.println("\"명품단어\"를 종료합니다.....");
                break;
            }
        }
    }
}
class Word_12{
    private String eng;
    private String kor;
    Word_12(String a,String b){
        this.eng = a;
        this.kor = b;
    }
    public String get_eng(){
        return this.eng;
    }
    public String get_kor(){
        return this.kor;
    }
}