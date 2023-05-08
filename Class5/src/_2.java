public class _2 {
    public static void main(String args[]){
        IPTV iptv = new IPTV("192.1.1.2",32,2048);
        iptv.printProperty();
    }
}
class IPTV extends ColorTv{
    private String address;
    IPTV(String a,int b,int c){
        super(b,c);
        this.address = a;
    }
    public void printProperty(){
        System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러",address,getSize(),getColor());
    }
}