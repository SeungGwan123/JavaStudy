public class BitOperator {
    public static void main(String[] args){
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        System.out.println("[비트연산결과]");
        System.out.printf("%04x\n",(short)(a&b));
        System.out.printf("%04x\n",(short)(a|b));
        System.out.printf("%04x\n",(short)(a^b));
        System.out.printf("%04x\n",(short)(~a));

        byte c = 20;
        byte d = -8;

        System.out.println("[시프트연산결과]");
        System.out.println(c<<2);
        System.out.println(c>>2);
        System.out.println(d>>2);
        System.out.printf("%x\n",(d>>>2));
    }
}
