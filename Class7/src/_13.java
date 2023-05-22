import java.util.*;

public class _13 {
    public static void main(String[] args){
        System.out.println("수퍼컴이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            Vector<StringTokenizer> order = new Vector<StringTokenizer>();
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            Vector<String> Or = new Vector<String>();
            Vector<String> subject = new Vector<String>();
            Vector<String> x = new Vector<String>();
            while(true){
                System.out.print(">>");
                String temp = sc.nextLine();
                StringTokenizer st = new StringTokenizer(temp," ");
                if(temp.equals("go"))break;
                order.add(st);
                Or.add(st.nextToken());
                subject.add(st.nextToken());
                x.add(st.nextToken());
            }
            for(int i=0;i<order.size(); i++) {
                StringTokenizer st = order.elementAt(i);
                switch (Or.elementAt(i)) {
                    case "move":
                        if(x.elementAt(i).equals("sum")||x.elementAt(i).equals("i")||x.elementAt(i).equals("n")){
                            map.put(subject.elementAt(i),map.get(x.elementAt(i)));
                        }else {
                            map.put(subject.elementAt(i),Integer.parseInt(x.elementAt(i)));
                        }
                        break;
                    case "add":
                        if(x.elementAt(i).equals("sum")||x.elementAt(i).equals("i")||x.elementAt(i).equals("n")){
                            map.put(subject.elementAt(i), map.get(subject.elementAt(i)) + map.get(x.elementAt(i)));
                        }else {
                            map.put(subject.elementAt(i), map.get(subject.elementAt(i)) + Integer.parseInt(x.elementAt(i)));
                        }
                        break;
                    case "sub":
                        if(x.elementAt(i).equals("sum")||x.elementAt(i).equals("i")||x.elementAt(i).equals("n")){
                            map.put(subject.elementAt(i), map.get(subject.elementAt(i)) - map.get(x.elementAt(i)));
                        }else {
                            map.put(subject.elementAt(i), map.get(subject.elementAt(i)) - Integer.parseInt(x.elementAt(i)));
                        }
                        break;
                    case "jn0":
                        if(map.get(subject.elementAt(i))!=0)i=Integer.parseInt(x.elementAt(i))-1;
                        break;
                    case "prt":
                        System.out.printf("[ %s %d ]\n",subject.elementAt(i),map.get(subject.elementAt(i)));
                        break;
                    default:
                        break;
                }
            }
            System.out.print("종료할까요?(종료하려면 입력:0)>>");
            if(sc.nextInt()==0)break;
        }
    }
}
