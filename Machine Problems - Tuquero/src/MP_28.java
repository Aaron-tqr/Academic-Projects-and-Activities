import javax.swing.JOptionPane;

public class MP_28 {
    public static void main(String[] args) {

        String input = " ";
        String scholarship = " ";
        double totalGrade = 0, grade = 0, average = 0, tfd = 0;

        for (int i = 1; i <= 10; i++) {

            input = JOptionPane.showInputDialog("Enter grade for Subject " + i + ": ");
            grade = Double.parseDouble(input);

            if (grade < 0 || grade > 100) {
                JOptionPane.showMessageDialog(null, "Error: Invalid grade. Please enter a valid grade between 0 and 100.");
                return;
            }

            totalGrade += grade;
        }

        average = totalGrade / 10;

        if (average >= 98) {

            scholarship = "President's List";
            tfd = 100;
        } else if (average >= 95) {

            scholarship = "College Scholar";
            tfd = 50;
        } else if (average >= 92) {

            scholarship = "Dean's List";
            tfd = 30;
        } else {

            scholarship = "None";
            tfd = 0;
        }

        String msg = ("Average Grade: " + String.format("%.2f",average) + 
                     "\nScholarship Grant:" + scholarship + "\nTuition Fee Discount: " + tfd + "%");
        JOptionPane.showMessageDialog(null, msg);
    }
}
