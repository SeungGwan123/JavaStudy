import java.util.Scanner;

public class _12 {
    public static void main(String args[]){
        GraphicEditor G = new GraphicEditor();
        G.GraphicEditor();
    }
}
class GraphicEditor{
    public void GraphicEditor(){
        Shape head = null;
        Shape tail = null;
        int num=1;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            Scanner scan = new Scanner(System.in);
            int behave = scan.nextInt();
            if(behave==1){
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int shape = scan.nextInt();
                switch (shape) {
                    case 1:
                        Line L = new Line();

                        if(num==1){
                            head=L;
                            tail=L;
                            head.setNext(tail);
                            num++;
                        }else{
                            tail.setNext(L);
                            tail=L;
                        }
                        break;
                    case 2:
                        Rect R = new Rect();

                        if(num==1){
                            head=R;
                            tail=R;
                            head.setNext(tail);
                            num++;
                        }else{
                            tail.setNext(R);
                            tail=R;
                        }
                        break;
                    case 3:
                        Circle C = new Circle();
                        if(num==1){
                            head=C;
                            tail=C;
                            head.setNext(tail);
                            num++;
                        }else{
                            tail.setNext(C);
                            tail=C;
                        }
                        break;
                    default:
                        break;
                }
            }else if(behave==2){
                System.out.print("삭제할 도형 위치>>");
                int location = scan.nextInt();
                Shape temp = head;
                if(location>num){
                    System.out.println("삭제할수없습니다.");
                    continue;
                }
                if(location==0){
                    head = head.getNext();
                    num--;
                }
                for(int i=1;i<=location;i++){
                    if(i!=location) {
                        temp = temp.getNext();
                    }else{
                        temp.setNext(temp.getNext().getNext());
                        num--;
                    }
                }
            }else if(behave==3){
                Shape temp = head;
                while(true){
                    temp.draw();
                    if(temp==tail){
                        break;
                    }
                    temp = temp.getNext();
                }
            }
            else if(behave==4){
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
class Line extends Shape{
    private Shape Line;
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape {
    private Shape Rect;
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    private Shape Circle;
    public void draw(){
        System.out.println("Circle");
    }
}
abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; } // 링크 연결
    public Shape getNext() { return next; }
    public abstract void draw();
}
