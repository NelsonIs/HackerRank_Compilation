package diagonaldifference;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList();
        
        arr.get(0).add(5);
        arr.get(0).add(3);
        arr.get(0).add(7);
        
        arr.get(1).add(1);
        arr.get(1).add(8);
        arr.get(1).add(5);
        
        arr.get(2).add(2);
        arr.get(2).add(9);
        arr.get(2).add(6);
        
        System.out.println(diagonalDifference(arr));
    }
    
    /**
     * Metodo para determinar la diferencia de las diagonales
     * @param arr contiene la lista bidimencional que contiene nuestra matriz
     * @return retorna el valor absoluta de la diferencia de diagonales
     */
    private static int diagonalDifference(List<List<Integer>> arr){
        int Result = 0;
        
        int rightDiagonal = 0, leftDiagonal = 0, Aux = arr.size()-1;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i == j){
                    rightDiagonal += arr.get(i).get(j);
                }
                if(j == Aux){
                    leftDiagonal += arr.get(i).get(j);
                }
            }
            Aux --;
        }
        
        Result = rightDiagonal - leftDiagonal;
        if(Result < 0){
            Result *= -1;
        }
        
        return Result;
    }
}
