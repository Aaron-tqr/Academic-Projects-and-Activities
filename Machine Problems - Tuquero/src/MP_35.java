import javax.swing.JOptionPane;
public class MP_35 {
    public static void main(String[] args) throws Exception {

        String rps1 = " ", rps2 = " ";
        
        rps1 = JOptionPane.showInputDialog("Player 1 Enter your choice: ");
        rps2 = JOptionPane.showInputDialog("Player 2 Enter your choice: ");
        
        if (rps1.equalsIgnoreCase("P") && rps2.equalsIgnoreCase("R")) {

            String msg = "Player 1 Wins! PAPER COVERS ROCK";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (rps1.equalsIgnoreCase("R") && rps2.equalsIgnoreCase("S")) {

            String msg = "Player 1 Wins! ROCK BREAKS SCISSOR";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (rps1.equalsIgnoreCase("S") && rps2.equalsIgnoreCase("P")) {

            String msg = "Player 1 Wins! SCISSOR CUTS PAPER";
            JOptionPane.showMessageDialog(null, msg);
        } 
        else if (rps1.equalsIgnoreCase("R") && rps2.equalsIgnoreCase("P")) {

            String msg = "Player 2 Wins! PAPER COVERS ROCK";
            JOptionPane.showMessageDialog(null, msg);
            
        }
        else if (rps1.equalsIgnoreCase("S") && rps2.equalsIgnoreCase("R")) {

            String msg = "Player 2 Wins! ROCK BREAKS SCISSOR";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (rps1.equalsIgnoreCase("P") && rps2.equalsIgnoreCase("S")) {

            String msg = "Player 2 Wins! SCISSOR CUTS PAPER";
            JOptionPane.showMessageDialog(null, msg);
        } 
        else if (rps1.equalsIgnoreCase(rps2)) {

            String msg = "It's A Draw! NOBODY WINS";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {

            String msg = "ERROR INPUT";
            JOptionPane.showMessageDialog(null, msg);
       }
}
}
