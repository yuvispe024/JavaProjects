import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;





public class tp_framesClass extends JFrame implements ActionListener 
// action listener is for button 
{
    JButton button;



    tp_framesClass()
    {
        ImageIcon image2 = new ImageIcon("pointinghand.jpg");


        button = new JButton();
        button.setBounds(200,100,100,50);


        button.addActionListener(e -> System.out.println("poo"));
        //this is an advanced method
        // button.addActionListener(this);
        /* 
        this is done by implementing action listener to the class 
        but can be done without this using lambda expression 
         */
        button.setText("Iam a button");
        button.setFocusable(false);
        button.setIcon(image2);
        // button.setHorizontalTextPosition(JButton.CENTER);
        // button.setHorizontalTextPosition(JButton.BOTTOM);
        /*
         * add button.foreground
         * button.background
         * button.setborder(border fatory . create----------------)
         * button.setenabled
         * to make tis button clickable only one use button.setenabled at actionperformed 
         * to show something:
         * add new label and at actionperformed use setvisible
         */


        JFrame frame= new JFrame();// create a frame
        frame.setSize(500,500);//sets the dimension(x and y dimension)
        // frame.setTitle("tp frame");//sets the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits on closing, if not used the window is hidden not closed
        //instead of exit we can use do nothing or hide also 
        frame.setResizable(true);// prevent frame from resizing 
        frame.setLayout(null);
        

        









        ImageIcon image= new ImageIcon("tp_logo.png");// create an image icon 
        frame.setIconImage(image.getImage());// change icon of frame 
        // frame.getContentPane().setBackground(Color.green);//change color of background
        // frame.getContentPane().setBackground(new Color(218, 247, 166 ));// giving color from user side  
        frame.getContentPane().setBackground(new Color(0xDAF7A6));// giving color from user side 
        frame.add(button);
        // this.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {

        if(e.getSource()==button)
        {
            System.out.println("poo");

        }
        // TODO Auto-generated method stub





        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
