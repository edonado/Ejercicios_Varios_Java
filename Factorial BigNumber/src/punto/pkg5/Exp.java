/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg5;

import java.math.BigInteger;

/**
 *
 * @author edgar
 */
public class Exp {
    
    double exp(int a){
        Factorial f = new Factorial();
        double e = 1;
        double F;
        for(int i = 1; i <= a; i++){
            F = f.factorial(i).doubleValue();
            e = e + (1 / F);
        }
        return(e);
    }
    double exp(int a, int b){
        Factorial f = new Factorial();
        double e = 1;
        double F;
        for(int i = 1; i <= a; i++){
            F = f.factorial(i).doubleValue();
            e = e + (Math.pow(b, i) / F);
        }
        return(e);
    }
    
}
