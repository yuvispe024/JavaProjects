import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

public class tp_panel 
{
    public static void main(String[] args) 
    {
        // JPanel is a GUI component acting as container to hold other components 
        // first create panels and then add labels to it

        
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        ImageIcon icon = new ImageIcon("thumbsupicon.jpg");

        JLabel label = new JLabel();
        label.setText("HI");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        // if using border layout manager then only we will be getting setverticalalignment and sethorizontalalignment
        label.setBounds(0,0,75,75);
        redpanel.setLayout(new BorderLayout());// by default it is vertically centre and horizontally leftmost






        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250,250,250,250);
        bluepanel.setLayout(null);// if it is set null we can give label the bounds 

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);







        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        redpanel.add(label);
        bluepanel.add(label);
        greenpanel.add(label);

        
    }
    
}
