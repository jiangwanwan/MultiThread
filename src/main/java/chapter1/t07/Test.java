package chapter1.t07;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin=" + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end=" + myThread.isAlive());
    }
}
