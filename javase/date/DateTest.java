package javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");

    public static String getDateNow() {
        Date date = new Date();
        //MM表示月 mm表示分;
        //HH（24） hh(12)
        String str = sdf.format(date);
        return str;
    }

    public static String timeD(Long time) {
        Long days = time / (1000 * 60 * 60 * 24);
        Long hours = (time - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        Long mintues = (time - days * (1000 * 60 * 60 * 24) - hours * (1000 * 60 * 60)) / (1000 * 60);
        Long seconds = (time - days * (1000 * 60 * 60 * 24) - hours * (1000 * 60 * 60) - mintues * (1000 * 60)) / 1000;
        String str = days + "天 " + hours + "小时 " + mintues + "分钟 " + seconds + "秒";
        return str;
    }

    public static void main(String[] args) {
        String s_date1 = getDateNow();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String s_date2 = getDateNow();

        try {
            System.out.println(s_date1);
            System.out.println(s_date2);
            Date date1 = sdf.parse(s_date1);
            Date date2 = sdf.parse(s_date2);
            Long timed = date2.getTime() - date1.getTime();
            String str = timeD(timed);
            System.out.println(str);
            System.out.println(timed);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
