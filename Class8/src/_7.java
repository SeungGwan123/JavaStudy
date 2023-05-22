import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File a,b;
        FileInputStream fin;
        FileOutputStream fout;
        long  n,total;
        try {
            a=new File("temp/red.png");
            b=new File("temp/copy.png");

            System.out.println(a.getName()+"를 "+b.getName()+"로 복사합니다.");
            System.out.println("10%마다 *를 출력합니다.");
            fin=new FileInputStream(a);
            fout=new FileOutputStream(b);

            int c;
            n=0;
            total=a.length();

            while((c=fin.read())!=-1) {
                fout.write((byte)c);
                n=(n+1);
                if(n==total/10) {
                    System.out.print("*");
                    n=0;
                }
            }
            fin.close();
            fout.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}