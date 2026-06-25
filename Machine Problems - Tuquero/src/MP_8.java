import javax.swing.JOptionPane;
public class MP_8 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int speed = 0;
        
        input = JOptionPane.showInputDialog("Enter the speed in kilometer per hour (km/h):");
        speed = Integer.parseInt(input);
         
        if (speed >= 1100) {

            String msg = "It's a civilian aircraft!";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (speed >=500) {
            
            String msg = "It's a military aircraft!";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = "It's a BIRD!";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
