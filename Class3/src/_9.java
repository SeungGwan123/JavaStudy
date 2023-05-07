import java.util.Random;

public class _9 {
    public static void main(String args[]){
        int[][] array = new int[4][4];
        Random r = new Random();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = r.nextInt(10);
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }
    }
}
