package factory.func;

import factory.BenChi;
import factory.Car;

/**
 * 方法工厂-奔驰工厂
 */
public class BenChiFactory implements FuncFactory {

    public Car getCar() {
        return new BenChi();
    }
}
