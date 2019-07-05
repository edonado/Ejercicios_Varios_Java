/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg3;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

/**
 *
 * @author edgar
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Program to code a 4 digits number.");
        String a = (JOptionPane.showInputDialog("Number = "));
        IsANumber S = new IsANumber();
        while(a.length() != 4 || S.check(a) == 0){
            if(S.check(a) == 0){
                JOptionPane.showMessageDialog(null, "The input argument is not a number. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "The number must to have only 4 digits and to be positive. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
            }
            a = (JOptionPane.showInputDialog("Number = "));
        }
        Code codedNumber = new Code();
        String[] sum = codedNumber.sum_7(a);
        int sumMod = codedNumber.remainder(sum);
        String finalNumber = codedNumber.change_position(sum);
        JOptionPane.showMessageDialog(null, "The coded number is = " + finalNumber, "Coded Number", PLAIN_MESSAGE);
        System.out.println("The requested remainder is = " + sumMod);
    
    }
    
}
