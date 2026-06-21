import javax.swing.JOptionPane;

public class MP_30 {
    public static void main(String[] args) {

        String input = " ";
        String category = " ";
        int age = 0;

        input = JOptionPane.showInputDialog("Enter Age: ");
        age = Integer.parseInt(input);

        switch (age) {
            case 60:
            case 59:
            case 58:
            case 57:
            case 56:
            case 55:
            case 54:
            case 53:
            case 52:
            case 51:
            case 50:
                category = "Adults";
                break;
            case 40:
            case 39:
            case 38:
            case 37:
            case 36:
            case 35:
            case 34:
            case 33:
            case 32:
            case 31:
            case 30:
                category = "Youth";
                break;
            case 19:
            case 18:
            case 17:
            case 16:
            case 15:
            case 14:
            case 13:
            case 12:
            case 11:
            case 10:
                category = "Teenage";
                break;
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                category = "Kids";
                break;
            default:
                JOptionPane.showMessageDialog(null, "The Age " + age + " is equivalent to Senior Citizen");
                return;
        }

        String msg = "The Age " + age + " is equivalent to " + category;
        JOptionPane.showMessageDialog(null, msg);
    }
}
