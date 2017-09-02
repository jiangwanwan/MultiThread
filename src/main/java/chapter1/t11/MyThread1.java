package chapter1.t11;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
