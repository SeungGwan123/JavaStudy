import java.io.File;
import java.util.Scanner;

public class _13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f=null;
        File fl[];
        Scanner sc;
        try {
            sc=new Scanner(System.in);
            f=new File("c:\\");
            System.out.println("***** 파일 탐색기입니다. *****");
            while(true) {
                String nowD=f.getName();
                System.out.println("["+nowD+"]");
                fl=f.listFiles();
                for(int i=0;i<fl.length;i++) {
                    String dir;
                    if(fl[i].isDirectory()) dir="dir";
                    else dir="file";

                    System.out.println(dir+"\t"+fl[i].length()+"바이트\t"+fl[i].getName());
                }
                System.out.print(">>");
                String op=sc.next();
                if(op.equals("그만")) break;

                if(op.equals("..")) {
                    if(f.getParent()==null) continue;
                    else {
                        f=new File(f.getParent());
                    }
                }
                else {
                    if(new File(f,op).isDirectory()) {
                        f=new File(f,op);
                    }
                    else {
                        System.out.println("디렉토리가 아닙니다.");
                    }
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}