import java.util.Scanner;

public class _9 {
    public static void main(String args[]){
        System.out.print("총 스택 저장 공간의 크기 입력 >>");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        StringStack s = new StringStack(size);
        while(true){
            System.out.print("문자열 입력 >>");
            String temp = scan.next();
            if(!s.push(temp)){
                System.out.print("스택이 꽉 차서 푸시 불가\n");
            }
            if(temp.equals("그만")){
                System.out.print("스택에 저장된 모든 문자열 팝 : ");
                for(int i=0;i<size;i++){
                    System.out.print(s.pop()+" ");
                }
                break;
            }
        }
    }
}
class StringStack implements Stack {
    private String[] ss;
    private int num=0;
    private int erase =0;
    StringStack(int a){
        this.ss = new String[a];
    }
    public int length(){
        int temp=0;
        for(int i=0;i<this.ss.length; i++){
            if(ss[i]!=null){
                temp++;
            }
        }
        return temp;
    }
    public int capacity(){
        return this.ss.length;
    }
    public String pop(){
        String temp = this.ss[0];
        for(int i=1;i<this.ss.length; i++){
            this.ss[i-1]=this.ss[i];
        }
        num--;
        return temp;
    }
    public boolean push(String val){
        if(num==ss.length){
            return false;
        }else {
            this.ss[num] = val;
            num++;
            return true;
        }
    }
}
interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 톱(top)에 실수 저장
    boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}