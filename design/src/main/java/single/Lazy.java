package single;

/**
 * 单例模式-懒汉式
 */
public class Lazy {


    /**
     * 私有化构造方法
     */
    private Lazy() {
    }

    /**
     * 实例化一个
     */
    private static Lazy lazy;

    static {
        System.out.println("懒汉实例化-lazy: " + lazy);
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
