package chapter1.t09;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();

            System.out.println("是否停止1？=" + myThread.isInterrupted());
            System.out.println("是否停止2？=" + myThread.isInterrupted());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
