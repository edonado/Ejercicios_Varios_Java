/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg4;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

/**
 *
 * @author edgar
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Program to decode a number.");
        String a = (JOptionPane.showInputDialog("Coded Number = "));
        
        IsANumber S = new IsANumber();
        while(a.length() > 16 || a.length() < 4 || S.check(a) == 0){
            if(S.check(a) == 0){
                JOptionPane.showMessageDialog(null, "The input argument is not a number. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
            }else{
                if(a.length() < 4){
                    JOptionPane.showMessageDialog(null, "The number must to have minimum 4 digits and to be positive. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "The number must to have maximum 16 digits and to be positive. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
                }
            }      
            a = (JOptionPane.showInputDialog("Number = "));
        }
        
        DeCode N = new DeCode();
        String s = N.substraction(a);
        
        if(N.check(s) == 0){
            JOptionPane.showMessageDialog(null,s, "Decoded Number", ERROR_MESSAGE);
        }else{
            s = N.exchange(s);
            JOptionPane.showMessageDialog(null,"The Decoded Number is = " + s, "Decoded Number", PLAIN_MESSAGE);
        }
    }
        
    
}
