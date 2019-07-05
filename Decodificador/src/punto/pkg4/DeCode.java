/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg4;

/**
 *
 * @author edgar
 */
public class DeCode extends IsANumber{
    
    String substraction(String a){
        int n;
        String number = ""; 
        for(int i = 0; i<a.length(); i++){
            n = Integer.parseInt(String.valueOf(a.charAt(i)));
            if(n == 1 && i+1 < a.length()){
                n = Integer.parseInt(String.valueOf(a.charAt(i)) + String.valueOf(a.charAt(i + 1)));
                if(n < 17){
                    n = n - 7;
                    number = (number + Integer.toString(n));
                    i = i + 1;
                }else{
                    number = "It is not a valid number. Please run again the software and insert a valid Coded Number.";
                    i = a.length() + 1;
                }
            
            }else{
                if(n < 7 && n != 1){
                    number = "It is not a valid number. Please run again the software and insert a valid Coded Number.";
                    i = a.length() + 1;
                }else{
                    n = n - 7;
                    number = (number + Integer.toString(n));
                }                
            }
        }
        return (number);
    }
    
    
    String exchange(String a){
        String exchangedNumber = (String.valueOf(a.charAt(2)) + String.valueOf(a.charAt(3)) + String.valueOf(a.charAt(0)) + String.valueOf(a.charAt(1)));
        
        return(exchangedNumber);
    }
    
}
