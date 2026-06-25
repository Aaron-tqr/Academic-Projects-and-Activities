import javax.swing.JOptionPane;
public class MP_7 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int hoursworked = 0, rph = 0;
        double gpay = 0, otpay = 0;
        
        input = JOptionPane.showInputDialog("Enter the hours worked: ");
        hoursworked = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the rate per hour: ");
        rph = Integer.parseInt(input);

        if (hoursworked <= 40) {

            gpay = hoursworked * rph;
            String msg = "Gross pay = " + String.format("%.2f",gpay);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {
            
            gpay = 40 * rph;
            otpay = (hoursworked - 40) * 1.5 * rph;
            String msg = "Gross pay: " + String.format("%.2f",gpay) +  " , Overtime pay: " + String.format("%.2f",otpay);
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
