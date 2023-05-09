import java.util.Scanner;

public class _11 {
    public static void main(String args[]){
        System.out.print("두 정수와 연산자를 입력하세요>>");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String c = scan.next();
        switch (c){
            case"+":
                Add add = new Add();
                add.setValue(a,b);
                System.out.print(add.calculate());
                break;
            case"-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.print(sub.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.print(mul.calculate());
                break;
            case"/":
                Div div = new Div();
                div.setValue(a, b);
                System.out.print(div.calculate());
                break;
        }
    }
}
class Add extends Calc{
    public void setValue(int a,int b){
        super.a=a;
        super.b = b;
    }
    public int calculate(){
        return super.a+super.b;
    }
}
class Sub extends Calc {
    public void setValue(int a,int b){
        super.a=a;
        super.b = b;
    }
    public int calculate(){
        return super.a-super.b;
    }
}
class Mul extends Calc {
    public void setValue(int a,int b){
        super.a=a;
        super.b = b;
    }
    public int calculate(){
        return super.a*super.b;
    }
}
class Div extends Calc {
    public void setValue(int a,int b){
        super.a=a;
        super.b = b;
    }
    public int calculate(){
        return super.a/super.b;
    }
}
abstract class Calc{
    protected int a;
    protected int b;
    abstract void setValue(int a,int b);
    abstract int calculate();
}