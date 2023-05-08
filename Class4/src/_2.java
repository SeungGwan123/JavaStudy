import java.util.Scanner;

public class _2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("수학,과학,영어 순으로 3개의 점수 입력>>");
        int math = scan.nextInt();
        int science = scan.nextInt();
        int english = scan.nextInt();
        Grade me = new Grade(math,science,english);
        System.out.println("평균은"+me.average());
    }
    public static class Grade{
        private int math;
        private int science;
        private int english;
        public Grade(int a,int b,int c){
            math=a;
            science =b;
            english=c;
        }
        public int average(){
            return (math+science+english)/3;
        }
    }
}
