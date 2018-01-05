package xin.moomway._01_sushu;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-03
 * Time: 上午9:53
 * github.com/moonway0127
 */

public class main {
    public static void main(String [] args){
        for(int i = 50;i<=100;i++){
            isSushu(i);
        }

    }


     static void isSushu(int temp){
        boolean a = false;
        for(int i=2;i<temp;i++){
            if(temp%i ==0){
                a = true;
                break;
            }
        }
        if(a){

        }else {
            System.out.println(temp);
        }

    }

}
