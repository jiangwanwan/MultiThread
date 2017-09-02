package chapter1.t08;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + "begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + "end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
