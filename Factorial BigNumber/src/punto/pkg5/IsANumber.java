/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg5;

/**
 *
 * @author edgar
 */
public class IsANumber {
    
    private int result;
    
    int check(String a){
        try{
            Integer.parseInt(a);
            result = 1;
        }catch (NumberFormatException exception){
            result = 0;
        }
        return (result);
    }
    
}
