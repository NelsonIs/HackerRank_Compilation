/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flippingbinary;

/**
 *
 * @author nelso
 */
public class FlippingBinary {
    public static void main(String[] args) {
        long NumDecimalPrueba = 15;
        
        System.out.println(flippingBinarys(NumDecimalPrueba));
    }
    
    /**
     * Metodo para hacer el proceso general
     * @param n Es el numero decimal a convertir
     * @return retorna el numero decimal convertido
     */
    private static long flippingBinarys(long n){
        long Result = 0;
        
        String Binary = Long.toString(n, 2), BinaryResult = "", Aux = "";
        
        for(int i = 0;i<(32-Binary.length());i++){
            Aux += "0";
        }
        
        Aux += Binary;
        Binary = Aux;
        
        for(int i = 0;i<Binary.length();i++){
            if(String.valueOf(Binary.charAt(i)).equals("0")){
                BinaryResult += "1";
            }
            else{
                BinaryResult += "0";
            }
        }
        
        Result = Long.parseLong(BinaryResult, 2);
        
        return Result;
    }
}
