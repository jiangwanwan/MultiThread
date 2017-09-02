package chapter2.t01;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
