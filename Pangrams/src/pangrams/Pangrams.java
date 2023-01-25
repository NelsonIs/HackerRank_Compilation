package pangrams;

public class Pangrams {

    public static void main(String[] args) {
        String Cadena = "Inserte Cadena a validar";
        
        System.out.println(pangrams(Cadena));
    }
    
    public static String pangrams(String s) {
        String Alphabet = "";
        
        for(int j=0;j<s.length();j++){
            if(!String.valueOf(s.charAt(j)).toUpperCase().equals(" ")){
                if(!Alphabet.contains(String.valueOf(s.charAt(j)).toUpperCase())){
                Alphabet += String.valueOf(s.charAt(j)).toUpperCase();
                }
            }
            
        }
        
        if(Alphabet.length() == 26){
            return "pangram";
        }
        else{
            return "not pangram";
        }
    }
}
