import javax.swing.JOptionPane;
public class MP_6 {
    public static void main(String[] args) throws Exception {

        String input = " ";
        int fnum = 0, snum = 0;
        
        input = JOptionPane.showInputDialog("Enter the first integer: ");
        fnum = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the second integer: ");
        snum = Integer.parseInt(input);

        if (fnum > snum) {

            String msg = "The higher number is: " + fnum;
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (snum > fnum){
            
            String msg = "The higher number is: " + snum;
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
}
