import java.util.ArrayList;
import java.util.Scanner;

public class _5 {
    public static void main(String[] args){
        System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
        ArrayList<Student> al = new ArrayList<Student>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String name = scan.next();
            if(name.equals("그만")){
                break;
            }
            String depart = scan.next();
            int num = scan.nextInt();
            int average = scan.nextInt();
            al.add(new Student(name,depart,num,average));
        }
        for(int i=0;i < al.size(); i++){
            System.out.printf("이름 : %s\n",al.get(i).getName());
            System.out.printf("학과 : %s\n",al.get(i).getDepart());
            System.out.printf("학번 : %d\n",al.get(i).getNum());
            System.out.printf("학점 평균 : %d\n",al.get(i).getAverage());
        }
        while(true){
            System.out.printf("학생이름 >> ");
            String temp = scan.next();
            if(temp.equals("그만"))break;
            for(int i=0;i<al.size();i++){
                if(al.get(i).getName().equals(temp)){
                    Student S = al.get(i);
                    System.out.printf("%s %s %d %d\n",S.getName(),S.getDepart(),S.getNum(),S.getAverage());
                    break;
                }
                if(i==al.size()-1){
                    System.out.printf("없는 학생입니다.\n");
                }
            }
        }
        System.out.println("시스템이 종료되었습니다.");
    }
}
class Student{
    private String name;
    private String depart;
    private int num;
    private int average;
    Student(String n,String d,int N,int A){
        this.name = n;
        this.depart = d;
        this.num = N;
        this.average = A;
    }
    public String getName() {
        return this.name;
    }
    public String getDepart(){
        return this.depart;
    }
    public int getNum(){
        return this.num;
    }
    public int getAverage(){
        return this.average;
    }
}