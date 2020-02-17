package demo09;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws ParseException {
        test2();
    }

    private static void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date startDate = sdf.parse("1970");
        Date endDate = sdf.parse("2000");
        long difference = endDate.getTime() - startDate.getTime();

        Date[] dateArr = new Date[9];
        System.out.println("排序前随机时间数组为：");
        for (int i = 0; i < dateArr.length; i++) {
            Date date = new Date((long)(Math.random()*difference)+startDate.getTime());
            dateArr[i] = date;

//            System.out.println(sdf.format(date)+"   ");
            System.out.println(date+"   ");
            if((i+1)%3 == 0)
                System.out.println();
        }


    SimpleDateFormat sdf2 = new SimpleDateFormat("HHmmss");
        for (int i = 0; i < dateArr.length-1; i++) {
            for (int j = i+1; j < dateArr.length; j++) {
                String str1 = sdf2.format(dateArr[i]);
                int num1 = Integer.parseInt(str1);
                String str2 = sdf2.format(dateArr[j]);
                int num2 = Integer.parseInt(str2);
                if(num1>num2)
                {
                    Date Temp = dateArr[i];
                    dateArr[i] = dateArr[j];
                    dateArr[j] = Temp;
                }
            }
        }

        System.out.println("排序后的数组的输出为：");
        for (int i = 0; i < dateArr.length; i++) {
            System.out.println(dateArr[i]+"     ");
            if((i+1)%3==0)
                System.out.println();
        }
    }
}
