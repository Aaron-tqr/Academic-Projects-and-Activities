import javax.swing.JOptionPane;
public class MP_5 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int units = 0, total = 0;
        
        input = JOptionPane.showInputDialog("Enter the unit(s) you are registering: ");
        units = Integer.parseInt(input);
         
        if (units >= 21) {
            
            String msg = "You are a full-time student please pay: 7000";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {
            
            total = units * 300;
            String msg = "Your tuition fee is: " + total;
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
