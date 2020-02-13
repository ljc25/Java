package demo05;

public class Pig extends Animal {
    public Pig() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("猪吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("猪睡觉觉");
    }

}
