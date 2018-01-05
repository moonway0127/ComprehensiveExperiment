package xin.moomway._04_hr;

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
 * Time: 上午10:34
 * github.com/moonway0127
 */
public class main {


    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        JFrame frame = new JFrame("HR");
        frame.setSize(350, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, users);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel, ArrayList<User> users) {


        panel.setLayout(null);

        JLabel userId = new JLabel("id:");
        userId.setBounds(10, 20, 80, 25);
        panel.add(userId);
        JTextField userIdText = new JTextField(20);
        userIdText.setBounds(100, 20, 165, 25);
        panel.add(userIdText);


        JLabel userName = new JLabel("name:");
        userName.setBounds(10, 50, 80, 25);
        panel.add(userName);
        JTextField userNameText = new JTextField(20);
        userNameText.setBounds(100, 50, 165, 25);
        panel.add(userNameText);


        JLabel userSex = new JLabel("sex:");
        userSex.setBounds(10, 80, 80, 25);
        panel.add(userSex);
        JRadioButton sexBoy = new JRadioButton("男");
        JRadioButton sexGirl = new JRadioButton("女");
        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(sexBoy);
        sexGroup.add(sexGirl);
        sexBoy.setBounds(100, 80, 50, 25);
        sexGirl.setBounds(150, 80, 50, 25);
        panel.add(sexBoy);
        panel.add(sexGirl);


        JLabel userBri = new JLabel("brithday:");
        userBri.setBounds(10, 110, 80, 25);
        panel.add(userBri);
        JTextField userBriText = new JTextField(20);
        userBriText.setBounds(100, 110, 165, 25);
        panel.add(userBriText);


        JLabel userAddress = new JLabel("address:");
        userAddress.setBounds(10, 140, 80, 25);
        panel.add(userAddress);
        JTextField userAddressText = new JTextField(20);
        userAddressText.setBounds(100, 140, 165, 25);
        panel.add(userAddressText);

        JLabel userDepartment = new JLabel("department:");
        userDepartment.setBounds(10, 170, 80, 25);
        panel.add(userDepartment);
        JTextField userDepartmentText = new JTextField(20);
        userDepartmentText.setBounds(100, 170, 165, 25);
        panel.add(userDepartmentText);

        JButton submitButton = new JButton("submit");
        submitButton.setBounds(10, 220, 80, 25);
        panel.add(submitButton);


        JLabel selectId = new JLabel("userId:");
        selectId.setBounds(10, 270, 80, 25);
        panel.add(selectId);
        JTextField selectIdText = new JTextField(20);
        selectIdText.setBounds(80, 270, 140, 25);
        panel.add(selectIdText);

        JButton selectButton = new JButton("select");
        selectButton.setBounds(250, 270, 80, 25);
        panel.add(selectButton);


        JTextArea all = new JTextArea();
        all.setBounds(10, 300, 320, 260);
        Font font = new Font(Font.MONOSPACED,0,16);
        all.setFont(font);
        panel.add(all);

        //添加用户
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (sexGroup.getSelection()!=null&&!userIdText.getText().isEmpty() && !userNameText.getText().isEmpty() && !userBriText.getText().isEmpty() && !userAddressText.getText().isEmpty() && !userDepartmentText.getText().isEmpty()) {
                    int flag = JOptionPane.showConfirmDialog(null, "是否要添加此条记录？", "确认信息", JOptionPane.YES_NO_OPTION);
                    if (flag == 0) {
                        //yes
                        boolean reuseFlag = false;

                        //TODO 若时间充足改为线程执行
                        for(int i=0;i<users.size();i++){
                            if(users.get(i).getId().equals(userIdText.getText().toString())){
                                //重复
                                reuseFlag = true;
                                break;
                            }
                        }
                        if(!reuseFlag){
                            //没有重复执行
                            users.add(new User(userIdText.getText().toString(),
                                    userNameText.getText().toString(),
                                    sexGroup.getSelection()==sexBoy.getModel()?sexBoy.getText().toString():sexGirl.getText().toString(),
                                    userBriText.getText().toString(),
                                    userAddressText.getText().toString(),
                                    userDepartmentText.getText().toString()));

                            userIdText.setText("");
                            userNameText.setText("");
                            userBriText.setText("");
                            userAddressText.setText("");
                            userDepartmentText.setText("");
                            sexGroup.clearSelection();
                        }else {
                            //重复
                            JOptionPane.showMessageDialog(null, "id已被占用", "警告", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        //no
                    }
                } else {
                    //内容填写错误
                    JOptionPane.showMessageDialog(null, "请正确输入内容", "警告", JOptionPane.ERROR_MESSAGE);
                }


            }
        });

        //查询用户
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag = false;
               for(int i=0;i<users.size();i++){
                   if(users.get(i).getId().equals(selectIdText.getText().toString())){
                       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                       all.setText("selectTime:"+ df.format(new Date())+"\n"
                               +"id:"+users.get(i).getId()+"\n"
                               +"name:"+users.get(i).getName()+"\n"
                               +"sex:"+users.get(i).getSex()+"\n"
                               +"brithday:"+users.get(i).getBrithday()+"\n"
                               +"address:"+users.get(i).getAddress()+"\n"
                               +"department:"+users.get(i).getDepartment()+"\n"

                       );
                       flag = true;
                       break;
                   }
               }
               if(!flag){
                   all.setText("未找到此用户");
               }

            }
        });

    }


}
