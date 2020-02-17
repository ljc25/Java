package demo10;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class demo {
    public static void main(String[] args) {
        test4();
    }

    private static void test4() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH,1);
        int month = c.get(Calendar.MONTH);
        while (c.get(Calendar.MONTH)==month)
        {
            c.add(Calendar.DATE,1);
            System.out.println("c.add(DATE,1)结果：" + sdf.format(c.getTime()));
        }
        c.add(Calendar.DATE,-3);
        System.out.println("下个月的倒数第三天：" + sdf.format(c.getTime()));

    }
}
