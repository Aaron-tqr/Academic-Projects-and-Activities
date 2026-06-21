import javax.swing.JOptionPane;
public class MP_24 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int speed = 0;

        input = JOptionPane.showInputDialog("Enter Wind Speed: ");
        speed = Integer.parseInt(input);

        if (speed < 25) {
            
            String msg = "Not a strong wind";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (speed <= 38) {
            
            String msg = "Strong wind";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (speed <= 54) {
            
            String msg = "Gale";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (speed <= 72) {
            
            String msg = "Whole Gale";
            JOptionPane.showMessageDialog(null, msg);
        }
        else    
        {
            String msg = "Hurricane";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}

