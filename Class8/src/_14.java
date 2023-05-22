import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _14 {

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
                String line=sc.nextLine();
                StringTokenizer st=new StringTokenizer(line," ");
                String op=st.nextToken();

                if(op.equals("그만")) break;

                if(op.equals("..")) {
                    if(f.getParent()==null) continue;
                    else {
                        f=new File(f.getParent());
                    }
                }
                else {
                    if(op.equals("rename")) {
                        String v1,v2;
                        try {
                            v1=st.nextToken();
                            v2=st.nextToken();
                            File on=new File(f,v1);
                            File rn=new File(f,v2);
                            if(rn.exists()) {
                                System.out.println("이미 존재하는 파일이나 디렉터리 이름입니다.");
                            }
                            else {
                                on.renameTo(rn);
                            }

                        }catch(Exception e) {
                            System.out.println("두개의 파일명이 주어지지 않았습니다.");
                        }
                    }
                    else if(op.equals("mkdir")) {
                        try {
                            String dname=st.nextToken();
                            File newD=new File(f,dname);
                            if(newD.exists()) System.out.println("이미 존재하는 파일이나 디렉토리입니다.");
                            else {
                                System.out.println(dname+" 디렉터리를 생성하였습니다.");
                                newD.mkdir();
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                            System.out.println("생성할 디렉토리 명이 주어지지 않았습니다.");
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
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}