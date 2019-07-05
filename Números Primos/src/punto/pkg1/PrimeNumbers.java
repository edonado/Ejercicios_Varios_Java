/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg1;

/**
 *
 * @author karo
 */
public class PrimeNumbers {
    
    int[] prime(int a, int b){
        
        int vect[] = new int[b - a + 1];
        for(int i = 0; i<vect.length; i++){
            vect[i] = a;
            a = a + 1;
        };
        
        int[] primes = new int[0];
        int[] aux = new int[0];
        
        for(int i = 0; i<vect.length; i++){
            int c = 0;
            
            for(int j = 1; j<=vect[i]; j++){
                int m = (vect[i] % j);
                if(m == 0){
                    c = c + 1;
                }
            }
            
            if(c <= 2){
                
               if(primes.length == 0){
                   
                   primes = new int[1]; //Crea Nuevo Vector de Primos
                   primes[0] = vect[i]; //Almacena el elemento en el vector 
                   
               }else{
                   
                   aux = new int[primes.length];
                   for(int j=0; j<aux.length; j++){
                       aux[j] = primes[j];  //Pasa los numeros a Vect.auxiliar
                   }
                   
                   primes = new int[aux.length +1]; //Aumenta el tamño de primos
                   for(int j=0; j<aux.length; j++){
                       primes[j] = aux[j];  //Vuelve a cargar primos
                   }
                   
                   primes[aux.length] = vect[i];    //Agrega el nuevo elemento
                           
                }
               } 
            }
            return (primes);
        }
    
    }
