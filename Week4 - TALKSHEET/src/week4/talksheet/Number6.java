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
public class Number6 {
    public static void main(String[] args) {
        
        String input = " ";
        double ga=0, fedTax=0, sTax=0, SST=0, mTax=0, PP=0, HI=0, NP=0;
        
        input = JOptionPane.showInputDialog("Enter the Gross amount:");
        ga = Double.parseDouble(input);
        
        fedTax = ga*0.15;
        sTax = ga*0.035;
        SST = ga*0.0575;
        mTax = ga*0.0275;
        PP = ga*0.05;
        HI = 75.00;
        NP = ga - (fedTax+sTax+SST+mTax+PP+HI);
        
        String msg = "Federal tax: "+ fedTax + "\nState Tax: "+ sTax +"\nSocial Security Tax: "+ SST +"\nMedical Care Tax: "+ mTax +
                     "\nPension Plan: "+ PP + "\nHealth Insurance: "+ HI +"\nNet Pay: "+NP;
        JOptionPane.showMessageDialog(null, msg);
}
}
