package xin.moomway._03_dianshang;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-04
 * Time: 上午10:12
 * github.com/moonway0127
 */
public class Laptop extends Computer {
    private float thickness;
    private float weight;

    public Laptop() {
    }

    public Laptop(int number, String category, String name, BigDecimal price, float memory, String processorName, float thickness, float weight) {
        super(number, category, name, price, memory, processorName);
        this.thickness = thickness;
        this.weight = weight;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
