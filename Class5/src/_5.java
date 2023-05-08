public class _5 {
    public static void main(String args[]){
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"입니다. ");
    }
}
class ColorPoint extends Point {
    private String color;
    ColorPoint(int a,int b,String c){
        super(a,b);
        this.color=c;
    }
    public void setXY(int x,int y){
        move(x, y);
    }
    public void setColor(String a){
        this.color = a;
    }
    public String toString(){
        String temp = this.color+"색의 ("+getX()+","+getY() + ")의 점";
        return temp;
    }
}
class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}