import javax.swing.JOptionPane;
public class MP_2 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int age = 0, wait = 0;
        
        input = JOptionPane.showInputDialog("Enter your age: ");
        age = Integer.parseInt(input);
         
        if (age >= 18) {

            String msg = "You are old enough to drive";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {
            
            wait = 18 - age;
            String msg = "You are not old enough to drive, please wait " + wait +  " more years to be able to drive";
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
