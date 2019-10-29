package factory.func;

import factory.BenTian;
import factory.Car;

/**
 * 方法工厂-本田工厂
 */
public class BenTianFactory implements FuncFactory {

    public Car getCar() {
        return new BenTian();
    }
}
