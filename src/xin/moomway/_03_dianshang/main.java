package xin.moomway._03_dianshang;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-04
 * Time: 上午10:20
 * github.com/moonway0127
 */
public class main {
    public static void main(String[] args){

        Laptop product1 = new Laptop(0001,"laptop","product1",BigDecimal.valueOf(5999),64,"AMD",999,888);

        System.out.println(product1.getNumber());
        System.out.println(product1.getCategory());
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.getMemory());
        System.out.println(product1.getProcessorName());
        System.out.println(product1.getThickness());
        System.out.println(product1.getWeight());


    }
}
