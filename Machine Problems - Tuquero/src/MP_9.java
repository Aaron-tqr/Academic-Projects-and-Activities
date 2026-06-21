import javax.swing.JOptionPane;
public class MP_9 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        double profit = 0, tax = 0;
        
        input = JOptionPane.showInputDialog("Enter sales expenses for the past year: ");
        profit = Double.parseDouble(input);
         
        if (profit <= 10000) {

            String msg = "Profit: " + String.format("%.2f",profit) + "\nTax: 0";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (profit <= 30000) {
            
            tax = 100 + (0.03 * profit);
            String msg = "Profit: " + String.format("%.2f",profit) + "\nTax: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (profit <= 50000) {

            tax = 200 + (0.05 * profit);
            String msg = "Profit: " + String.format("%.2f",profit) + "\nTax: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
        else {
            
            tax = 300 + (0.07 * profit);
            String msg = "Profit: " + String.format("%.2f",profit) + "\nTax: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
