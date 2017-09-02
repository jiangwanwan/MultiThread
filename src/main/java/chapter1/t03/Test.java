package chapter1.t03;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 自定义线程类中的实例变量count不共享
 */
public class Test {
    public static void main(String[] arg) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
    }
}
