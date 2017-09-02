package chapter1.t02;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class MyThread extends Thread{
    private int i;

    public MyThread(int i){
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}
