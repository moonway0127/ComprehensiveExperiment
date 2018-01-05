package xin.moomway._08_canshu;

import static xin.moomway._08_canshu.ThreadTools.LARGER;
import static xin.moomway._08_canshu.ThreadTools.SMALLER;
import static xin.moomway._08_canshu.ThreadTools.SUCCESS;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-05
 * Time: 上午10:53
 * github.com/moonway0127
 */
public class giveThread implements Runnable{
    int count =1;
    @Override
    public void run() {
        System.out.println("give:"+count);

        while (true){

            if (count == 1) {
                ThreadTools.getInstance().realNumber = (int) (Math.random() * 100) + 1;
                System.out.println("随机给你一个数为" + ThreadTools.getInstance().realNumber + ",猜猜是多少");
            } else {
                if (ThreadTools.getInstance().realNumber > ThreadTools.getInstance().guessNumber) {
                    ThreadTools.getInstance().flag = SMALLER;
                    System.out.println("你猜小了");
                } else if (ThreadTools.getInstance().realNumber < ThreadTools.getInstance().guessNumber) {
                    ThreadTools.getInstance().flag = LARGER;
                    System.out.println("你猜大了");
                } else {
                    ThreadTools.getInstance().flag = SUCCESS;
                    System.out.println("恭喜,你猜对了");
                    return;
                }
            }
            count++;
            ThreadTools.getInstance().giveWaitFlag = true;
        }





    }
}
