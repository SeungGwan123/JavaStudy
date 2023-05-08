import java.util.Scanner;

public class _10 {
    public static void main(String args[]){
        while(true){
            System.out.print("한글 단어?");
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            if(word.equals("그만")){
                break;
            }
            Dictionary.kor2Eng(word);
        }
    }
}
class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future","hope"};
    public static void kor2Eng(String word) {
        for(int i=0;i<kor.length; i++){
            if(kor[i].equals(word)){
                System.out.printf("%s은 %s\n",kor[i],eng[i]);
                break;
            }
            if(i==kor.length - 1){
                System.out.printf("%s는 저의 사전에 없습니다.\n",word);
            }
        }
    }
}