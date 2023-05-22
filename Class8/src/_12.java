import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class _12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr=null;
        Vector<String> v;
        Scanner fsc,sc;
        try {
            sc=new Scanner(System.in);
            System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("대상 파일명 입력>> ");
            String fileN=sc.next();

            fr=new FileReader(new File(fileN));
            v=new Vector<String>();
            fsc=new Scanner(fr);
            String line="";
            while(fsc.hasNext()) {
                line=fsc.nextLine();
                v.add(line);
            }

            while(true) {
                System.out.print("검색할 단어나 문장>> ");
                String findN=sc.next();
                boolean find=false;
                if(findN.equals("그만")) break;
                for(int i=0;i<v.size();i++) {
                    String temp=v.get(i);
                    if(temp.indexOf(findN)!=-1) {
                        find=true;
                        System.out.println(i+": "+temp);
                    }
                }
                if(!find) System.out.println("발견할 수 없음.");
            }
            System.out.println("프로그램을 종료합니다.");
            sc.close();
            fr.close();
            fsc.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}