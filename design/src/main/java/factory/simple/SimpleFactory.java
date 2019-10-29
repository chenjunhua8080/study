package factory.simple;

import factory.BaoMa;
import factory.BenChi;
import factory.BenTian;
import factory.Car;

/**
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 根据类型获取汽车
     */
    public Car getCar(String type) {
        Car car = null;
        if ("宝马".equals(type)) {
            car = new BaoMa();
        } else if ("奔驰".equals(type)) {
            car = new BenChi();
        } else if ("本田".equals(type)) {
            car = new BenTian();
        } else {
            System.out.println("未知type: " + type);
        }
        return car;
    }

}
