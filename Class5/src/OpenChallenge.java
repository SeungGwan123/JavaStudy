import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
    public static void main(String args[]){
        Game G = new Game();
        G.rrrun();
    }
}
class Game{
    Game(){

    }
    public static void rrrun(){
        System.out.println("**Bear의Fish먹기 게임을 시작합니다.");
        GameObject B = new Bear();
        GameObject F = new Fish();
        char[][] board = new char[10][20];
        while(true){
            if(B.collide(F)){
                System.out.println("Bear Wins!!");
                break;
            }
            int B_x = B.getX();
            int B_y = B.getY();
            int F_x = F.getX();
            int F_y = F.getY();
            for(int i=0;i<10;i++){
                for(int j=0;j<20;j++){
                    if(i==B_x&&j==B_y){
                        System.out.print(B.getShape());
                    }
                    else if(i==F_x&&j==F_y){
                        System.out.print(F.getShape());
                    }else{
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            B.move();
            F.move();
        }
    }
}
class Bear extends GameObject{
    Bear(){
        super(0,0,0);
        Random ran = new Random();
        super.x = ran.nextInt(10);
        super.y = ran.nextInt(20);
    }
    public void move(){
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>");
        Scanner scan = new Scanner(System.in);
        switch (scan.next()){
            case "a":
                super.y -=1;
                break;
            case"s":
                super.x +=1;
                break;
            case"d":
                super.x-=1;
                break;
            case"f":
                super.y+=1;
                break;
        }
    }
    public char getShape(){
        return 'B';
    }
}
class Fish extends GameObject {
    private int five;
    private int two;
    Fish(){
        super(0,0,0);
        Random ran = new Random();
        super.x = ran.nextInt(11);
        super.y = ran.nextInt(21);
        this.five=0;
        this.two=0;
    }
    public void move(){
        Random ran = new Random();
        int temp = ran.nextInt(2);
        int direction = ran.nextInt(5);
        if(temp==1){
            if(this.two<=2){
                switch (direction){
                    case 0:
                        super.x+=1;
                        break;
                    case 1:
                        super.x-=1;
                        break;
                    case 2:
                        super.y+=1;
                        break;
                    case 3:
                        super.y-=1;
                        break;
                }
                this.two++;
                this.five++;
            }else{
                this.five++;
            }
        }
        direction = ran.nextInt(4);
        if(this.two==1&&this.five==4){
            switch (direction){
                case 0:
                    super.x+=1;
                    break;
                case 1:
                    super.x-=1;
                    break;
                case 2:
                    super.y+=1;
                    break;
                case 3:
                    super.y-=1;
                    break;
            }
            this.two++;
            this.five++;
        }
        direction = ran.nextInt(4);
        if(this.two==0&&this.five==3){
            switch (direction){
                case 0:
                    super.x+=1;
                    break;
                case 1:
                    super.x-=1;
                    break;
                case 2:
                    super.y+=1;
                    break;
                case 3:
                    super.y-=1;
                    break;
            }
            this.two++;
            this.five++;
        }
        if(this.five==5){
            this.five=0;
            this.two=0;
        }
        if(this.x<0){
            this.x=0;
        }
        if(this.x>10){
            this.x=10;
        }
        if(this.y<0){
            this.y=0;
        }
        if(this.y>20){
            this.y=20;
        }
    }
    public char getShape(){
        return '@';
    }
}
abstract class GameObject { // 추상 클래스
    protected int distance; // 한 번 이동 거리
    protected int x, y; // 현재 위치(화면 맵 상의 위치)
    public GameObject(int startX, int startY, int distance) { // 초기 위치와 이동 거리 설정
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean collide(GameObject p) { // 이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }
    protected abstract void move(); // 이동한 후의 새로운 위치로 x, y 변경
    protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
}
