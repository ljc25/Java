package cn.hu.a;

public class User {
    private String name; //姓名
    private int money;

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
