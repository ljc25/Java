package demo09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class test {
    public static void main(String[] args) throws ParseException {
        //1、获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您得到出生日期，格式为yyyy-MM-dd");
        String birthdayDateString = sc.next();
        //2、使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        //3、把Date格式的出生日期转换为毫秒值
        long birthdayDayTime = birthdayDate.getTime();
        //4、获取当前时间，转换为毫秒值
        long todayTime = new Date().getTime();
        //5、获取当前时间的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDayTime;
        //6、把毫秒值的差值转换为天(s/1000/60/60/24)
        System.out.println(time/1000/60/60/24);
    }
}
