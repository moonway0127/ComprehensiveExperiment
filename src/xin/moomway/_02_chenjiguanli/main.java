package xin.moomway._02_chenjiguanli;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-03
 * Time: 上午9:53
 * github.com/moonway0127
 */
public class main {
    public static final int FLAG_ADD = 1;
    public static final int FLAG_SEQUENCE = 2;
    public static final int ADD_YES = 1;
    public static final int ADD_NO = 2;

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        sinit(students);

        testTools(students);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Sequence 3.quit");
            int flag = scanner.nextInt();
            switch (flag) {
                case FLAG_ADD:
                    add(students);
                    break;
                case FLAG_SEQUENCE:
                    sequence(students);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }


    /***
     * 初始化随机值学生
     * @param students arraylist
     */
    public static void sinit(ArrayList<Student> students) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("姓名" + (i + 1), i + 1,(float)(random.nextInt(100) + new BigDecimal(Math.random()).setScale(1, RoundingMode.HALF_UP).floatValue()));
            students.add(student);
        }

    }


    /***
     * 添加学生
     * @param students arraylist
     */
    public static void add(ArrayList<Student> students) {
        String temp_Name;
        int temp_id;
        float temp_grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("id:");
        temp_id = scanner.nextInt();
        System.out.println("name");
        temp_Name = scanner.next();
        System.out.println("grade");
        temp_grade = scanner.nextFloat();

        System.out.println(temp_id + " " + temp_Name + " " + temp_grade);
        System.out.println("1.yes 2.no");
        int addFlag = scanner.nextInt();

        switch (addFlag) {
            case ADD_YES:
                boolean reuseFlag = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getId() == temp_id) {
                        System.out.println("id reuse");
                        reuseFlag = true;
                        break;
                    }
                }
                if (reuseFlag) {
                    add(students);
                } else {
                    students.add(new Student(temp_Name, temp_id, temp_grade));
                }
                break;
            case ADD_NO:
                add(students);
                break;
            default:
                System.out.println("cancle");
                break;
        }
    }


    /**
     * 排序
     * @param students
     */
    public static void sequence(ArrayList<Student> students) {
        ArrayList<Student> temp_Students = students;
        Student temp_Student ;

        for (int j = 0; j < temp_Students.size() - 1; j++)
            for (int i = 0; i < temp_Students.size() - 1 - j; i++)
            {
                if(temp_Students.get(i).getGrade()<temp_Students.get(i+1).getGrade())
                {
                    temp_Student = students.get(i);
                    temp_Students.set(i,students.get(i+1));
                    temp_Students.set(i+1,temp_Student);
                }
            }


        testTools(temp_Students);
    }


    /**
     * 測試工具
     * @param students
     */
    public static void testTools(ArrayList<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getId() + " " + students.get(i).getName() + " " + students.get(i).getGrade());
        }
    }


}
