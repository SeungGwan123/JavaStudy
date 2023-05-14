import java.util.Scanner;

public class OpenChallenge {
    public static void main(String args[]){
        String article = readString();
        String[] histogram = new String[26];
        for(int i=0;i<26;i++){
            histogram[i]=(char)(i+65)+" ";
            //System.out.println(histogram[i]);
        }
        for(int i=0;i<article.length(); i++){
            if(article.charAt(i) <65&&article.charAt(i) >122)continue;
            for(int j=65;j<91;j++){
                if(article.codePointAt(i)==j||article.codePointAt(i) ==j+32){
                    histogram[j-65] += "-";
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.println(histogram[i]);
        }
    }
    static String readString()
    {
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            String line = scanner.nextLine();
            if(line.equals(";"))
                break;
            sb.append(line);
        }
        return sb.toString();
    }
}
