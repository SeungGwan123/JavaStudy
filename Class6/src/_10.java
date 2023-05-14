import java.util.Random;
import java.util.Scanner;

public class _10 {
    public static void main(String args[]){
        Person[] P = new Person[2];
        for(int i=0;i<=1;i++){
            System.out.printf("%s번째 선수 이름",i+1);
            Scanner scan = new Scanner(System.in);
            P[i] = new Person(scan.next());
        }
        Game_10 G = new Game_10(P);
    }
}
class Game_10{
    Game_10(Person[] p){
        while(true){
            int sequnce = 0;
            System.out.printf("[%s]:<Enter>",p[sequnce%2].name());
            Scanner scan = new Scanner(System.in);
            Random r = new Random();
            scan.nextLine();
            int first = r.nextInt(1,4);
            int second = r.nextInt(1,4);
            int third = r.nextInt(1,4);
            System.out.printf("\t%d  %d  %d\t",first,second,third);
            if(first==second&&second==third&&third==first){
                System.out.printf("%s님이 이겼습니다!\n",p[sequnce%2].name());
                break;
            }else{
                System.out.println("아쉽군요!");
            }
            sequnce++;
        }
        System.out.println("게임이 끝났습니다!");
    }
}
class Person{
    private String name;
    Person(String s){
        this.name = s;
    }
    public String name(){
        return this.name;
    }
}