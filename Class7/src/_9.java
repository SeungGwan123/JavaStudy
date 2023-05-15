import java.util.ArrayList;

public class _9 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for(int i = 0; i < 10; i++) stack.push(i);
        while(true) {
            Integer n = stack.pop();
            if(n == null) break;
            System.out.print(n + " ");
        }
    }
}
interface IStack<T> {
    T pop();
    boolean push(T ob);
}
class MyStack<T> implements IStack<T>{
    private ArrayList<T> al;
    MyStack() {
        this.al = new ArrayList<T>();
    }
    public boolean push(T ob){
        this.al.add(ob);
        return true;
    }

    @Override
    public T pop() {
        if(this.al.size()==0){
            return null;
        }else {
            T temp = this.al.get(0);
            this.al.remove(0);
            return temp;
        }
    }
}