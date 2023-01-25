package plusminus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args){
        List<Integer> Lista = new ArrayList();
        
        Lista.add(4);
        Lista.add(2);
        Lista.add(0);
        Lista.add(-9);
        Lista.add(8);
        Lista.add(-5);
        Lista.add(1);
        
        plusMinus(Lista);
        
    }
    
    private static void plusMinus(List<Integer> arr){
        float CountPositives = 0, CountNegatives = 0, CountZero = 0;
        
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i) == 0){
                CountZero ++;
            }
            else if(arr.get(i) > 0){
                CountPositives ++;
            }
            else if(arr.get(i) < 0){
                CountNegatives ++;
            }
        }
        
        float TotalNumbers = arr.size(), ResultPositives = CountPositives / TotalNumbers, ResultNegatives = CountNegatives / TotalNumbers, ResultZero = CountZero / TotalNumbers;
        DecimalFormat format = new DecimalFormat("#.######");
        
        System.out.println(format.format(ResultPositives) + "\n" + format.format(ResultNegatives) + "\n" + format.format(ResultZero));
    }
}
