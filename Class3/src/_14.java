import java.util.Scanner;

public class _14 {
    public static void main(String args[]){
        String[] course = {"Java","C++","HTMLS","컴퓨터구조","안드로이드"};
        int[] score = {95,88,76,62,55};
        while(true){
            System.out.print("과목 이름>>");
            Scanner scan = new Scanner(System.in);
            String subject = scan.nextLine();
            if(subject.equals("그만")){
                break;
            }
            switch(subject){
                case "Java":
                    System.out.printf("%s의 점수는 %d\n",subject,score[0]);
                    break;
                case "C++":
                    System.out.printf("%s의 점수는 %d\n",subject,score[1]);
                    break;
                case "HTMLS":
                    System.out.printf("%s의 점수는 %d\n",subject,score[2]);
                    break;
                case "컴퓨터구조":
                    System.out.printf("%s의 점수는 %d\n",subject,score[3]);
                    break;
                case "안드로이드":
                    System.out.printf("%s의 점수는 %d\n",subject,score[4]);
                    break;
                default:
                    System.out.println("없는 과목입니다.");
                    break;
            }
        }
    }
}
