import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class _11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr=null;
        Vector<String> v;
        Scanner sc;
        try {
            fr=new FileReader(new File("words.txt"));
            v=new Vector<String>();
            sc=new Scanner(fr);
            String word="";
            while(sc.hasNext()) {
                word=sc.next();
                v.add(word);
            }
            System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");

            sc.close();
            sc=new Scanner(System.in);
            while(true) {
                boolean find=false;
                System.out.print("단어>>");
                word=sc.next();
                if(word.equals("그만")) break;
                for(int i=0;i<v.size();i++) {
                    String w=v.get(i);
                    if(w.length()<word.length()) continue;

                    String sub=w.substring(0,word.length());
                    if(sub.equals(word)){
                        System.out.println(w);
                        find=true;
                    }
                }
                if(!find) System.out.println("발견할 수 없음.");
            }
            System.out.println("종료합니다...");
            sc.close();
            fr.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}