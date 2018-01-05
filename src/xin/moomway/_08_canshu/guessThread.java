package xin.moomway._08_canshu;

import java.util.Random;

import static xin.moomway._08_canshu.ThreadTools.LARGER;
import static xin.moomway._08_canshu.ThreadTools.SMALLER;
import static xin.moomway._08_canshu.ThreadTools.SUCCESS;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-05
 * Time: 上午11:04
 * github.com/moonway0127
 */
public class guessThread implements Runnable{
int count = 1;


    @Override
    public void run() {
        while (true) {
            String demo = "我第" + count + "次猜这个数:";
            if (count == 1) {
                System.out.println(demo + (ThreadTools.getInstance().guessNumber = (new Random().nextInt(100) + 1)));
            } else {
                if (ThreadTools.getInstance().flag == SMALLER) {
                    System.out.println(demo
                            + ThreadTools.random(ThreadTools.getInstance().max, (ThreadTools.getInstance().min = ThreadTools.getInstance().guessNumber)));
                } else if (ThreadTools.getInstance().flag == LARGER) {
                    System.out.println(demo
                            + ThreadTools.random((ThreadTools.getInstance().max = ThreadTools.getInstance().guessNumber), ThreadTools.getInstance().min));
                } else if (ThreadTools.getInstance().flag == SUCCESS) {
                    System.out.println("我特么就是天才!!");
                    return;
                }
            }

            ThreadTools.getInstance().guessWaitFlag = true;
        }

    }
}
