import java.util.Scanner;
import java.util.StringTokenizer;

public class _11 {
    public static void main(String args[]){
        System.out.print(">>");
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(scan.nextLine());
        while(true){
            System.out.print("명령 : ");
            String change = scan.nextLine();
            if(change.equals("그만"))break;
            StringTokenizer ct = new StringTokenizer(change, "!");
            if(ct.countTokens()==1){
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            StringTokenizer st = new StringTokenizer(sb.toString(), " ");
            String pre = ct.nextToken();
            String nex = ct.nextToken();
            int locate =0;
            for(int i=0;i< st.countTokens();i++){
                String token = st.nextToken();
                if(token.equals(pre)){
                    sb.replace(locate,locate+token.length(),nex);
                    locate += nex.length() + 1;
                    break;
                }else {
                    if(i==st.countTokens() - 1)System.out.println("찾을 수 없습니다!");
                    locate += token.length() + 1;
                }
            }
            System.out.println(sb);
        }
        System.out.println("종료합니다.");
    }
}
