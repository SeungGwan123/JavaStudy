import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class _10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f=null;
        FileReader fr=null;
        HashMap<String,String> phone;
        Scanner sc;
        try {
            phone=new HashMap<String,String>();
            f=new File("c:\\temp1\\phone.txt");
            fr=new FileReader(f);
            sc=new Scanner(fr);

            while(sc.hasNext()) {
                String n=sc.next();
                String t=sc.next();
                phone.put(n,t);
                System.out.println("key:"+n+"value:"+phone.get(n));
            }
            System.out.println("총 "+phone.size()+"개의 정보를 읽었습니다.");
            sc.close();
            sc=new Scanner(System.in);
            String temp="";
            while(true) {
                System.out.print("이름>>");
                temp=sc.next();
                System.out.println(temp);
                if(temp.equals("그만")) {
                    break;
                }
                String tel=phone.get(temp);
                if(tel==null) {
                    System.out.println("찾는 이름이 없습니다.");
                }
                else {
                    System.out.println(tel);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}