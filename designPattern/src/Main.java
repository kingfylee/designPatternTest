import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/5 0005.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.printf("3>7的结果是：%b %n", 3>7);
//        int i = 1;
//        String a = (i == 1 ? i : "") + "";
//        int chg =1 ;
//        int add1 = 3;
//        String m = (chg < 0 && add1 != 0 ? add1 : "") + "";

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

        String hh = new SimpleDateFormat("HH").format(new Date());
        String mm = new SimpleDateFormat("mm").format(new Date());
        String ss = new SimpleDateFormat("ss").format(new Date());
        System.out.println(hh);
        System.out.println(mm);
        System.out.println(ss);

        String HHmmss = new SimpleDateFormat("HHmmss").format(new Date());
        System.out.println(HHmmss);

        Calendar now = Calendar.getInstance();
        now.set(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now
                .get(Calendar.DAY_OF_MONTH), now.get(Calendar.HOUR_OF_DAY), now
                .get(Calendar.MINUTE), now.get(Calendar.SECOND));
        System.out.println(now);
        System.out.println(now.get(Calendar.HOUR_OF_DAY));


    }

    public static String ConvertDateFormat(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date d = sdf.parse(date);
            date = sdf.format(d);
            d = null;
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        sdf = null;
        return date;
    }
}
