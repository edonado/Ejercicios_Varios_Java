/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.pkg2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class Punto2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileReader Filew = new FileReader("C:/Users/edgar/Desktop/Universidad/Telemática/Proyectos Java/Laboratorio Java/Punto 2/Test_Text.txt");
        FileReader FileL = new FileReader("C:/Users/edgar/Desktop/Universidad/Telemática/Proyectos Java/Laboratorio Java/Punto 2/Test_Text.txt");
        FileReader FileLines = new FileReader("C:/Users/edgar/Desktop/Universidad/Telemática/Proyectos Java/Laboratorio Java/Punto 2/Test_Text.txt");
        BufferedReader Text = new BufferedReader(FileL);
        BufferedReader TextL = new BufferedReader(FileLines);
        Counters C = new Counters();
        int words = C.words_counter(Filew);
        int letters = C.letters_counter(Text);
        int lines = C.empty_lines_counter(TextL);
        System.out.println("Amount of words = " + words);
        System.out.println("Amount of letters = " + letters);
        System.out.println("Amount of Paragraphs = " + lines);
    }
    
}
