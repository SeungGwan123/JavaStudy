public class _14 {
    public static void main(String[] args) {
        sshape[] list = new sshape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
        list[0] = new CCircle(10); // 반C지름이 10인 원 객체
        list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
        list[2] = new RRect(10, 40); // 10x40 크기의 사각형
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
    }
}
class Oval implements sshape {
    private double x;
    private double y;
    Oval(int a,int b){
        this.x = a;
        this.y = b;
    }
    public void draw(){
        System.out.printf("반지름이 (%.1f*%.1f)에 내접하는 타원입니다.\n",this.x,this.y);
    }
    public double getArea(){
        double area = this.x*this.y*3.14;
        return area;
    }
}
class RRect implements sshape {
    private double x;
    private double y;
    RRect(int a,int b){
        this.x = a;
        this.y=b;
    }
    public void draw(){
        System.out.printf("반지름이 (%.1f,%.1f)크기의 사각형입니다.\n",this.x,this.y);
    }
    public double getArea(){
        double area = this.x*this.y;
        return area;
    }
}