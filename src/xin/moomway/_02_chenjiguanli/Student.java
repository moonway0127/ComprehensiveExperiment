package xin.moomway._02_chenjiguanli;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-03
 * Time: 上午9:53
 * github.com/moonway0127
 */
public class Student {

    private String name;
    private int id;
    private float grade;


    public  Student(){

    }


    public  Student(String name,int id,float grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
