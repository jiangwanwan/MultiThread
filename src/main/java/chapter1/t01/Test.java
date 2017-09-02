package chapter1.t01;

/**
 * Created by Wanwan on 2017/9/2.
 */

/**
 * 线程调用的随机性
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();

            for (int i = 0; i < 10; i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
