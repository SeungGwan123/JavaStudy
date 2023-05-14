import java.util.Calendar;
public class _5 {
    public static void main(String args[]){
        Calendar now = Calendar.getInstance();
        int ampm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        if(ampm==Calendar.PM)hour-=12;
        int minute = now.get(Calendar.MINUTE);
        System.out.printf("현재 시간은 %d시 %d분입니다.\n",hour,minute);
        if(ampm==Calendar.AM&&hour>=4&&hour<=12){
            System.out.printf("Good Morning");
        }else if(ampm==Calendar.PM&&hour<=6){
            System.out.printf("Good Afternoon");
        }else if(ampm==Calendar.PM&&hour<=10){
            System.out.printf("Good Evening");
        }else{
            System.out.printf("Good Night");
        }
    }
}
