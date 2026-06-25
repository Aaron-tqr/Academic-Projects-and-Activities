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
public class Number2 {
    public static void main(String[] args) {
        
        String input = " ";
        int n500=0, n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0, amount=0;
        
        input = JOptionPane.showInputDialog("Input amount:");
        amount = Integer.parseInt(input);
        
        n500 = amount/500;
        amount %=500;
        
        n100 = amount/100;
        amount %=100;
        
        n50 = amount/50;
        amount %=50;
        
        n20 = amount/20;
        amount %=20;
        
        n10 = amount/10;
        amount %=10;
        
        n5 = amount/5;
        amount %=5;
        
        n2 = amount/2;
        amount %=2;
        
        n1 = amount/1;
        amount %=1;
        
        String msg = "500: "+ n500 + "\n100: "+ n100 + "\n50: "+ n50 +
                      "\n20: "+ n20 + "\n10: "+ n10 + "\n5: "+ n5 +"\n2: "+ n2 + "\n1: "+ n1;
        JOptionPane.showMessageDialog(null, msg);
}
}