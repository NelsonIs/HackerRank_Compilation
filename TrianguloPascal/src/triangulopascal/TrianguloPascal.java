package triangulopascal;

public class TrianguloPascal{
    public static void main(String[] args){
        int sizeOfArray = 20;
        String Array[][] = makeUpArray(fillArray(sizeOfArray), sizeOfArray);
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("");
            for(int j=0;j<sizeOfArray;j++){
                System.out.print(Array[i][j]);
            }
        }
    }
    
    private static int[][] fillArray(int Size){
        int Matriz[][] = new int[Size][Size];
        Matriz[0][0] = 1;
        Matriz[1][0] = 1;
        Matriz[1][1] = 1;
        int Fila = 2;
        
        while(Fila < Size){
            for(int i=0;i<Size;i++){
                if(i == 0){
                    Matriz[Fila][i] = 1;
                }
                else if(i == Fila){
                    Matriz[Fila][i] = 1;
                    break;
                }
                else{
                    Matriz[Fila][i] = Matriz[Fila-1][i-1] + Matriz[Fila-1][i];
                }
            }
            Fila ++;
        }
        
        return Matriz;
    } 
    private static String[][] makeUpArray(int Array[][], int Size){
        String beautyArray[][] = new String[Size][Size];
        
        for(int i = 0;i<Size;i++){
            for(int j = 0;j<Size;j++){
                beautyArray[i][j] = " ";
            }
        }
        int Fila = 0;
        
        while(Fila < Size){
            int Space = (Size - Fila) / 2;
            for(int i=0;i<Size;i++){
                if(Array[Fila][i] != 0){
                    beautyArray[Fila][i+Space] = String.valueOf(Array[Fila][i]) + " ";
                }
            }
            Fila ++;
        }
        
        return beautyArray;
    }
}
