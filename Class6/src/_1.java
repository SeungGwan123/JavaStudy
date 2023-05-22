public class _1 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3,50);
        MyPoint q = new MyPoint(4,50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른 점");
    }
}
class MyPoint{
    private int x;
    private int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point ("+this.x+","+this.y+")";
    }
    boolean equals(MyPoint p){
        if(this.x== p.x&&this.y == p.y){
            return true;
        }else{
            return false;
        }
    }
}
