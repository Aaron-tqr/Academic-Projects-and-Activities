import javax.swing.JOptionPane;
public class MP_3 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        double amount = 0, total = 0;
        
        input = JOptionPane.showInputDialog("Enter the amount purchased: ");
        amount = Double.parseDouble(input);
         
        if (amount >= 5000) {

            total = amount - (amount * 0.03);
            String msg = "Please pay: " + String.format("%.0f",total);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {

            String msg = "Please pay: " + String.format("%.0f",amount);
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
