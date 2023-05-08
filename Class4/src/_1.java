public class _1 {
    public static void main(String args[]){
        TV myTV = new TV("LG",2017,32);
        myTV.show();
    }
    public static class TV{
        static String a;
        static int b;
        static int c;
        public static void show(){
            System.out.printf("%s에서 만든 %d년형 %d인치 TV",a,b,c);
        }
        public TV(String x, int y,int z){
            a=x;
            b=y;
            c=z;
        }
    }
}
