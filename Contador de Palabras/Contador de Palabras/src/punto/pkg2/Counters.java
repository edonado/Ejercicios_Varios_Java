/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 *
 * @author edgar
 */
public class Counters {
    
    int words_counter(FileReader File) throws IOException{
        int c_words = 0;
        StreamTokenizer f = new StreamTokenizer(File);
        while(f.nextToken() != StreamTokenizer.TT_EOF){
            if(f.ttype == StreamTokenizer.TT_WORD){
                c_words++;
            }
        }
        return(c_words);
    }
    
    int letters_counter(BufferedReader Text) throws IOException{
        
        int Char = Text.read();
        int c_letters = 0;
        while(Char !=  -1){
            if((Char >= 97 && Char <= 122)||(Char >= 65 && Char <= 90)){
                c_letters++;
            }
            Char = Text.read();
    }
        return(c_letters);
    }
    
    
    int empty_lines_counter(BufferedReader Text) throws IOException{
        
        int c_lines = 0;
        String A =Text.readLine();
        while (A != null) {            
            if(A.trim().length() == 0){
                c_lines++;
            }
            A = Text.readLine();
        }   
        return(c_lines);
    }
}
