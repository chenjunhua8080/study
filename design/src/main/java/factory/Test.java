package factory;

import factory.abs.AbstractFactory;
import factory.abs.CarFactory;
import factory.func.BaoMaFactory;
import factory.func.BenChiFactory;
import factory.func.BenTianFactory;
import factory.func.FuncFactory;
import factory.simple.SimpleFactory;

public class Test {

    public static void main(String[] args) {
        Car baoMa;
        Car benChi;
        Car benTian;

        //不用工厂
        System.out.println("*********不用工厂：得一个一个new对象，不好管理");
        baoMa = new BaoMa();
        benChi = new BenChi();
        benTian = new BenTian();
        showInfo(baoMa, benChi, benTian);

        //简单工厂
        System.out.println("*********简单工厂：工厂内部混乱，需要用户知道具体的业务");
        SimpleFactory simpleFactory = new SimpleFactory();
        baoMa = simpleFactory.getCar("宝马");
        benChi = simpleFactory.getCar("奔驰");
        benTian = simpleFactory.getCar("本田");
        simpleFactory.getCar("其他");
        showInfo(baoMa, benChi, benTian);

        //方法工厂
        System.out.println("*********方法工厂：工厂泛滥，需要用户知道具体工厂");
        BaoMaFactory baoMaFactory = new BaoMaFactory();
        baoMa = baoMaFactory.getCar();
        benChi = new BenChiFactory().getCar();
        FuncFactory benTienFactory = new BenTianFactory();
        benTian = benTienFactory.getCar();
        showInfo(baoMa, benChi, benTian);

        //抽象工厂
        System.out.println("*********抽象工厂：符合开闭原则，用户只需要通过实现工厂调用");
        AbstractFactory carFactory = new CarFactory();
        baoMa = carFactory.getBaoMa();
        benChi = carFactory.getBenChi();
        benTian = carFactory.getBenTian();
        showInfo(baoMa, benChi, benTian);
    }

    private static void showInfo(Car baoMa, Car benChi, Car benTian) {
        System.out.println(baoMa.getLogo() + "/" + benChi.getLogo() + "/" + benTian.getLogo() + "\n");
    }


}
