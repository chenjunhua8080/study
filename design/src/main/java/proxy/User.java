package proxy;

import lombok.Data;

/**
 * 定义一个用户
 */
@Data
public class User implements Sale {

    private int money;

    private String name;

    public boolean buyHouse(int money) {
        System.out.println("尝试付款: " + money + " 万元");
        boolean isBuy = this.money >= money;
        System.out.println("购买结果: " + isBuy);
        return isBuy;
    }
}
