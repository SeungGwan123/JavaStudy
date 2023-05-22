import java.util.Scanner;
import java.util.StringTokenizer;

public class _7 {
    public static void main(String args[]){
        Text T = new Text();
    }
}
class Text{
    Text(){
        while(true){
            System.out.print("");
            Scanner scan = new Scanner(System.in);
            String temp = scan.nextLine();
            if(temp.equals("그만")){
                break;
            }
            StringTokenizer S = new StringTokenizer(temp," ");
            int t = S.countTokens();
            System.out.println(t);
        }
    }
}