import javax.swing.JOptionPane;
public class MP_16 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int TEMP = 0;
        
        input = JOptionPane.showInputDialog("Enter the Temperature: ");
        TEMP = Integer.parseInt(input);
         
        if (TEMP < 0) {

            String msg = "ICE";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (TEMP <= 100) {

            String msg = "WATER";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = "STEAM";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
