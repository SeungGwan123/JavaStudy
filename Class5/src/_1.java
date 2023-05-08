public class _1 {
    public static void main(String args[]){
        ColorTv myTv = new ColorTv(32,1024);
        myTv.printProperty();
    }
}
class TV{
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}
class ColorTv extends TV{
    private int color;
    ColorTv(int a, int b){
        super(a);
        this.color = b;
    }
    public void printProperty(){
        int inch = getSize();
        System.out.printf("%d인치 %d컬러\n",getSize(),color);
    }
    protected int getColor() {
        return color;
    }
}