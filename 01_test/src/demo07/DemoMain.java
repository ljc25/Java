package demo07;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(20);
        hero.setName("盖伦");

        Weapon weapon = new Weapon("无尽");
        hero.setWeapon(weapon);

        hero.attack();

    }
}
