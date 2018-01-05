package xin.moomway._06_wenbentongji;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-05
 * Time: 上午8:23
 * github.com/moonway0127
 */
public class main {
    public static final String fileName ="/home/moonway/文档/test";

public static void main (String args[]){
        int i = 0;
    try {
       BufferedReader in = new BufferedReader(new FileReader(fileName));
        int result = in.read();

        while (result != -1) {
            char c = (char) result;
            System.out.println(c);
            i+=1;
            result = in.read();
        }
        in.close();
    } catch (Exception e) {
        System.out.println(e);
    }

    System.out.println(i);

}


}
