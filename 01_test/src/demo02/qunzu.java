package demo02;

import java.util.ArrayList;

public class qunzu extends person{

    public qunzu(){}

    public qunzu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来储存若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney)
        {
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney-totalMoney);

        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for(int i = 0;i< count-1;i++)
        {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
