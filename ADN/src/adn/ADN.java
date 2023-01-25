package adn;

import java.util.List;

public class ADN {
    public static void main(String[] args) {
        List<Persons> List = new List[Persons];
    }
    
    private static String analizeADN(String ADN, List<Persons> List){
        String Result = "";
        int i = 0, MaxCoincidences = 0, Position = -1, Coincidences[] = new int[List.size()];
        
        while(i < List.size()){
            int Count = 0;
            for(int j=0;j<20;j++){
                if(ADN.charAt(j) == List.get(i).getADN().charAt(0)){
                    Count ++;
                }
            }
            Coincidences[i] = Count;
            if(Count > MaxCoincidences){
                MaxCoincidences = Count;
                Position = i;
            }
            i ++;
        }
        
        float Percent = (MaxCoincidences / 20) * 100;
        Result = "El responsable es " + List.get(Position).getName() + ". Con un porcentaje del " + Percent;
        
        return Result;
    }
}
