import javax.swing.JOptionPane;

public class MP_25 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int watts = 0;
        int lumens = 0;

        input = JOptionPane.showInputDialog("Enter the wattage of the light bulb: ");
        watts = Integer.parseInt(input);

        switch (watts) {
            case 15:
                lumens = 125;
                break;
            case 25:
                lumens = 215;
                break;
            case 40:
                lumens = 500;
                break;
            case 60:
                lumens = 880;
                break;
            case 75:
                lumens = 1000;
                break;
            case 100:
                lumens = 1675;
                break;
            default:
                lumens = -1;
                break;
        }

        if (lumens == -1) {
            JOptionPane.showMessageDialog(null, "Invalid wattage. Please enter a valid wattage.");
        } else {
            String msg = "For a " + watts + "-watt light bulb, the expected brightness is " + lumens + " lumens.";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
