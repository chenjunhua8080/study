package single;


/**
 * 单例模式-饿汉式
 */
public class Hungry {

    /**
     * 私有化构造方法
     */
    private Hungry() {
    }

    /**
     * 实例化一个
     */
    private static final Hungry hungry = new Hungry();

    static {
        System.out.println("饿汉实例化-hungry: " + hungry);
    }

    public static Hungry getInstance() {
        return hungry;
    }
}
