/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.talksheet;
import javax.swing.JOptionPane;
/**
 *
 * @author CcdI-Complab
 */
public class Week4TALKSHEET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input = " ";
        int n1=0,n2=0,n3=0,n4=0,n5=0,sum=0,diff=0,pro=0,quo=0;
        
        input = JOptionPane.showInputDialog("Enter the first number:");
        n1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the second number:");
        n2 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the third number:");
        n3 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the fourth number:");
        n4 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the fifth number:");
        n5 = Integer.parseInt(input);
        
        sum = n1+n2;
        diff = sum - n3;
        pro = diff * n4;
        quo = pro / n5;
        
        String msg = "The sum is: " + sum + "\nThe difference is: " + diff +
                     "\nThe product is: "+ pro + "\nThe quotient is: "+ quo;
        JOptionPane.showMessageDialog(null, msg);
    
    }
}
