import javax.swing.JOptionPane;

public class MP_26 {
    public static void main(String[] args) throws Exception {

        String letter = " ";
        
        letter = JOptionPane.showInputDialog("Enter a Letter: ");
         
        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E") ||
            letter.equalsIgnoreCase("I") || letter.equalsIgnoreCase("O") ||
            letter.equalsIgnoreCase("U")) {

            String msg = "The Letter '" + letter + "' is a Vowel";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else {

            String msg = "The Letter '" + letter + "' is a Consonant";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}

