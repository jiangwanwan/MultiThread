package chapter1.t07;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
