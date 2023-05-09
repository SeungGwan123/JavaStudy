public class _13 {
    public static void main(String[] args) {
        sshape donut = new CCircle(10); // 반지름이 10인 원 객체
        donut.redraw();
        System.out.println("면적은 "+ donut.getArea());
    }
}
class CCircle implements sshape{
    private double radius;
    CCircle(int a){
        this.radius = a;
    }
    public void draw(){
        System.out.printf("반지름이 %.1f인 원입니다.\n",radius);
    }
    public double getArea(){
        double area = this.radius*this.radius*3.14;
        return area;
    }
}
interface sshape {
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}