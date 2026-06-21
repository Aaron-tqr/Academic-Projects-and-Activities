import javax.swing.JOptionPane;
public class MP_15 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int num1 = 0, num2 = 0, num3 = 0, diff = 0;
        
        input = JOptionPane.showInputDialog("Enter the First Number: ");
        num1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Second Number: ");
        num2 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Third Number: ");
        num3 = Integer.parseInt(input);
         
        if (num1 < num2 && num1 < num3 && num2 < num3) {

            diff = num3 - num1;
            String msg = "Difference of the highest number and lowest number: " + diff;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (num1 < num3 && num1 < num2 && num3 < num2) {

            diff = num2 - num1;
            String msg = "Difference of the highest number and lowest number: " + diff;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (num2 < num1 && num2 < num3 && num1 < num3) {

            diff = num3 - num2;
            String msg = "Difference of the highest number and lowest number: " + diff;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (num2 < num3 && num2 < num1 && num3 < num1) {

            diff = num1 - num2;
            String msg = "Difference of the highest number and lowest number: " + diff;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (num3 < num1 && num3 < num2 && num1 < num2) {

            diff = num2 - num3;
            String msg = "Difference of the highest number and lowest number: " + diff;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {

            diff = num1 - num3;
            String msg = "Difference of the highest number and lowest number: " + diff;
            JOptionPane.showMessageDialog(null, msg);
            
        }
    }
}
