import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f=null;
        FileWriter fw=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("전화번호 입력 프로그램입니다.");
        String temp="";
        try {
            f=new File("temp/phone.txt");
            fw=new FileWriter(f);
            int c;
            while(true) {
                System.out.print("이름 전화번호 >> ");
                temp=sc.nextLine();
                if(temp.contentEquals("그만")) {
                    break;
                }

                fw.write(temp+"\r\n");
            }
            sc.close();
            fw.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println(f.getPath()+"에 저장하였습니다.");
    }

}
