/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg5;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author edgar
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Program to obtain the factorial of a number.");
        String a = (JOptionPane.showInputDialog("Number = "));
        IsANumber S = new IsANumber();
        while(S.check(a) == 0){
            JOptionPane.showMessageDialog(null, "The input argument is not a number. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
            a = (JOptionPane.showInputDialog("Number = "));
        }
        
        String b = (JOptionPane.showInputDialog("X value for calculate e^x = "));
        while(S.check(b) == 0){
            JOptionPane.showMessageDialog(null, "The input argument is not a number. Please insert a valid number.", "INPUT ERROR", ERROR_MESSAGE);
            b = (JOptionPane.showInputDialog("X value for calculate e^x = "));
        }
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        Factorial F = new Factorial();
        Exp e = new Exp();
        double T = Math.E;
        double Z = e.exp(20);
        double X = e.exp(200, B);
        System.out.println("Factorial ("+A+"!) = " + F.factorial(A));
        System.out.println("e(Calculated) = " + T);
        System.out.println("e(Original) =  " + Z);
        System.out.println("e^"+B+" =  " + X);
    }
    
}
