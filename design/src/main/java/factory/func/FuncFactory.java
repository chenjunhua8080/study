package factory.func;

import factory.Car;

/**
 * 方法工厂
 */
public interface FuncFactory {

    /**
     * 根据类型获取汽车
     */
    Car getCar();

}
