import java.util.Scanner;

public class _8 {
    public static void main(String args[]){
        System.out.print("");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        for(int i=0;i<sentence.length()+1; i++){
            //sentence = sentence.substring(1,sentence.length() - 1)+sentence.substring(0);
            System.out.println(sentence.substring(i,sentence.length())+sentence.substring(0,i));
        }
    }
}
