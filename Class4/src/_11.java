import java.util.Scanner;

public class _11 {
    public static void main(String args[]){
        System.out.print("두 정수와 연산자를 입력하시오.>>");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String c = scan.next();
        if(c.equals("+")){
            Add Add = new Add();
            Add.setValue(a,b);
            System.out.println(Add.calculate());
        }else if (c.equals("-")) {
            Sub Sub = new Sub();
            Sub.setValue(a, b);
            System.out.println(Sub.calculate());
        }else if (c.equals("*")) {
            Mul Mul = new Mul();
            Mul.setValue(a, b);
            System.out.println(Mul.calculate());
        }else{
            Div Div = new Div();
            Div.setValue(a, b);
            System.out.println(Div.calculate());
        }
    }
}

class Add{
    private int a;
    private int b;

    public void setValue(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a+b;
    }
}
class Sub{
    private int a;
    private int b;

    public void setValue(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a-b;
    }
}
class Mul{
    private int a;
    private int b;

    public void setValue(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a*b;
    }
}
class Div{
    private int a;
    private int b;

    public void setValue(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a/b;
    }
}