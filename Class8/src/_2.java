import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;
        int c;
        try {
            f=new File("temp/phone.txt");
            fr=new FileReader(f);
            System.out.println(f.getPath()+"를 출력합니다.");
			/*
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			fr.close();
			*/
            br=new BufferedReader(fr,30);
            String temp="";
            while(true) {
                temp=br.readLine();
                if(temp==null) {
                    break;
                }
                System.out.println(temp);
            }
            fr.close();
        } catch (IOException e) {
            // TODO: handle exception
        }
    }

}