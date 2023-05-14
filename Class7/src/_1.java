import java.util.Scanner;
import java.util.Vector;

public class _1 {
    public static void main(String args[]){
        System.out.print("정수(-1이 입력될 때까지)>> ");
        int big = 0;
        Vector<Integer> v = new Vector<Integer>();
        for(int i=0;;i++) {
            Scanner scan = new Scanner(System.in);
            int temp = scan.nextInt();
            if(temp==-1) {
                System.out.printf("가장 큰 수는 %d", big);
                break;
            }
            v.add(temp);
            big = Math.max(big,v.elementAt(i));
        }
    }
}
