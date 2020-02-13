package demo05;

public class AnimalTool {

    private AnimalTool() {
    }

    public static void feedanimal(Animal one)
    {
        one.eat();
        one.sleep();
    }

}
