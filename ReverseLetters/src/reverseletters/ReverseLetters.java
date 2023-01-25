package reverseletters;

import java.util.ArrayList;

public class ReverseLetters {
    public static void main(String[] args) {
        ArrayList Lista = new ArrayList();
        String Cadena = "Inserte Cadena deseada", Aux = "";
        
        for(int i = 0;i<Cadena.length();i++){
            if(String.valueOf(Cadena.charAt(i)).equals(" ")){
                Lista.add(Aux);
                Aux = "";
            }
            else{
                Aux += String.valueOf(Cadena.charAt(i));
            }
        }
        Lista.add(Aux);
        
        System.out.println(Cadena);
        for(int i = 0;i<Lista.size();i++){
            StringBuilder strb = new StringBuilder(String.valueOf(Lista.get(i)));
            System.out.print(strb.reverse().toString() + " ");
        }
        
    }
}
