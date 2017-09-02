package chapter1.t06;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 虽然println（）方法在内部是同步的，但i--的操作却是在进入println（）之前发生的，所以可能发生非线程安全问题
 */
public class MyThread extends Thread{
    private int i = 5;

    @Override
    public void run() {
        super.run();
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}
