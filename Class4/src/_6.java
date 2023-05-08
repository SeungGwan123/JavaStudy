import java.util.Scanner;

public class _6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for(int i=0;i<c.length;i++){
            System.out.print("x,y,radius>>");
            //double x = scan.nextDouble();
            //double y = scan.nextDouble();
            //int r = scan.nextInt();
            c[i]=new Circle(scan.nextDouble(), scan.nextDouble(), scan.nextInt());
        }
        for(int i=0;i<c.length;i++){
            c[i].show();
        }
    }
}
class Circle{
    private double x,y;
    private int radius;
    public Circle(double x,double y,int radius){
        this.x=x;
        this.y=y;
        this.radius = radius;
    }
    public void show(){
        System.out.printf("(%.1f,%.1f)%d\n",x,y,radius);
    }
}
