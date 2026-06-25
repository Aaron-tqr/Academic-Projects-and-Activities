import javax.swing.JOptionPane;
public class MP_19 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int mode = 0;
        double tf = 0, total = 0;

        input = JOptionPane.showInputDialog("Enter Tuition Fee: ");
        tf = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("(Press 1 for Cash, 2 for Two Installment, 3 for Three Installment)" +
                                            "\nEnter Mode of Payment:");
        mode = Integer.parseInt(input);

        if (mode == 1) {

            total = tf - (tf * 0.1);
            String msg = "Your Total Tuition Fee is: " + String.format("%.2f",total);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (mode == 2) {

            total = tf - (tf * 0.05);
            String msg = "Your Total Tuition Fee is: " + String.format("%.2f",total);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (mode == 3) {

            total = tf + (tf * 0.1);
            String msg = "Your Total Tuition Fee is: " + String.format("%.2f",total);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {

            String msg = "INVALID MODE OF PAYMENT";
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}