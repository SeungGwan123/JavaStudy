import java.util.HashMap;
import java.util.Scanner;

public class _3 {
    public static void main(String args[]){
        HashMap<String,Integer>nationStringIntegerHashMap = new HashMap<String, Integer>();
        System.out.println("나라 이름과 인구를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.printf("나라 이름, 인구 >> ");
            String country = scan.next();
            if(country.equals("그만")){
                break;
            }
            int people = scan.nextInt();
            nationStringIntegerHashMap.put(country, people);
        }
        if(nationStringIntegerHashMap.size()!=0) {
            while (true) {
                System.out.print("인구 검색 >>");
                String country = scan.next();
                if (country.equals("그만")) {
                    break;
                }
                if(nationStringIntegerHashMap.get(country)!=null){
                    System.out.printf("%s의 인구는 %d\n",country,nationStringIntegerHashMap.get(country));
                }else{
                    System.out.printf("%s 나라는 없습니다.\n",country);
                }
            }
        }else{
            System.out.println("정보가 없습니다!");
        }
        System.out.println("프로그램을 종료합니다!");
    }
}
