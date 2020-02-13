package demo06;

public class DemoMain {

    public static void main(String[] args) {
        computer comp = new computer();
        comp.powerOn();

//        Mouse mouse = new Mouse();
        //鼠标
        USB usbmouse = new Mouse();
        comp.useDevice(usbmouse);

        //键盘
        KeyBoard usbkeyboard =new KeyBoard();
        comp.useDevice(usbkeyboard);
        comp.powerOff();
    }
}
