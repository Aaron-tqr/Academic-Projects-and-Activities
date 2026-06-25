/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuquero.act1;
import java.io.*;
/**
 *
 * @author CompLab
 */
public class TUQUEROACT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String Name = " ";
        String Course = " ";
        String input = " ";
        int Q1=0,Q2=0,AQ=0,R1=0,R2=0,AR=0,P1=0,P2=0,AP=0,FG=0;
        
        
        try{
            System.out.println("Enter your Name:");
            Name = dataIn.readLine();
            
            System.out.println("Enter your Course");
            Course = dataIn.readLine();
            
            System.out.println("Enter grade for Quiz 1:");
            input = dataIn.readLine();
            Q1 = Integer.parseInt(input);
            
            System.out.println("Enter grade for Quiz 2:");
            input = dataIn.readLine();
            Q2 = Integer.parseInt(input);
            
            AQ = (Q1+Q2)/2;
            System.out.println("The average of Quiz is: "+ AQ);
            
            System.out.println("Enter grade for Recitation 1:");
            input = dataIn.readLine();
            R1 = Integer.parseInt(input);
            
            System.out.println("Enter grade for Recitation 2:");
            input = dataIn.readLine();
            R2 = Integer.parseInt(input);
            AR = (R1+R2)/2;
            System.out.println("The average of Recitation is: "+ AR);
            
            System.out.println("Enter grade for Project 1:");
            input = dataIn.readLine();
            P1 = Integer.parseInt(input);
            
            System.out.println("Enter grade for Project 2:");
            input = dataIn.readLine();
            P2 = Integer.parseInt(input);
            AP = (P1+P2)/2;
            System.out.println("The average of Recitation is: "+ AP);
            
            FG = (AQ+AR+AP)/3;

        }catch(IOException e){
            System.out.println("Error");
        }
        System.out.println("Your name is: "+ Name);
        System.out.println("Your course is: "+ Course);
        System.out.println("Your grade is : "+ FG);
        // TODO code application logic here
        }
    }

