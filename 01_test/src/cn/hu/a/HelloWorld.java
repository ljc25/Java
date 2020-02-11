package cn.hu.a;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入的第一个数字为");
        int num1 = sc.nextInt();
        System.out.println("输入的第二个数字为");
        int num2 = sc.nextInt();
       // String num2 = sc.next();

        int result = num1+num2;
        System.out.println("输入的数字为"+result);
      //  System.out.println("输入的名字为"+num2);
    }
}
