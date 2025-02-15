import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class tp_label 
{
    public static void main(String[] args) 
    {
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("tp_logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);


        label.setText("label here");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//more options include left and right of image icon 
        label.setVerticalTextPosition(JLabel.TOP);//more options include top, bottom and center
        label.setForeground(new Color(0xff0000));//set font color 
        label.setFont(new Font("MV Boli", Font.PLAIN,20));// set font of the text 
        label.setIconTextGap(10);// this will set gap between image and text can use -ve also
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//icon+text
        label.setHorizontalAlignment(JLabel.CENTER);//icon+text
        // label.setBounds(200,200,300,300);//this works with frame.setlayout(null)
        // getting rid of setBounds so to use 
        








        
        frame.setSize(500,500);
        // frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        // frame.setLayout(null);//sets the layout
        frame.pack();
        
    }
}
