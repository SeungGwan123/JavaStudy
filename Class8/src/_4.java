import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f=null;
        BufferedReader bi=null;

        try {
            f=new File("c:\\windows\\system.ini");
            bi=new BufferedReader(new FileReader(f));

            String s="";
            int i=1;
            System.out.println(f.getPath()+" 파일을 읽어 출력합니다.");
            while(true) {
                s=bi.readLine();
                if(s==null) {
                    break;
                }
                System.out.println("\t"+i+" : "+s);
                i++;
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}