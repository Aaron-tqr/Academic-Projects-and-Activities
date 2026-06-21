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
public class Number8 {
    public static void main(String[] args) {
        
        String input = " ";
        int I=0, P=5000, C=1000,X=0, N=0, M=0, AT=0;
        
        input = JOptionPane.showInputDialog("Total Income: ");
        I = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Number of Children: ");
        M = Integer.parseInt(input);
        
        N = I - P - (M * C);
        X = N/3;
        AT = I-X;
        String msg = "Income: " + I +
                     "\nTaxable: "+ N +
                     "\nTax: "+ X +
                     "\nAfter Tax: "+ AT;
        JOptionPane.showMessageDialog(null, msg);
}
}