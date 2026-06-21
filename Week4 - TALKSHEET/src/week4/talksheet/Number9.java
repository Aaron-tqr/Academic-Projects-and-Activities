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
public class Number9 {
    public static void main(String[] args) {
        
        String input = " ";
        double FO=0, D=0, Fe=0, f=0, P=0;
        input = JOptionPane.showInputDialog("The focal length of an objective: ");
        FO = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("A Diameter: ");
        D = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Focal Length of an Eyepiece: ");
        Fe = Integer.parseInt(input);
        
        f = FO/D;
        P = Fe/f;
        String msg = "The focal ratio of a telescope is " + f +
                     "\nThe size of the image that exists the eyepiece is: "+ String.format("%.2f", P);
        JOptionPane.showMessageDialog(null, msg);
}
}