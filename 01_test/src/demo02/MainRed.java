package demo02;

import java.util.ArrayList;

public class MainRed {
    public static void main(String[] args) {
        qunzu manager = new qunzu("群主",100);

        chengyuan one = new chengyuan("成员A",0);
        chengyuan two = new chengyuan("成员B",0);
        chengyuan three = new chengyuan("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

        ArrayList <Integer> redlist = manager.send(20,3);

        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        manager.show();

        one.show();
        two.show();
        three.show();
    }
}
