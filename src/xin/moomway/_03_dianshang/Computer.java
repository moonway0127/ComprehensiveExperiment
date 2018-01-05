package xin.moomway._03_dianshang;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-04
 * Time: 上午10:11
 * github.com/moonway0127
 */
public  class  Computer extends Product{

    private float memory;
    private String processorName;

    public Computer() {
        super();
    }

    public Computer(int number, String category, String name, BigDecimal price, float memory, String processorName) {
        super(number, category, name, price);
        this.memory = memory;
        this.processorName = processorName;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }
}
