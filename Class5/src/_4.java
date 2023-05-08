public class _4 {
    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
        toMile.run();
    }
}
class Km2Mile extends Converter {
    private double k2m;
    private String src;
    private String dest;
    Km2Mile(double a) {
        this.k2m = a;
    }
    public double convert(double src){
        return src/k2m;
    }
    public String getSrcString(){
        return this.src = "킬로미터";
    }
    public String getDestString(){
        return this.dest = "마일";
    }
    public void run(){
        super.run();
    }
}
