package factory.func;

import factory.BaoMa;
import factory.Car;

/**
 * 方法工厂-宝马工厂
 */
public class BaoMaFactory implements FuncFactory {

    public Car getCar() {
        return new BaoMa();
    }
}
