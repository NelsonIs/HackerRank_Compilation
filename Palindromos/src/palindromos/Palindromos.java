package palindromos;

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        /* Objetos */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su Palabra o Frase para saber si es Palindromo o no");
        String userWord = input.nextLine();
        StringBuilder strb = new StringBuilder(userWord);
        String reverseWord = strb.reverse().toString();
        
        if(userWord.toUpperCase().equals(reverseWord.toUpperCase())){
            System.out.println(userWord + " Si es un Palindromo");
            System.out.println(userWord + "\n" + reverseWord);
        }
        else{
            System.out.println(userWord + " No es un Palindromo");
            System.out.println(userWord + "\n" + reverseWord);
        }
        
        System.out.println("\n\n");
    }
}
