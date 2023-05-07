import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5 {
    public static void main(String args[]){
        System.out.print("정수 10개를 입력하세요>>");
        Scanner num = new Scanner(System.in);
        int[] array = new int[10];
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            array[i]=num.nextInt();
            if(array[i]%3==0){
                q.add(i);
            }
        }
        System.out.print("3의 배수는");
        while(!q.isEmpty()){
            System.out.printf(" %d",array[q.peek()]);
            q.remove();
        }
    }
}
