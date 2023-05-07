import java.util.Arrays;
import java.util.Random;

public class _10 {
    public static void main(String args[]){
        Random r = new Random();
        int[][] array = new int[4][4];
        //Arrays.fill(array,0);
        for(int i=0;i<10;i++){
            while(true) {
                int x =r.nextInt(4);
                int y = r.nextInt(4);
                if(array[x][y]==0){
                    array[x][y] = r.nextInt(10)+1;
                    break;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }
    }
}
