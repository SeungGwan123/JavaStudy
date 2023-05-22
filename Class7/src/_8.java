import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class _8 {
    public static void main(String[] args){
        System.out.println("** 포인트 관리 프로그램입니다 **");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("이름과 포인트 입력 >>");
            String name= sc.next();
            if(name.equals("그만"))break;
            int point = sc.nextInt();
            if(map.get(name)==null){
                map.put(name,point);
            }else{
                map.put(name,map.get(name)+point);
            }
            Iterator<String> it = map.keySet().iterator();
            for(int i=0;i<map.size(); i++){
                String key = it.next();
                System.out.printf("(%s,%d)",key,map.get(key));
            }
            System.out.println();
        }
    }
}
