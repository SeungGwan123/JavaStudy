import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class _6 {
    public static void main(String[] args){
        System.out.println("도시,경도,위도를 입력하세요.");
        HashMap<String, Location> city = new HashMap<String, Location>();
        Vector<String>total_city = new Vector<String>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String name = scan.next();
            if(name.equals("그만"))break;
            int x = scan.nextInt();
            int y = scan.nextInt();
            city.put(name,new Location(x,y));
            total_city.add(name);
        }
        System.out.println("------------------------------");
        for(int i=0;i<city.size(); i++){
            String name = total_city.get(i);
            System.out.printf("%s %d %d\n",name,city.get(name).getX(),city.get(name).getY());
        }
        System.out.println("------------------------------");
        while(true){
            System.out.print("도시이름 >>");
            String temp = scan.next();
            if(temp.equals("그만"))break;
            if(city.get(temp)!=null){
                System.out.printf("%s %d %d\n",temp,city.get(temp).getX(),city.get(temp).getY());
            }else{
                System.out.printf("%s는 없습니다.\n",temp);
            }
        }
        System.out.println("시스템 종료!");
    }
}
class Location{
    private int x;
    private int y;
    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}