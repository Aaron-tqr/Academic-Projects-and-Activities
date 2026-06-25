import javax.swing.JOptionPane;

public class MP_34 {
    public static void main(String[] args) {

        String input = " ";
        int kwh = 0;
        double tBill = 0;

        input = JOptionPane.showInputDialog("Enter number of kilowatt hours: ");
        kwh = Integer.parseInt(input);

        if (kwh <= 99) {

            tBill = kwh * 10.00;
        } else if (kwh <= 249) {

            tBill = 99 * 10.00 + (kwh - 99) * 50.00;
        } else {

            tBill = 99 * 10.00 + (249 - 99) * 50.00 + (kwh - 249) * 100.00;
        }

        String msg = ("Total electric bill is P" + String.format("%.2f", tBill));
        JOptionPane.showMessageDialog(null, msg);
    }
}
