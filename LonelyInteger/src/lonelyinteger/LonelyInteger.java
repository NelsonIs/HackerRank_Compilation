package lonelyinteger;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> Lista = new ArrayList();
        
        Lista.add(1);
        Lista.add(2);
        Lista.add(2);
        Lista.add(3);
        Lista.add(4);
        Lista.add(1);
        Lista.add(3);
        Lista.add(2);
        
        System.out.println(doLonelyInteger(Lista));
    }
    
    private static int doLonelyInteger(List<Integer> a){
        int Result = -1;
        boolean bandera;
        for(int i = 0;i<a.size();i++){
            bandera = true;
            for(int j = 0;j<a.size();j++){
                if(i != j){
                    if(a.get(i) == a.get(j)){
                        bandera = false;
                    }
                }
            }
            if(bandera){
                Result = a.get(i);
            }
        }

        return Result;
    }
}
