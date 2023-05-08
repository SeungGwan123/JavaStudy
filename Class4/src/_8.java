import java.util.Scanner;

public class _8 {
    public static void main(String args[]){
        run();
    }

    public static void run() {
        PhoneBook PB = new PhoneBook();
        PB.search();
    }
}
class PhoneBook{
    private Phone[] p;
    PhoneBook(){
        System.out.print("인원수>>");
        Scanner scan = new Scanner(System.in);
        p = new Phone[scan.nextInt()];
        for(int i=0;i<p.length;i++){
            System.out.print("이름과 전화번호>>");
            p[i]=new Phone(scan.next(), scan.next());
        }
        System.out.println("저장되었습니다.");
    }
    public void search(){
        while(true){
            System.out.print("검색할이름>>");
            Scanner scan = new Scanner(System.in);
            String temp = scan.next();
            if(temp.equals("그만"))break;
            for(int i=0;i<p.length;i++){
                if(p[i].name().equals(temp)){
                    p[i].Search();
                    break;
                }
                if(i==(p.length - 1)){
                    System.out.printf("%s이 없습니다.\n",temp);
                }
            }
        }
    }
}
class Phone{
    private String name;
    private String number;
    Phone(String name,String number){
        this.name = name;
        this.number = number;
    }
    public String name(){
        return name;
    }
    public void Search(){
        System.out.printf("%s의 번호는 %s입니다.\n",name,number);
    }
}
