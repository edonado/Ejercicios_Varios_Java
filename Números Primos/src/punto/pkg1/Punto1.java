/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg1;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Karo
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Program to find the prime numbers in a specific integers range.");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Lower Limit = "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Upper Limit = "));
        
        while((a < 0) || (b < 0)){
            JOptionPane.showMessageDialog(null, "Both limits must to be positive values. Please insert a valid range", "LIMITS ERROR", ERROR_MESSAGE);
            a = Integer.parseInt(JOptionPane.showInputDialog("Lower Limit = "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Upper Limit = "));
        }
        
        while(a >= b){
            JOptionPane.showMessageDialog(null, "The lower limit must to be lower then the upper limit. Please insert a valid range", "LIMITS ERROR", ERROR_MESSAGE);
            a = Integer.parseInt(JOptionPane.showInputDialog("Lower Limit = "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Upper Limit = "));
        }
        
        PrimeNumbers P = new PrimeNumbers();
        
        
        System.out.println("Prime numbers between "+a+" and "+b+":");
        int[] R = P.prime(a, b);
        for(int i = 0; i<R.length; i++){
            System.out.println("Prime["+i+"] = "+R[i]);
        };
    }
    
}
