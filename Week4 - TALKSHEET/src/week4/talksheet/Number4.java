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
public class Number4 {
    public static void main(String[] args) {
        
        String input = " ", name = " ";
        int rph=0, hw=0, salary=0;
        
        name = JOptionPane.showInputDialog("Enter the name:");
        
        input = JOptionPane.showInputDialog("Enter the rate per hour:");
        rph = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the hours worked:");
        hw = Integer.parseInt(input);
        
        salary = rph*hw;
        
        String msg = " "+ name + ", Your salary is "+ salary;
        JOptionPane.showMessageDialog(null, msg);
}
}

