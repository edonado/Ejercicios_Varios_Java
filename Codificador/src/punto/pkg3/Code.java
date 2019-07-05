/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg3;

/**
 *
 * @author edgar
 */
public class Code {
    
    String[] sum_7(String a){
        int n;
        String[] newNumber = new String[4];
        String N;
        for(int i = 0; i<a.length(); i++){
            n = Integer.parseInt(String.valueOf(a.charAt(i)));
            n = n + 7;
            N = Integer.toString(n);
            newNumber[i] = N;
        }
        return(newNumber);
    }
    
    String change_position(String[] a){
        
        String changedNumber = (a[2] + a[3] + a[0] + a[1]);
      
        return(changedNumber);
    }
    
    int remainder(String[] a){
        
        String n = "";
        for(int i = 0; i<a.length; i++){
            n = (n + a[i]);
        }
        
        int R = (Integer.parseInt(n) % 10);
        return (R);    
    }
    
}
