public class _2 {
    public static void main(String[] args) {
        Circle a = new Circle(2,3,5);
        Circle b = new Circle(2,3,30);
        System.out.println("원 a : "+a);
        System.out.println("원 b : "+b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
class Circle {
    private int x;
    private int y;
    private int radius;
    Circle(int x, int y,int r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    }
    public String toString() {
        return "Circle("+this.x+","+this.y+")반지름"+this.radius;
    }
    boolean equals(Circle c){
        if(this.x==c.x&&this.y == c.y){
            return true;
        }else{
            return false;
        }
    }
}
