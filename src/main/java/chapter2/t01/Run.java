package chapter2.t01;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 方法内部的私有变量是安全的，不存在“非线程安全问题”
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
