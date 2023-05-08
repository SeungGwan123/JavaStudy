import java.util.Arrays;
import java.util.Scanner;

public class _12 {
    public static void main(String args[]){
        Run();
    }

    public static void Run() {
        Reservation[] days = new Reservation[32];
        for(int i=0;i<=31;i++){
            days[i] = new Reservation();
        }
        Reservation.opening();
        while(true){
            System.out.print("언제 예약하실껀가요?>>");
            Scanner scan = new Scanner(System.in);
            int date = scan.nextInt();
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int behave = scan.nextInt();
            if(behave ==1){
                System.out.print("좌석구분 S(1), A(2), B(3)>>>");
                int seat = scan.nextInt();
                if(seat==1){
                    days[date].S_print();
                }else if(seat==2){
                    days[date].A_print();
                }else if(seat == 3){
                    days[date].B_print();
                }else{
                    System.out.println("잘못된 좌석입니다. 처음부터 다시해주세요.");
                    continue;
                }
                System.out.print("이름>>");
                String name = scan.next();
                System.out.print("번호>>");
                int number = scan.nextInt();
                days[date].Reserv(name,number-1,seat);
            }else if(behave ==2){
                days[date].S_print();days[date].A_print();days[date].B_print();Reservation.check();
            }else if(behave ==3){
                System.out.print("좌석>>");
                int seat = scan.nextInt();
                System.out.print("이름>>");
                String name = scan.next();
                System.out.print("번호>>");
                int number = scan.nextInt();
                days[date].Cancel(seat,name,number-1);
            }
            else if(behave == 4){
                Reservation.closing();
                break;
            }

        }
    }
}
class Reservation{
    private String[] S = new String[10];
    private String[] A = new String[10];
    private String[] B = new String[10];
    Reservation(){
        Arrays.fill(this.S,"---");
        Arrays.fill(this.A,"---");
        Arrays.fill(this.B,"---");
    }
    public void Reserv(String a,int b,int c){
        if(c==1){
            S[b]=a;
        }else if(c==2){
            A[b]=a;
        }else{
            B[b]=a;
        }
    }
    public void Cancel(int c,String a, int b){
        if(c==1){
            if(a.equals(S[b])){
                S[b]="---";
                System.out.println("취소되었습니다.");
            }else{
                System.out.println("정보가 잘못되었습니다.");
            }
        }else if(c==2){
            if(a.equals(A[b])){
                A[b]="---";
                System.out.println("취소되었습니다.");
            }else{
                System.out.println("정보가 잘못되었습니다.");
            }
        }else{
            if(a.equals(B[b])){
                B[b]="---";
                System.out.println("취소되었습니다.");
            }else{
                System.out.println("정보가 잘못되었습니다.");
            }
        }
    }
    public static void opening(){
        System.out.println("명품콘서트홀 예약 시스템입니다.");
    }
    public static void closing(){
        System.out.println("명품콘서트홀 예약 시스템을 끝내겠습니다.");
    }
    public static void check(){
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void S_print(){
        System.out.printf("S>> ");
        for(int i=0;i<S.length;i++){
            System.out.printf("%s ",S[i]);
        }
        System.out.println();
    }
    public void A_print(){
        System.out.printf("A>> ");
        for(int i=0;i<A.length;i++){
            System.out.printf("%s ",A[i]);
        }
        System.out.println();
    }
    public void B_print(){
        System.out.printf("B>> ");
        for(int i=0;i<B.length;i++){
            System.out.printf("%s ",B[i]);
        }
        System.out.println();
    }

}

