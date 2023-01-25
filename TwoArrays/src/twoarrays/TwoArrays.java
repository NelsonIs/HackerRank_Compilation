package twoarrays;

import java.util.*;

public class TwoArrays {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList();
        List<Integer> B = new ArrayList();
        int k;
        
        // Insertar valores a Lista A
        A.add(5);
        A.add(2);
        A.add(8);
        A.add(1);
        A.add(3);
        // Insertar valores a Lista B
        B.add(3);
        B.add(8);
        B.add(1);
        B.add(2);
        B.add(5);
        // Dar Valor a K
        k = 10;
        
        System.out.println(twoArrays(k, A, B));
    }
    
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        
        for(int i=0;i<A.size();i++){
            if(A.get(i) + B.get(i) < k){
                return "NO";
            }
        }
        return "YES";

    }
    
}
