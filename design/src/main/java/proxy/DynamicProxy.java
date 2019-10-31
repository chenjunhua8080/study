package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(final Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("购买房子费用 " + args[0] + " 万元");
        System.out.println("代理费 5 万");
        args[0] = Integer.valueOf(args[0].toString()) + 5;

        Object invoke = method.invoke(object, args);
        User user = (User) object;
        if (Boolean.valueOf(invoke.toString())) {
            System.out.println("恭喜 " + user.getName() + " 购房成功~");
        } else {
            System.out.println("购房失败，您的资金不足~");
        }
        return invoke;
    }
}
