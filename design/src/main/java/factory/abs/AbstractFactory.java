package factory.abs;

import factory.Car;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    /**
     * 获取宝马
     */
    public abstract Car getBaoMa();

    /**
     * 获取奔驰
     */
    public abstract Car getBenChi();

    /**
     * 获取本田
     */
    public abstract Car getBenTian();

}
