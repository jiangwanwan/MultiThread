package chapter1.t11;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 线程优先级的继承性
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
