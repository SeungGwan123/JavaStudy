import java.io.File;

public class _8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f;
        File sub[];
        try {
            f=new File("c:\\");
            sub=f.listFiles();

            long max=-1;
            int maxi=-1;
            for(int i=0;i<sub.length;i++) {
                if(max<sub[i].length()) {
                    max=sub[i].length();
                    maxi=i;
                }
            }
            System.out.println("가장 큰 파일은 "+sub[maxi].getPath()+"  "+sub[maxi].length()+"바이트");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}