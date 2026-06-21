import javax.swing.JOptionPane;
public class MP_21 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int grade = 0;

        input = JOptionPane.showInputDialog("Enter Grade: ");
        grade = Integer.parseInt(input);

        if (grade >= 98) {

            String msg = ("Class Card Grade Equivalent: 1.00");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (grade >= 95) {

            String msg = ("Class Card Grade Equivalent: 1.25");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (grade >= 92) {

            String msg = ("Class Card Grade Equivalent: 1.50");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (grade >= 89) {

            String msg = ("Class Card Grade Equivalent: 1.75");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 85) {

            String msg = ("Class Card Grade Equivalent: 2.00");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 82) {

            String msg = ("Class Card Grade Equivalent: 2.25");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 80) {

            String msg = ("Class Card Grade Equivalent: 2.50");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 77) {

            String msg = ("Class Card Grade Equivalent: 2.75");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 75) {

            String msg = ("Class Card Grade Equivalent: 3.00");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (grade >= 70) {

            String msg = ("Class Card Grade Equivalent: 4.00");
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = ("Class Card Grade Equivalent: 5.00");
            JOptionPane.showMessageDialog(null, msg);
    }
}
}
