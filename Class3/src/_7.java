import java.util.Random;

public class _7 {
    public static void main(String args[]){
        Random r = new Random();
        float total =0;
        int[] array = new int[10];
        float num = 0;
        System.out.print("랜덤한 정수들 :");
        for(int i=0;i<10;i++){
            array[i] = r.nextInt(10);
            System.out.printf(" %d",array[i]);
            total+=(float)array[i];
            num++;
        }
        System.out.printf("\n평균은 %.1f",total/num);
    }
}
