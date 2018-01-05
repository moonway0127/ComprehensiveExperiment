package xin.moomway._03_dianshang;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-04
 * Time: 上午9:56
 * github.com/moonway0127
 */
public abstract class Product {
    private int number;
    private String category;
    private String name;
    private BigDecimal price;

    public Product() {
    }

    public Product(int number, String category, String name, BigDecimal price) {
        this.number = number;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
