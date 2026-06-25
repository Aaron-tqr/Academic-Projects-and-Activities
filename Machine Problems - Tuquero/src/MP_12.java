import javax.swing.JOptionPane;
public class MP_12 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int choice = 0;
        double result = 0, fnum = 0, snum = 0;

        input = JOptionPane.showInputDialog("1. ADD TWO NUMBERS \n" +
                                            "2. SUBTRACT TWO NUMBERS \n" +
                                            "3. MULTIPLY TWO NUMBERS \n" +
                                            "4. DIVIDE TWO NUMBERS \n" +
                                            "5. EXIT \n" +
                                            "\nENTER YOUR CHOICE:");
        choice = Integer.parseInt(input);

        if (choice == 1) {

            input = JOptionPane.showInputDialog("Enter the first number: ");
            fnum = Double.parseDouble(input);

            input = JOptionPane.showInputDialog("Enter the second number: ");
            snum = Double.parseDouble(input);

            result = fnum + snum;
            String msg = "The sum is: " + String.format("%.0f",result);
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (choice == 2) {
            
            input = JOptionPane.showInputDialog("Enter the first number: ");
            fnum = Double.parseDouble(input);

            input = JOptionPane.showInputDialog("Enter the second number: ");
            snum = Double.parseDouble(input);

            result = fnum - snum;
            String msg = "The difference is: " + String.format("%.0f",result);
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (choice == 3) {

            input = JOptionPane.showInputDialog("Enter the first number: ");
            fnum = Double.parseDouble(input);

            input = JOptionPane.showInputDialog("Enter the second number: ");
            snum = Double.parseDouble(input);

            result = fnum * snum;
            String msg = "The product is: " + String.format("%.0f",result);
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (choice == 4) {

            input = JOptionPane.showInputDialog("Enter the first number: ");
            fnum = Double.parseDouble(input);

            input = JOptionPane.showInputDialog("Enter the second number: ");
            snum = Double.parseDouble(input);

            result = fnum / snum;
            String msg = "The quotient is: " + String.format("%.2f",result);
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (choice == 5) {

            JOptionPane.showMessageDialog(null, "Exiting the program.");
            System.exit(0);
        }
    }
}
