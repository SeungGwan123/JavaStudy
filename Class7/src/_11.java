import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class _11 {
    public static void main(String[] args){
        Vector<Nation> a = new Vector<Nation>();
        HashMap<String,String> h = new HashMap<String,String>();
        Scanner sc = new Scanner(System.in);
        a.add(new Nation("한국","서울"));
        h.put("한국","서울");
        a.add(new Nation("일본","도쿄"));
        h.put("일본","도쿄");
        a.add(new Nation("중국","베이징"));
        h.put("중국","베이징");
        a.add(new Nation("미국","워싱턴"));
        h.put("미국","워싱턴");
        System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");
        while(true){
            System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
            int action = sc.nextInt();
            if(action==1){
                System.out.printf("현재 %d개 나라와 수도가 입력되어 있습니다.\n",a.size());
                while(true){
                    System.out.printf("나라와 수도 입력%d>>",a.size()+1);
                    String country = sc.next();
                    if(country.equals("그만"))break;
                    String capital = sc.next();
                    if(h.get(country)!=null){
                        System.out.printf("%s는 이미 있습니다!\n",country);
                    }else{
                        a.add(new Nation(country,capital));
                        h.put(country,capital);
                    }
                }
            }else if(action==2){
                Random r = new Random();
                while(true){
                    int num = r.nextInt(0,a.size());
                    String temp = a.elementAt(num).getCountry();
                    System.out.printf("%s의 수도는?",temp);
                    String ans = sc.next();
                    if(ans.equals("그만"))break;
                    if(ans.equals(h.get(temp))) {
                        System.out.println("정답!!!");
                    }else{
                        System.out.println("틀렸습니다!!");
                    }
                }
            }else if(action==3){
                System.out.println("게임을 종료합니다!");
                break;
            }else{
                System.out.println("잘못된 접근입니다!");
            }
        }
    }
}
class Nation{
    private String country;
    private String capital;
    Nation(String a,String b){
        this.country = a;
        this.capital = b;
    }
    public String getCountry(){
        return this.country;
    }
    public String getCapital(){
        return this.capital;
    }
}
