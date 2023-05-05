import java.util.Scanner;

public class _6 {
    public static void main(String args[]){
        System.out.print("1~99사이의 정수를 입력하시오>>");
        Scanner num = new Scanner(System.in);
        int clap = num.nextInt();
        int clap_num=0;
        if(clap/10==3||clap/10==6||clap/10==9){
            clap_num++;
        }
        if(clap%10==3||clap%10==6||clap%10==9){
            clap_num++;
        }
        if(clap_num==1) {
            System.out.println("박수 짝");
        }else if(clap_num==2) {
            System.out.println("박수 짝짝");
        }
    }
}
