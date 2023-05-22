import java.util.Scanner;

public class _7_2 {
    public static void main(String args[]){
        while(true){
            System.out.print("");
            Scanner scan = new Scanner(System.in);
            String temp = scan.nextLine();
            if(temp.equals("그만"))break;
            String num[] = temp.split(" ");
            System.out.println(num.length);
        }
    }
}
