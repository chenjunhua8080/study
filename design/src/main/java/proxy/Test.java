package proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        //创建用户
        User user = new User();
        user.setMoney(100);
        user.setName("张三");
        //静态代理买房
        System.out.println("*************静态代理,我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改");
        StaticProxy staticProxy = new StaticProxy(user);
        staticProxy.buyHouse(100);
        //动态代理买房
        System.out.println("*************动态代理,动态代理大大减少了我们的开发任务，同时减少了对业务接口的依赖，降低了耦合度");
        Sale dynamicProxy = (Sale) Proxy.newProxyInstance(
            Sale.class.getClassLoader(),
            new Class[]{Sale.class},
            new DynamicProxy(user)
        );
        dynamicProxy.buyHouse(50);
    }

}
