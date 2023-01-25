package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        boolean wantEnd = false;
        do{
            /* Objetos */
            Scanner input = new Scanner(System.in);
            DecimalFormat format = new DecimalFormat("#.##");
            /* Variables */
            Double numeroA = 0.0, numeroB = 0.0, Result= 0.0;
            String userOption = "";
        
            System.out.println(" CALCULADORA | SELECCIONA UNA OPCION");
            System.out.println("Suma                Presione 1.");
            System.out.println("Resta               Presione 2.");
            System.out.println("Multiplicacion      Presione 3.");
            System.out.println("Division            Presione 4.");
        
            boolean hasError = true;
            while(hasError){
                try{
                    userOption = input.nextLine();
                    
                    int Aux = Integer.parseInt(userOption);
                    if(Aux < 1 || Aux > 4){
                        int error = 5/0;
                    }
                    hasError = false;
                }catch(Exception e){
                    hasError = true;
                    System.out.println("Error! Ingrese una opcion valida");
                }
            }
            hasError = true;
            while(hasError){
                try{
                    System.out.println("Ingrese su primer numero: ");
                    String Aux = input.nextLine();
                
                    numeroA = Double.parseDouble(Aux);
                    hasError = false;
                }catch(Exception e){
                    hasError = true;
                    System.out.println("Error! Ingrese un numero valido");
                }
            }
            hasError = true;
            while(hasError){
                try{
                    System.out.println("Ingrese su segundo numero: ");
                    String Aux = input.nextLine();
                
                    numeroB = Double.parseDouble(Aux);
                    if(userOption.equals("4") && numeroB == 0){
                        System.out.println("Error! No es posible dividir entre 0.");
                        hasError = true;
                    }
                    else{
                        hasError = false;
                    }
                }catch(Exception e){
                    hasError = true;
                    System.out.println("Error! Ingrese un numero valido");
                }
            }
        
        
            switch(userOption){
                case "1":{
                    Result = numeroA + numeroB;
                    userOption = "+";
                    break;
                }
                case "2":{
                    Result = numeroA - numeroB;
                    userOption = "-";
                    break;
                }
                case "3":{
                    Result = numeroA * numeroB;
                    userOption = "*";
                    break;
                }
                case "4":{
                    Result = numeroA / numeroB;
                    userOption = "/";
                    break;
                }
            }
            
            System.out.println("El resultado es: "
                    + format.format(numeroA) + " " + userOption + " " + format.format(numeroB) + " = " + format.format(Result) + "\n\n");
            
            System.out.println("Si dseas volver a iniciar la Calculadora Presiona 1");
            String userChoice = input.nextLine();
            if(userChoice.equals("1")){
                wantEnd = true;
            }
            System.out.println("\n\n");
            
            
        }while(wantEnd);
        
    }
}
