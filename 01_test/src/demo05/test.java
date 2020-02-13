package demo05;

public class test {
    public static void main(String[] args) {
        cat one = new cat();
        Dog two = new Dog();
        Pig three = new Pig();

        AnimalTool.feedanimal(one);
        System.out.println("===========");

        AnimalTool.feedanimal(two);
        System.out.println("===========");

        AnimalTool.feedanimal(three);
        System.out.println("===========");

    }
}
