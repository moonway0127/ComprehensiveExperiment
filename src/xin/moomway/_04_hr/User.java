package xin.moomway._04_hr;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-04
 * Time: 下午1:25
 * github.com/moonway0127
 */
public class User {
    private String id;
    private String name;
    private String sex;
    private String brithday;
    private String address;
    private String department;

    public User() {
    }

    public User(String id, String name, String sex, String brithday, String address, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.brithday = brithday;
        this.address = address;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
