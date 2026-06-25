import javax.swing.JOptionPane;
public class MP_22 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        double grade = 0, sw = 0, quiz = 0, exam = 0, ga = 0;

        input = JOptionPane.showInputDialog("Enter Assignment Grade: ");
        grade = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter Seatwork Grade: ");
        sw = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter Quiz Grade: ");
        quiz = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter Exam Grade: ");
        exam = Double.parseDouble(input);

        ga = (grade * 0.1) + (sw * 0.2) + (quiz * 0.3) + (exam * 0.4);

        if (ga >= 97) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 1.00" + "\nRemarks: Excellent");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (ga >= 94) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 1.25" + "\nRemarks: Excellent");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (ga >= 91) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 1.50" + "\nRemarks: Very Good");
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (ga >= 88) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 1.75" + "\nRemarks: Very Good");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (ga >= 85) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 2.00" + "\nRemarks: Good");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (ga >= 82) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 2.25" + "\nRemarks: Good");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (ga >= 79) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 2.50" + "\nRemarks: Satisfactory");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (ga >= 76) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 2.75" + "\nRemarks: Fair");
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (ga == 75) {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 3.00" + "\nRemarks: Passed");
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = ("Your General Average is: " + ga + "\nEquivalent grade is: 5.00" + "\nRemarks: Failed");
            JOptionPane.showMessageDialog(null, msg);
    }
}
}

