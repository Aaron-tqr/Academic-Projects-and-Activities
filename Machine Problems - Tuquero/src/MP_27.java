import javax.swing.JOptionPane;

public class MP_27 {
    public static void main(String[] args) {

        String input = " ";
        int V_Class = 0;
        double rate = 0, addfee = 0, km = 0, total;
        input = JOptionPane.showInputDialog("Enter the vehicle class (1, 2, or 3): ");
        V_Class = Integer.parseInt(input);


        if (V_Class == 1) {

            rate = 41;
            addfee = 20;

        } else if (V_Class == 2) {

            rate = 102;
            addfee = 35;

        } else if (V_Class == 3) {

            rate = 122;
            addfee = 50;

        } else {
        
            JOptionPane.showMessageDialog(null, "Error: Invalid vehicle class. Please enter 1, 2, or 3.");
            return;
        }

        input = JOptionPane.showInputDialog("Enter the distance in kilometers: ");
        km = Double.parseDouble(input);

        total = rate + (km * addfee);

        String msg = String.format("Vehicle Class: " + V_Class + "\nRate: " + rate + "\nAdditional Fee per km: " + addfee + "\nTotal Cost: " + total);

        JOptionPane.showMessageDialog(null, msg);
    }
}
