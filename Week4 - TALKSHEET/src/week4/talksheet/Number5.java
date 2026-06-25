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
public class Number5 {
    public static void main(String[] args) {
        
        String input = " ", movie_name = " ";
        double aTicket=0, asold=0, csold=0, cTicket=0, donation=0, grossa=0,ticksold=0,amountd=0,NetSale=0, Sub=0;
        
        movie_name = JOptionPane.showInputDialog("Enter the movie name:");
        
        input = JOptionPane.showInputDialog("Enter the price of an adult ticket:");
        aTicket = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the price of a child ticket:");
        cTicket = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the number of adult tickets sold:");
        asold = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the number of child ticket sold:");
        csold = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the percentage of donation:");
        donation = Double.parseDouble(input);
        
        ticksold = asold+csold;
        grossa = (aTicket*asold) + (cTicket*csold);
        amountd = grossa*(donation/100);
        NetSale = grossa-amountd;
        
        String msg = ""+ movie_name + "\nNumber of ticket sold: "+ ticksold +"\nGross amount: "+ grossa +
                     "\nAmount donated: "+ amountd + "\nNet Sale: "+ NetSale;
        JOptionPane.showMessageDialog(null, msg);
}
}
