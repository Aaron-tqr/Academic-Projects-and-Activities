import javax.swing.JOptionPane;

public class MP_23 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        double gpa = 0;

        input = JOptionPane.showInputDialog("Enter Grade Point Average: ");
        gpa = Double.parseDouble(input);

        if (gpa >= 0.0 && gpa <= 4.0) {

            if (gpa >= 0.0 && gpa <= 0.99) {

                String msg = "GRADE POINT AVERAGE: " + gpa + "\nTranscript Message: Failed semester - registration suspended";
                JOptionPane.showMessageDialog(null, msg);
            } else if (gpa >= 1.0 && gpa <= 1.99) {

                String msg = "GRADE POINT AVERAGE: " + gpa + "\nTranscript Message: On probation for next semester";
                JOptionPane.showMessageDialog(null, msg);
            } else if (gpa >= 2.0 && gpa <= 2.99) {

                String msg = "GRADE POINT AVERAGE: " + gpa + "\nTranscript Message: (no message)";
                JOptionPane.showMessageDialog(null, msg);
            } else if (gpa >= 3.0 && gpa <= 3.49) {

                String msg = "GRADE POINT AVERAGE: " + gpa + "\nTranscript Message: Dean's list for semester";
                JOptionPane.showMessageDialog(null, msg);
            } else if (gpa >= 3.5 && gpa <= 4.0) {

                String msg = "GRADE POINT AVERAGE: " + gpa + "\nTranscript Message: Highest honors for semester";
                JOptionPane.showMessageDialog(null, msg);
            }
        } else {

            String msg = "Invalid GPA. Please enter a GPA within the range 0.0 to 4.0.";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}

