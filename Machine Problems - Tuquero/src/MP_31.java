import javax.swing.JOptionPane;

public class MP_31 {
    public static void main(String[] args) {

        int grade;
        String input, equivalent = " ";

        input = JOptionPane.showInputDialog("Enter Grade: ");
        grade = Integer.parseInt(input);

        switch (grade) {
            case 100:
            case 99:
            case 98:
                equivalent = "1.0";
                break;
            case 97:
            case 96:
            case 95:
                equivalent = "1.25";
                break;
            case 94:
            case 93:
            case 92:
                equivalent = "1.5";
                break;
            case 91:
            case 90:
            case 89:
                equivalent = "1.75";
                break;
            case 88:
            case 87:
            case 86:
                equivalent = "2.0";
                break;
            case 85:
            case 84:
            case 83:
                equivalent = "2.25";
                break;
            case 82:
            case 81:
            case 80:
                equivalent = "2.5";
                break;
            case 79:
            case 78:
            case 77:
                equivalent = "2.75";
                break;
            case 76:
            case 75:
                equivalent = "3.0";
                break;
            default:
                equivalent = "5.0";
                break;
        }

        String msg = "The Grade " + grade + " is equivalent to " + equivalent;
        JOptionPane.showMessageDialog(null, msg);
    }
}

