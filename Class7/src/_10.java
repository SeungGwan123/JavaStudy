import java.util.Scanner;
import java.util.Vector;

public class _10 {
    public static void main(String[] args){
        GraphicEditor G = new GraphicEditor();
        G.GraphicEditor();
    }
}
abstract class Shape{
    public abstract void draw();
}
class GraphicEditor{
    public void GraphicEditor(){
        Vector<Shape> v = new Vector<Shape>();
        int num=1;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            Scanner scan = new Scanner(System.in);
            int behave = scan.nextInt();
            if(behave==1){
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int shape = scan.nextInt();
                Shape s;
                switch (shape) {
                    case 1:
                        s = new Line();
                        v.add(s);
                        break;
                    case 2:
                        s = new Rect();
                        v.add(s);
                        break;
                    case 3:
                        s = new Circle();
                        v.add(s);
                        break;
                    default:
                        break;
                }
            }else if(behave==2){
                System.out.print("삭제할 도형 위치>>");
                int location = scan.nextInt();
                if(location-1>v.size()){
                    System.out.println("삭제할수없습니다.");
                    continue;
                }
                else{
                    v.remove(location-1);
                }
            }else if(behave==3){
                for(int i=0;i<v.size(); i++){
                    v.elementAt(i).draw();
                }
                System.out.println();
            }
            else if(behave==4){
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
class Line extends Shape {
    String name ="line";
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    String name ="Rect";
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    String name ="circle";
    public void draw() {
        System.out.println("Circle");
    }
}