import javax.swing.JOptionPane;
public class MP_1 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int amount = 0;
        
        input = JOptionPane.showInputDialog("Enter the amount you have collected: ");
        amount = Integer.parseInt(input);
         
        if (amount >= 20000) {

            String msg = "CONGRATULATIONS! You have reached the target amount";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {
            String msg = "SORRY, You have to collect more";
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
