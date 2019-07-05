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
public class Factorial {
    
    BigInteger factorial(int a){
        BigInteger factorial = BigInteger.ONE;
        a = Math.abs(a);
        BigInteger  A = BigInteger.valueOf(a);
        BigInteger  B;
        if(a != 1 && a != 0){
            for(int i = 0; i < a; i++){
                B = BigInteger.valueOf(i);
                factorial = factorial.multiply(A.subtract(B));
            }
        }
      
        return(factorial);
    }
    
}
