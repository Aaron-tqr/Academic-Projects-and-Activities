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
public class Number7 {
    public static void main(String[] args) {
        
        String input = " ";
        int change=0, half=0, quarters=0, dime=0, nickels=0, penis=0;
        
        input = JOptionPane.showInputDialog("Enter Change in cents:");
        change = Integer.parseInt(input);
        
        half = change/50;
        change %=50;
        
        quarters = change/25;
        change %=25;
        
        dime = change/10;
        change %=10;
        
        nickels = change/5;
        change %=5;
        
        penis = change/1;
        change %=1;;
        
        
        String msg = "The Change you entered is: " + change +
                     "\nThe Number of half dollars to be returned are: "+ half +
                     "\nThe Number of quarters to be returned are: "+ quarters +
                     "\nThe Number of dimes to be returned are: "+ dime +
                     "\nThe Number of nickels to be returned are: "+ nickels +
                     "\nThe Number of pennies to be returned are: "+ penis;
        JOptionPane.showMessageDialog(null, msg);
}
}