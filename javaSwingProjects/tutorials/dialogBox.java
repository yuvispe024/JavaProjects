import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class dialogBox 
{
    public static void main(String[] args) 
    {
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Your computer has a virus! ", "VirusDetected", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);


        // System.out.println(JOptionPane.showConfirmDialog(null, "Do you even code?? ", "this is my title.", JOptionPane.YES_NO_CANCEL_OPTION));
        // int answer = JOptionPane.showConfirmDialog(null, "Do you even code?? ", "this is my title.", JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(answer);

        // ImageIcon image = new ImageIcon("thumsupicon.jpg");
        // JOptionPane.showInputDialog("what is your name");
        // System.out.println("HEllo);

        // JOptionPane.showOptionDialog(null, "youre awesome", "secret message", JOptionPane.INFORMATION_MESSAGE, 0, image, args, args);

        // we can give our own options but it takes an array 
        String[] responses= {"no", "yes", "maybe"};
        JOptionPane.showOptionDialog(null, "youre awesome", "secret message", JOptionPane.INFORMATION_MESSAGE, 0, null, responses, args);

    }
    
}
