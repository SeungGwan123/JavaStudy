public class _4 {
    public static void main(String args[]){
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("S의 면적은 "+s.area());
        if(t.contain(r))System.out.println("t는 r을 포함합니다.");
        if(t.contain(s))System.out.println("t는 s를 포함합니다.");
    }
}
class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;
    Rectangle(){
        this(0000,0000,0000,0000);
    }
    Rectangle(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void show(){
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형\n",x,y,width,height);
    }
    public int area(){
        return (width*height);
    }
    public boolean contain(Rectangle r){
        if(x<r.x&&(x+width>r.x+r.width)&&y<r.y&&(y+height>r.y+r.height)){
            return true;
        }else{
            return false;
        }
    }
}
