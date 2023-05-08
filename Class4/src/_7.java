import java.util.Scanner;

public class _7 {
    public static void main(String args[]){
        MonthSchedule m = new MonthSchedule();
    }
}
class MonthSchedule{
    MonthSchedule(){
        System.out.println("이번달 스케쥴 관리 프로그램.");
        Day[] days = new Day[32];
        for(int i=0;i<32;i++){
            days[i]= new Day();
        }
        while(true){
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            Scanner scan = new Scanner(System.in);
            int behave = scan.nextInt();
            if(behave == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                if(behave==1){
                    System.out.print("날짜(1~30)?");
                    int dd = scan.nextInt();
                    System.out.print("할일(빈칸없이입력)?");
                    String w = scan.next();
                    if(days[dd].get()!=null) {
                        days[dd].set(w + " " + days[dd].get());
                    }else{
                        days[dd].set(w);
                    }
                }else{
                    System.out.print("날짜(1~30)?");
                    int dd = scan.nextInt();

                    System.out.println(days[dd].get());
                }
            }
        }
    }
}
class Day {
    private String work; //하루의 할 일을 나타내는 문자열
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work+"입니다.");
    }
}