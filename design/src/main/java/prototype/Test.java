package prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //克隆
        System.out.println("原型模式：实现Cloneable接口进行克隆");
        Bean duoli = new Bean();
        duoli.setName("多莉");
        duoli.setAge(3);
        Bean duoliDD = new Bean();
        duoliDD.setName("多莉的弟弟");
        duoliDD.setAge(1);
        List<Bean> family = new ArrayList<Bean>();
        family.add(duoliDD);
        duoli.setFamily(family);
        Bean clone = (Bean) duoli.clone();
        System.out.println("duoli: " + duoli);
        System.out.println("clone: " + clone);
        System.out.println("duoli.family==clone.family: " + (duoli.family == clone.family));
        System.out.println("需要区分浅复制、深复制：浅复制地址引用是相同的");
        List<Bean> cloneFamily = clone.getFamily();
        cloneFamily.get(0).setName("clone弟弟");
        System.out.println("duoli: " + duoli);
        System.out.println("clone: " + clone);
    }

}
