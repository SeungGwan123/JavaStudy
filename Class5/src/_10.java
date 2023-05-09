public class _10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 " + dic.get("황기태")); //삭제된 아이템 접근
    }
}
class Dictionary extends PairMap{
    private int num;
    private int size;
    private int find=-1;
    Dictionary(int a){
        super.KeyArray = new String[a];
        super.valueArray = new String[a];
        this.size = a;
        this.num=0;
    }
    public void put(String key,String value){
        int check=0;
        for(int i=0;i<this.num;i++){
            if(super.KeyArray[i].equals(key)){
                super.valueArray[i] = value;
                check=1;
            }
        }
        if(check==0){
            super.KeyArray[this.num]=key;
            super.valueArray[this.num] = value;
            this.num++;
        }
    }
    public String get(String key){
        for(int i=0;i<size;i++){
            if(super.KeyArray[i].equals(""))break;
            if(super.KeyArray[i].equals(key)){
                this.find = i;
                break;
            }
        }
        if(this.find==-1){
            return "없는 값입니다.";
        }else{
            int temp = this.find;
            this.find=0;
            return super.valueArray[temp];
        }
    }
    public String delete(String key) {
        for(int i=0;i<num;i++){
            if(super.KeyArray[i].equals(key)){
                this.find = i;
                break;
            }
        }
        if(find==-1){
            return "없는 값입니다.";
        }else{
            int temp = this.find;
            this.find=0;
            super.valueArray[temp]=null;
            return super.valueArray[temp];
        }
    }
    public int length(){
        int temp=0;
        for(int i=0;i<size;i++){
            if(super.KeyArray[i].equals("")){
                temp++;
            }
        }
        return temp;
    }
}
abstract class PairMap {
    protected String KeyArray[]; // key 들을 저장하는 배열
    protected String valueArray[]; // value 들을 저장하는 배열
    abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
    abstract String delete(String key); // key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴
    abstract int length(); // 현재 저장된 아이템의 개수 리턴
}