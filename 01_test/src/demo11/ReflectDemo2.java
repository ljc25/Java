package demo11;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException {
        //0.获取Person的Class对象
        Class personClass = Person.class;

        Field[] fields = personClass.getFields();
        for (Field field:fields){
            System.out.println(field);
        }

        System.out.println("-----------");

        Field a =personClass.getField("a");

    }
}
