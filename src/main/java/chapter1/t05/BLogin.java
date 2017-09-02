package chapter1.t05;

/**
 * Created by Wanwan on 2017/9/2.
 */
public class BLogin extends Thread{
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b", "bb");
    }
}
