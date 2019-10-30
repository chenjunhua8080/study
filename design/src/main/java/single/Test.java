package single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        //饿汉式
        System.out.println("************饿汉式：线程安全，实例化前就会加载");
        ExecutorService cachedPool = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            cachedPool.execute(new Runnable() {
                public void run() {
//                    System.out.println(Thread.currentThread().getId() + "---" + Hungry.getInstance());
                }
            });
        }
        //懒汉式
        System.out.println("************懒汉式：线程不安全(可用synchronized修饰getInstance方法，但性能不好)，用的时候才实例化");
        for (int i = 0; i < 500; i++) {
            cachedPool.execute(new Runnable() {
                public void run() {
                    try {
                        //这里线程休眠一下才会出现多线程不安全的问题
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println(Thread.currentThread().getId() + "---" + Lazy.getInstance());
                }
            });
        }
        //容器式
        System.out.println("************容器式：线程不一定安全，spring中用到");
        for (int i = 0; i < 500; i++) {
            cachedPool.execute(new Runnable() {
                public void run() {
                    try {
                        //这里线程休眠一下才会出现多线程不安全的问题
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Container.putInstance("bean", new Bean());
//                    System.out.println(Thread.currentThread().getId() + "---" + Container.getInstance("bean"));
                }
            });
        }
        //静态内部类式
        System.out.println("************静态内部类式：线程安全");
        for (int i = 0; i < 500; i++) {
            cachedPool.execute(new Runnable() {
                public void run() {
                    try {
                        //这里线程休眠一下才会出现多线程不安全的问题
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getId() + "---" + Inside.getInstance());
                }
            });
        }

    }

}
