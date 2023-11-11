import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class EnterMarks  extends JFrame implements ActionListener{
    JLabel j1,j2,j3,j4;
    JButton b1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    EnterMarks(){
        setSize(500,525);
        setLayout(null);
        setLocation(400, 200);


        j1=new JLabel("Enter student marks");
        j1.setBounds(50,0,500,80);
        j1.setFont(new Font("serif",Font.BOLD,30));
        add(j1);

        j2=new JLabel("Enter Roll_no ");
        j2.setBounds(50, 70, 200, 40);
        add(j2);

        t2=new JTextField();
        t2.setBounds(180, 80, 200,20);
        add(t2);


        j3=new JLabel("Enter Subjects");
         j3.setBounds(50, 150, 200, 40);
        add(j3);

        j4=new JLabel("Enter marks");
        j4.setBounds(250,150,200,40);
        add(j4);

        t2 = new JTextField();
        t2.setBounds(50,200,200,20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(50,230,200,20);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(50,260,200,20);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        add(t7);

        t8 = new JTextField();
        t8.setBounds(50,290,200,20);
        add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        add(t9);

        t10 = new JTextField();
        t10.setBounds(50,320,200,20);
        add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        add(t11);

        b1=new JButton("Submit");
        b1.setBounds(50,360,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
       b1.addActionListener(this);
       getContentPane().setBackground(Color.white);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==b1){
                conn c1=new conn();
                String s1="insert into subject values('"+t1.getText()+"','"+t2.getText()+"','"+t4.getText()+"','"+t6.getText()+"','"+t8.getText()+"','"+t10.getText()+"')";
                String s2="insert into marks values('"+t1.getText()+"','"+t2.getText()+"','"+t4.getText()+"','"+t6.getText()+"','"+t8.getText()+"','"+t10.getText()+"')";
                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                JOptionPane.showMessageDialog(null,"marks insert sucessfully");
                this.setVisible(false);

            }
        }
        catch(Exception e){}

    }
    public static void main(String[] args) {
        new EnterMarks().setVisible(true);
    }
    
}
