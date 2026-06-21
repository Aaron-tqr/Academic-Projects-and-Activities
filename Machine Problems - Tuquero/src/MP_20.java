import javax.swing.JOptionPane;
public class MP_20 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int grade = 0;

        input = JOptionPane.showInputDialog("Enter Your Grade: ");
        grade = Integer.parseInt(input);

        if (grade >= 98) {

            String msg = ("The equivalent grade is: 1.00");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (grade >= 95) {

            String msg = ("The equivalent grade is: 1.25");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (grade >= 92) {

            String msg = ("The equivalent grade is: 1.50");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (grade >= 89) {

            String msg = ("The equivalent grade is: 1.75");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 85) {

            String msg = ("The equivalent grade is: 2.00");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 82) {

            String msg = ("The equivalent grade is: 2.25");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 80) {

            String msg = ("The equivalent grade is: 2.50");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 77) {

            String msg = ("The equivalent grade is: 2.75");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 75) {

            String msg = ("The equivalent grade is: 3.00");
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = ("OUT OF RANGE");
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
