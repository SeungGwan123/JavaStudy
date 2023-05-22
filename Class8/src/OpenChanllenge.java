import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OpenChanllenge {

    ArrayList<String> words = new ArrayList<String>();
    Scanner scanWords = new Scanner(new FileReader("words.txt"));
    Scanner scan = new Scanner(System.in);
    char[] question;
    final int WORDS_SIZE = 30;

    int randomNum;
    char answer = ' ';
    int cnt = 0;
    int answerCnt = 0;
    boolean flag = false;

    public OpenChanllenge() throws FileNotFoundException {
        while(scanWords.hasNext()) {			// 변수들을 초기화 해준다.
            String word = scanWords.nextLine();
            words.add(word);
        }
        System.out.println("지금부터 행맨 게임을 시작합니다.");
        while(true) {
            init();
            run();
        }
    }

    public void init() {						// 무한루프를 돌아, 값을 다시 초기화해야하는
        randomNum = 0;
        cnt = 0;
        answerCnt = 0;
        answer = ' ';
    }

    public void run() {
        Random rand = new Random();
        Random rand2_1 = new Random();
        Random rand2_2 = new Random();
        randomNum = rand.nextInt(WORDS_SIZE);

        question =  words.get(randomNum).toCharArray();	// 문제로 낼 단어를 char배열로 만든다.

        int questionSize = question.length;				// 단어의 알파벳 숫자중에서 랜덤 숫자를 뽑아야 하기때문에 char배열의 사이즈를 알아낸다.
        int randomNum2_1;
        int randomNum2_2;

        while(true) {
            randomNum2_1 = rand2_1.nextInt(questionSize);	// 0부터 char배열의 사이즈 중 랜덤 숫자 한개뽑음
            randomNum2_2 = rand2_2.nextInt(questionSize);	// 0부터 char배열의 사이즈 중 랜덤 숫자 한개 더 뽑음
            if(randomNum2_1 == randomNum2_2) {				// 랜덤숫자 두개가 같은 숫자가 안나오게 중복체크
                continue;
            }
            break;
        }

        for(int i=0; i<question.length; i++) {		// 문제 단어를 출력하는데,
            if(i == randomNum2_1) {					// 랜덤 숫자 index에 있는 알파벳은 - 로 출력한다.
                System.out.print("-");
            } else if( i == randomNum2_2) {			// 알파벳 하나더.
                System.out.print("-");
            } else {
                System.out.print(question[i]);
            }
        }
        System.out.println();

        while(true) {
            System.out.print(">> ");
            String tmpAnswer = scan.next();			// 알파벳 하나를 입력받고
            answer = tmpAnswer.charAt(0);			// char배열과 비교해야하기때문에 char로 캐스팅

            if(answer == question[randomNum2_1]) {	// 입력받은값이 랜덤 알파벳1과 같으면
                answerCnt++;						// 정답숫자 하나 카운트하고
                flag = true;						// 깃발을 true로 한다.
            }
            if(answer == question[randomNum2_2]) {	// 입력받은값이 랜덤 알파벳2와 같으면
                answerCnt++;						// 정답숫자 하나 카운드 하고
                flag = false;						// 깃발을 false로 한다.
            }

            if(answerCnt == 1) {						// 정답숫자가 하나면
                if(flag) {									// flag가 true면 알파벳1을 맞춘것이기때문에
                    for(int i=0; i<question.length; i++) {	// 알파벳2만 -로 출력한다.
                        if( i == randomNum2_2) {
                            System.out.print("-");
                        } else {
                            System.out.print(question[i]);
                        }
                    }
                    System.out.println();
                } else if (!flag) {						// 반대로, flag가 false면 알파벳 2를 맞춘것이기때문에
                    for(int i=0; i<question.length; i++) {	// 알파벳 1만 -로 출력한다.
                        if( i == randomNum2_1) {
                            System.out.print("-");
                        } else {
                            System.out.print(question[i]);
                        }
                    }
                    System.out.println();
                }
            }

            if(answerCnt == 2) {						// 정답숫자가 2개면 다 맞춘것이기때문에
                choice();								// choice 메소드로, choice 메소드 안에 있는 내용이
                return;									// 똑같이 두번 나와서 메소드로 만듦.
            }

            cnt++;										// 여태까지 if문에 하나도 안걸린거면 정답을 못맞춘것이기때문에, 카운트++

            if(cnt == 5) {								// 5번동안 못맞췄기때문에
                System.out.println("5번 실패하였습니다.");
                choice();								// choice 메소드로 보낸다.
                return;
            }
        }

    }

    public void choice() {
        for(int i=0; i<question.length; i++) {			// 정답 단어를 쫙 출력해주고
            System.out.print(question[i]);
        }
        System.out.println();
        System.out.print("Next(y/n)? ");				// 물어본다. 계속할지말지
        String choice = scan.next();
        if(choice.equals("y")) {						// 계속 하면 바로 보내고(생성자에서 무한루프임)
            return;
        } else {
            System.out.println("종료");					// 아니면 시스템 종료.
            System.exit(0);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new OpenChanllenge();

    }

}
