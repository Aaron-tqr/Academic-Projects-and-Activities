import javax.swing.JOptionPane;
public class MP_18 {
    public static void main(String[] args) throws Exception {

        String classid = " ";
        
        classid = JOptionPane.showInputDialog("Enter the Class ID: ");
         
        if (classid.equalsIgnoreCase("B")) {

            String msg = "SHIP CLASS: Battleship";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (classid.equalsIgnoreCase("C")) {

            String msg = "SHIP CLASS: Cruiser";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (classid.equalsIgnoreCase("D")) {

            String msg = "SHIP CLASS: Destroyer";
            JOptionPane.showMessageDialog(null, msg);
        } 
        else if (classid.equalsIgnoreCase("F")) {

            String msg = "SHIP CLASS: Frigate";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = "ERROR CLASS ID";
            JOptionPane.showMessageDialog(null, msg);
       }
}
}
