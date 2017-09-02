package chapter1.t04;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread extends Thread{
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count --;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
    }
}
