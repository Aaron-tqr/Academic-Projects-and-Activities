import javax.swing.JOptionPane;

public class MP_29 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        String eq = " ";
        int NOWeek = 0;

        input = JOptionPane.showInputDialog("Enter Day of Week: ");
        NOWeek = Integer.parseInt(input);

        switch (NOWeek) {
            case 1:
                eq = "Monday";
                break;
            case 2:
                eq = "Tuesday";
                break;
            case 3:
                eq = "Wednesday";
                break;
            case 4:
                eq = "Thursday";
                break;
            case 5:
                eq = "Friday";
                break;
            case 6:
                eq = "Saturday";
                break;
            case 7:
                eq = "Sunday";
                break;
            default:
            
            JOptionPane.showMessageDialog(null, "Error: Invalid day of the week. Please enter a value between 1 and 7.");
            return;
        }

            String msg = "The Day " + NOWeek + " of the Week is equivalent to " + eq;
            JOptionPane.showMessageDialog(null, msg);
        
    }
}
