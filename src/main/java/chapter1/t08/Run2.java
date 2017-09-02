package chapter1.t08;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end=" + System.currentTimeMillis());
    }
}
