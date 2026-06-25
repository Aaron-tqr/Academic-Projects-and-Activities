import javax.swing.JOptionPane;
public class MP_13 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int num1 = 0, num2 = 0, num3 = 0;
        
        input = JOptionPane.showInputDialog("Enter the First Number: ");
        num1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Second Number: ");
        num2 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Enter the Third Number: ");
        num3 = Integer.parseInt(input);
         
        if (num1 < num2 && num1 < num3) {

            String msg = "The lowest number is: " + num1;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (num2 < num1 && num2 < num3) {

            String msg = "The lowest number is: " + num2;
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = "The lowest number is: " + num3;
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
