import javax.swing.JOptionPane;
public class MP_4 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int grade = 0, fgrade = 0;
        
        input = JOptionPane.showInputDialog("Enter Grade: ");
        grade = Integer.parseInt(input);
         
        if (grade >= 100) {

            String msg = "The grade final is " + grade;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {
            
            fgrade = grade + 1;
            String msg = "The final grade is " + fgrade;
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
