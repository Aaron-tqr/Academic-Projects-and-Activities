import javax.swing.JOptionPane;
public class MP_17 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        float r = 0;
        
        input = JOptionPane.showInputDialog("Enter Richter Number: ");
        r = Float.parseFloat(input);
         
        if (r < 5) {

            String msg = "LITTLE OR NO DAMAGE";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (r <= 5.5) {

            String msg = "SOME DAMAGE";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (r <= 6.5) {
            
            String msg = "SERIOUS DAMAGE";
            JOptionPane.showMessageDialog(null, msg);
        } 
        else if (r <= 7.5) {
            
            String msg = "DISASTER";
            JOptionPane.showMessageDialog(null, msg);
        }
        else
        {

            String msg = "CATASTROPHE";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}

