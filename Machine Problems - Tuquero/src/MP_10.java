import javax.swing.JOptionPane;
public class MP_10 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        double value = 0, tax = 0;
        
        input = JOptionPane.showInputDialog("Enter the value of the real estate: ");
        value = Double.parseDouble(input);
         
        if (value < 250001.00) {

            tax = value * 0.05;
            String msg = "Real estate tax: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (value <= 500000 ) {
            
            tax = value * 0.1;
            String msg = "Real estate tax: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            tax = value * 0.15;
            String msg = "Real estate tax: " + String.format("%.2f",tax);
            JOptionPane.showMessageDialog(null, msg);
        }
}
}