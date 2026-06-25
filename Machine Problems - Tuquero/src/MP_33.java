import javax.swing.JOptionPane;

public class MP_33 {
    public static void main(String[] args) {

        String input = " ";
        String room = " ", re = " ", pay = " ";
        int code = 0;
        double rate = 0, meal = 0, amount = 0, total = 0;

        room = JOptionPane.showInputDialog("Enter Room Type (A/B/C): ");

        input = JOptionPane.showInputDialog("Enter Code of Payment (1/2): ");
        code = Integer.parseInt(input);

        switch (room) {
            case "A":
                re = "Standard";
                rate = 5000;
                meal = 1500;
                break;
            case "B":
                re = "De Luxe";
                rate = 15000;
                meal = 2000;
                break;
            case "C":
                re = "Suite";
                rate = 20000;
                meal = 3000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Room Type");
                return;
        }

        amount = rate + meal;
        switch (code) {
            case 1:
                pay = "Cash";
                total = (0.02 * amount) - amount;
                break;
            case 2:
                pay = "Credit Card";
                total = (0.05 * amount) + amount;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Code");
                return;
        }

        String msg = ("Room Type: " + room + "\nRoom is: " + re + "\nCode of Payment: " + code + " (" + pay + ")\n" +
                      "\nAmount: " + String.format("%.2f", total));

        JOptionPane.showMessageDialog(null, msg);
    }
}

