package chapter1.t08;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end=" + System.currentTimeMillis());
    }
}
