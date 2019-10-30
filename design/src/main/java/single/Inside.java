package single;

/**
 * 单例模式-静态内部类
 */
public class Inside {

    /**
     * 私有化构造方法
     */
    private Inside() {
    }

    /**
     * 静态内部类
     */
    private static class InsideClass {

        private static Inside inside = new Inside();

        static {
            System.out.println("inside: " + inside);
        }
    }

    public static Inside getInstance() {
        return InsideClass.inside;
    }


}
