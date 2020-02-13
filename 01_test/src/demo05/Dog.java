package demo05;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗打呼");
    }

}
