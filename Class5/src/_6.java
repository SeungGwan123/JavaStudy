public class _6 {
    public static void main(String args[]){
        pointcolor zeroPoint = new pointcolor(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        pointcolor cp = new pointcolor(10, 10); // (10,10) 위치의 BLACK 색 점
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}
class pointcolor extends Point{
    private String color;
    pointcolor(){
        super(0,0);
        this.color = "BLACK";
    }
    pointcolor(int a,int b){
        super(a, b);
    }
    public void setXY(int a, int b){
        move(a,b);
    }
    public void setColor(String xx){
        this.color = xx;
    }
    public String toString(){
        String temp = this.color+"색의"+"("+getX()+","+getY()+")의 점";
        return temp;
    }
}