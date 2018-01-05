package xin.moomway._08_canshu;

import com.oracle.tools.packager.Log;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-05
 * Time: 上午8:56
 * github.com/moonway0127
 */
public class ThreadTools implements Runnable {
    public static final int SMALLER = -1;
    public static final int LARGER = 1;
    public static final int SUCCESS = 200;
    public static final int MIN =1;
    public static final int MAX =100;

    int min =1,max = 100;
     int count =1;

   public int realNumber, guessNumber, flag;
     Thread give, guess,notify;
     boolean giveWaitFlag = false;
     boolean guessWaitFlag = false;


    private static ThreadTools single = null;
    public static ThreadTools getInstance () {
        if (single == null) {
            single = new ThreadTools();
        }
        return single;
    }


    ThreadTools() {

        give = new Thread(new giveThread());
        guess = new Thread(new guessThread());
        notify = new Thread(this);
        notify.start();
    }



    public void run() {
        System.out.println(Thread.currentThread().toString()+count);
        while (true){
//            if (Thread.currentThread() == give) {
//                if (count == 1) {
//                    realNumber = (int) (Math.random() * 100) + 1;
//                    System.out.println("随机给你一个数为" + realNumber + ",猜猜是多少");
//                } else {
//                    if (realNumber > guessNumber) {
//                        flag = SMALLER;
//                        System.out.println("你猜小了");
//                    } else if (realNumber < guessNumber) {
//                        flag = LARGER;
//                        System.out.println("你猜大了");
//                    } else {
//                        flag = SUCCESS;
//                        System.out.println("恭喜,你猜对了");
//                        return;
//                    }
//                }
//
//                giveWaitFlag = true;
//
//            }
//            if (Thread.currentThread() == guess) {
//                String demo = "我第" + count + "次猜这个数:";
//                if (count == 1) {
//                    System.out.println(demo+ (guessNumber = (new Random().nextInt(100)+1)));
//                } else {
//                    if (flag == SMALLER) {
//                        System.out.println(demo
//                                + random(max,(min = guessNumber)));
//                    } else if (flag == LARGER) {
//                        System.out.println(demo
//                                + random((max = guessNumber),min));
//                    } else if (flag == SUCCESS) {
//                        System.out.println("我特么就是天才!!");
//                        return;
//                    }
//                }
//                guessWaitFlag = true;
//
//            }

            if(Thread.currentThread() == notify){
                if(count ==1){
                    give.start();
                }else {
                    try {
                        if(giveWaitFlag){
                            give.wait();
                            guess.start();
                            guessWaitFlag = false;
                        }else if(guessWaitFlag){
                            guess.wait();
                            give.start();
                            giveWaitFlag = false;
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            count++;
        }

    }



    public static int random(int start,int end){
       return  (int)(Math.random()*(end-start+1)+start);
    }


}

