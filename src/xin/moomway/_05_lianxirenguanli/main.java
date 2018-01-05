package xin.moomway._05_lianxirenguanli;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: moonway
 * Date: 2018-01-04
 * Time: 下午2:42
 * github.com/moonway0127
 */
public class main {

    public static void main(String [] args){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("34567898765432134567","老大"));
        users.add(new User("3456789321345367","老二"));
        users.add(new User("34567898712443134567","老三"));
        JFrame frame = new JFrame("联系人管理");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, users);
        frame.setVisible(true);
    }


    private static void placeComponents(JPanel panel, ArrayList<User> users) {


        panel.setLayout(null);

        JLabel userName = new JLabel("姓名:");
        userName.setBounds(10, 20, 80, 25);
        panel.add(userName);
        JTextField userNameText = new JTextField(20);
        userNameText.setBounds(100, 20, 165, 25);
        panel.add(userNameText);




        JButton submitButton = new JButton("submit");
        submitButton.setBounds(10, 50, 80, 25);
        panel.add(submitButton);





        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag = false;
                for(int i=0;i<users.size();i++){
                    if(users.get(i).getName().equals(userNameText.getText().toString())){
                        JOptionPane.showMessageDialog(null,"name:"+users.get(i).getName()+"\n"+"phone:"+users.get(i).getPhoneNumber(),"查询结果",JOptionPane.INFORMATION_MESSAGE);
                        flag = true;
                        break;
                    }

                }
                if(!flag){
                    JOptionPane.showMessageDialog(null,"查无此人","查询结果",JOptionPane.ERROR_MESSAGE);
                }

            }
        });


    }


}
