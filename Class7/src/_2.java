import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2 {
    public static void main(String args[]){
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/E/F)>>");
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
        ArrayList<Double> al = new ArrayList<Double>();
        for(int i= st.countTokens();i>0; i--){
            switch (st.nextToken()){
                case "A":
                    al.add(4.0);
                    break;
                case "B":
                    al.add(3.0);
                    break;
                case"C":
                    al.add(2.0);
                    break;
                case"D":
                    al.add(1.0);
                    break;
                case"F":
                    al.add(0.0);
                    break;
                default:
                    break;
            }
        }
        double average =0;
        for(int i=0;i<al.size(); i++){
            average+=al.get(i);
        }
        System.out.println(average/al.size());
        /*System.out.println(al.size());
        System.out.println(average);*/
    }
}