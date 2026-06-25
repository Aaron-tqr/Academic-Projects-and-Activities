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
public class Number3 {
     public static void main(String[] args) {
        
        String input = " ";
        int ndays=0, weeks=0, years=0, days=0;
        
        input = JOptionPane.showInputDialog("Enter No. of Days:");
        ndays = Integer.parseInt(input);
        
        years = ndays/365;
        ndays %=365;
        
        weeks = ndays/7;
        ndays %=7;
        
        days = ndays/1;
        ndays %=1;
        
        String msg = "No. of Years: "+ years + "\nNo. of Weeks: "+ weeks + "\nNo. of Days: "+ days;
        JOptionPane.showMessageDialog(null, msg);
}
}

