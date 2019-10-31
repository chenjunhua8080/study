package proxy;

public class StaticProxy implements Sale {

    private User user;

    public StaticProxy(User sale) {
        this.user = sale;
    }

    public boolean buyHouse(int money) {
        System.out.println("打算购买 " + money + " 万元的房子");
        money += 10;
        System.out.println("加收代理买房费: 10万元");
        boolean result = user.buyHouse(money);
        if (result) {
            System.out.println("恭喜 " + user.getName() + " 购房成功~");
        } else {
            System.out.println("购房失败，您的资金不足~");
        }
        return result;
    }
}
