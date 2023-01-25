package pruebasoracle;

public class PruebasOracle{

    public static void main(String[] args){
        
        System.out.println(getSubstringCount("001100011"));
    }  
    public static int getSubstringCount(String s) {
        int Result = 0;
        
        for(int i = 1;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals("0")){
                if(String.valueOf(s.charAt(i-1)).equals("1")){
                    Result ++;
                }
            }
            else{
                if(String.valueOf(s.charAt(i-1)).equals("1")){
                    Result ++;
                }
            }
        }
        
        return Result;
    }
}
