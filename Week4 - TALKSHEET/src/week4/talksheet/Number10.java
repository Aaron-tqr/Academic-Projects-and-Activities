/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.talksheet;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPLAB
 */
public class Number10  {
    public static void main(String[] args) {
        
        String input = " ";
        double t=0, P=0;
        input = JOptionPane.showInputDialog("Enter the number of days after the colonization of the hive: ");
        t = Double.parseDouble(input);
         
        P = (100 * Math.sqrt(t) + 201.0 / (t + 1) + 1);
        
        String msg = String.format("%.0f",t)+ " "+ String.format("%.0f",P);
        JOptionPane.showMessageDialog(null, msg);
}
} 
