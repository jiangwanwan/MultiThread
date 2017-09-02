package chapter1.t11;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
