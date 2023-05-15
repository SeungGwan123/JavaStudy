import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
// hashmap은 자동 정렬이 되네요~~
public class _7 {
    public static void main(String[] args){
        System.out.println("미래장학금관리시스템입니다.");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Vector<String> member = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        int criteria;

        for(int i=0;i<5;i++){
            System.out.print("이름과 학점>>");
            String temp_name = sc.next();
            int temp_score = sc.nextInt();
            map.put(temp_name,temp_score);
        }
        System.out.print("장학생 선발 학점 기준 입력>>");
        criteria = sc.nextInt();
        Iterator<String> keys = map.keySet().iterator();
        for(int i=0;i<map.size(); i++){
            String key= keys.next();
            if(map.get(key)>criteria){
                member.add(key);
            }
        }
        System.out.print("장학생 명단 : ");
        for(int i=0;i<member.size(); i++){
            System.out.printf("%s ",member.get(i));
        }
    }
}
