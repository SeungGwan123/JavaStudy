import java.util.Scanner;

public class _5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        circle c[] = new circle[3];
        int max_r = 0;
        int num=0;
        for(int i=0;i<c.length;i++){
            System.out.print("x,y,radius>>");
            //double x = scan.nextDouble();
            //double y = scan.nextDouble();
            //int r = scan.nextInt();
            c[i]=new circle(scan.nextDouble(), scan.nextDouble(), scan.nextInt());
        }
        for(int i=0;i<c.length;i++){
            if(max_r<=c[i].radius()){
                max_r = c[i].radius();
                num=i;
            }
        }
        System.out.print("가장 면적이 큰 원은");
        c[num].show();
    }
}
class circle{
    private double x,y;
    private int radius;
    public circle(double x,double y,int radius){
        this.x=x;
        this.y=y;
        this.radius = radius;
    }
    public int radius(){
        return radius;
    }
    public void show(){
        System.out.printf("(%.1f,%.1f)%d\n",x,y,radius);
    }
}
