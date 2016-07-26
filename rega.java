import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class rega {

    final static JFrame fr = new JFrame("registracija");
    final static JButton b1 = new JButton("register");
    final static JButton b2 = new JButton("clear");
    final static JButton b3 = new JButton("exit");
    final static JTextField tf1 = new JTextField(10);
    final static JTextField tf2 = new JTextField(10);
    final static JTextField tf3 = new JTextField(10);
    final static JLabel l1 = new JLabel("Nick");
    final static JLabel l2 = new JLabel("City");
    final static JLabel l3 = new JLabel("Password");
    public static void main(String args[]){

        fr.setLayout(new FlowLayout());
        fr.setSize(200, 340);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.add(l1);
        fr.add(tf1);
        fr.add(l2);
        fr.add(tf2);
        fr.add(l3);
        fr.add(tf3);
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);


b1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        writerff();

    }
});
b2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
    }
});

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    private static void writerff() {
      try{
FileWriter writer = new FileWriter("1.txt",true);
          writer.write(tf1.getText() +" "+tf2.getText()+" "+tf3.getText() +"\n");
          writer.close();
      }catch(IOException ex){
        ex.printStackTrace();
      }

    }
}
