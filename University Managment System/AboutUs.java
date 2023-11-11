import java.awt.*;
import javax.swing.*;
public class AboutUs extends JFrame{
    private JPanel contentPane;
    public static void main(String[] args) {
        new AboutUs().setVisible(true);
    }
    public AboutUs(){
        super("About us- DIT University");
        setBackground(new Color(173,216,230 ));
        setBounds(500,250,700,500);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel l1=new JLabel("New Label");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("D:\\University Managment System/i1.ss.jpg"));
        Image i2= new i1.getImage().getScaledInstance(250,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1=new JLabel(i3);
        l1.setBounds(400,40,250,100);
        contentPane.add(l1);


          JLabel l3=new JLabel("University");
          l3.setForeground(new Color(0, 250,154));
          l3.setFont(new Font("Courier new",Font.BOLD,30));
          l3.setBounds(140,40,200,55);
          contentPane.add(l3);
          
          JLabel l4=new JLabel("Management System");
          l3.setForeground(new Color(127,255,0));
          l4.setFont(new Font("Courier new",Font.BOLD,30));
          l4.setBounds(70,90,405,40);
          contentPane.add(l4);
               
           JLabel l6=new JLabel("Developed by:IT Source Code");
          l4.setFont(new Font("Trebuchet Ms",Font.BOLD,30));
          l4.setBounds(70,198,600,35);
          contentPane.add(l6);

           JLabel l8=new JLabel("Contact:Shubhambachantiwari32@gmail.com");
          l4.setFont(new Font("Trebuchet Ms",Font.BOLD,20));
          l4.setBounds(70,290,600,34);
          contentPane.add(l8);


           JLabel l9=new JLabel("Education:MCA");
          l4.setFont(new Font("Trebuchet Ms",Font.BOLD,20));
          l4.setBounds(70,320,600,34);
          contentPane.add(l9);


           JLabel l10=new JLabel("Phone Number:8090606678");
          l3.setForeground(new Color(47,79,79));
          l4.setFont(new Font("Trebchuet Ms",Font.BOLD| Font.ITALIC,18));
          l4.setBounds(70,400,600,34);
          contentPane.add(l10);

          contentPane.setBackground(Color.WHITE);

        
    }
}