package chapter2.t02;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 实例变量可能存在“非线程安全”问题
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA aThread = new ThreadA(numRef);
        ThreadB bThread = new ThreadB(numRef);

        aThread.start();
        bThread.start();

    }
}
