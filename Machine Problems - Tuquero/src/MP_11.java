import javax.swing.JOptionPane;
public class MP_11 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        double income = 0, tax = 0;
        
        input = JOptionPane.showInputDialog("Enter the Income: ");
        income = Double.parseDouble(input);
         
        if (income <= 5000) {

            String msg = "The tax rate is: 0";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (income <= 10000) {
            
            tax = 100 + (0.03 * income);
            String msg = "The tax rate is: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (income <= 25000) {

            tax = 200 + (0.06 * income);
            String msg = "The tax rate is: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (income <= 50000) {
            
                tax = 300 + (0.09 * income);
                String msg = "The tax rate is: " + String.format("%.2f",tax);
                JOptionPane.showMessageDialog(null, msg);
        }
        else {

            tax = 500 + (0.15 * income);
            String msg = "The tax rate is: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
