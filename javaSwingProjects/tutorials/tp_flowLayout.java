import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tp_flowLayout 
{
    public static void main(String[] args) 
    {
        // flow layout places mcomponenets n a row, sized at their preferred size, 
            // if the horizontal space in the container is too small 
            // the flowlayout class uses the next available row 
        
        JFrame frame = new JFrame();
        frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));// leading, trailing, centre
        

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());


        
        
        
        
        // JButton button1= new JButton();
        


    

        // another method to add button or components
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        frame.add(panel);
        frame.setVisible(true);
    }
}
