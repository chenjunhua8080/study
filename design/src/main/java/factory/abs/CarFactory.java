package factory.abs;

import factory.BaoMa;
import factory.BenChi;
import factory.BenTian;
import factory.Car;

/**
 * 抽象工厂-实现工厂
 */
public class CarFactory extends AbstractFactory {

    public Car getBaoMa() {
        return new BaoMa();
    }

    public Car getBenChi() {
        return new BenChi();
    }

    public Car getBenTian() {
        return new BenTian();
    }
}
