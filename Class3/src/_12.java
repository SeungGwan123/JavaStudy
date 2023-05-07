import java.util.InputMismatchException;
import java.util.Scanner;

public class _12 {
    public static void main(String args[]){
        System.out.print("Add>>");
        int total = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            try{
                int num = scan.nextInt();
                total+=num;
            }catch (InputMismatchException e) {
                scan.next();
                continue;
            }catch(NumberFormatException e) {
                continue;
            }finally{

            }
        }
        System.out.printf("%d",total);
    }
}
