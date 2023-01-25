/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author nelso
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Alphabet = "", s = "Holaaa coomo andas?";
        
        for(int j=0;j<s.length();j++){
            if(!Alphabet.contains(String.valueOf(s.charAt(j)))){
                Alphabet += String.valueOf(s.charAt(j));
            }
        }
        
        System.out.println(Alphabet);
        
    }
    
}
