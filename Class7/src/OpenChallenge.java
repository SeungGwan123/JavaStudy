import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class OpenChallenge {
    public static void main(String args[]){
        WordQuiz wq = new WordQuiz();
        wq.Run();

    }
}
class WordQuiz{
    private Vector<Word> v;
    WordQuiz(){
        this.v = new Vector<Word>();
        v.add(new Word("love","사랑"));
        v.add(new Word("apple","사과"));
        v.add(new Word("accident","사고"));
        v.add(new Word("mango","망고"));
        v.add(new Word("watermelon","수박"));
        v.add(new Word("tomato","토마토"));
        v.add(new Word("orange","오렌지"));
        v.add(new Word("airplane","비행기"));
        v.add(new Word("house","집"));
        v.add(new Word("people","사람"));
        v.add(new Word("monkey","원숭이"));
    }
    public void Run(){
        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.printf("현재 %d개의 단어가 들어 있습니다.\n",this.v.size());
        for(int i=0;i<this.v.size(); i++){
            Scanner scan = new Scanner(System.in);
            Random r = new Random();
            System.out.printf("%s?\n",this.v.elementAt(i).get_eng());
            int answer = r.nextInt(1,5);
            for(int j=1;j<5;j++){
                if(j==answer){
                    System.out.printf("(%d)%s ",j,this.v.elementAt(i).get_kor());
                }else{
                    System.out.printf("(%d)%s ",j,this.v.elementAt(r.nextInt(0,this.v.size())).get_kor());
                }
            }
            System.out.print(":>");
            int user_ans = scan.nextInt();
            if(user_ans==-1)break;
            if(user_ans==answer)System.out.println("Excellent !!");
            else System.out.println("No !!");
        }
        System.out.println("\"명품영어\"를 종료합니다.....");
    }
}
class Word{
    private String eng;
    private String kor;
    Word(String a,String b){
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