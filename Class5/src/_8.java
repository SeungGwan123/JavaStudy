public class _8 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString()+"입니다.");
        p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString()+"입니다.");
        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString()+"입니다.");
    }
}
class PositivePoint extends Point{
    PositivePoint() {
        super(0,0);
    }
    PositivePoint(int a,int b){
        super(a,b);
        if(a<0){
            move(0,0);
        }
        if(b<0){
            move(0,0);
        }
    }
    public void move(int a,int b){
        if(a>=0&&b>=0){
            super.move(a, b);
        }
    }
    public String toString(){
        String temp = "("+getX()+","+getY() + ")의 점";
        return temp;
    }
}
