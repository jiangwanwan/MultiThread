package chapter1.t04;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 自定义线程类中的实例变量count共享
 */
public class Test {
    public static void main(String[] arg) {
        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
