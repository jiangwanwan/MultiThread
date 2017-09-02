package chapter2.t03;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 锁重入
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
