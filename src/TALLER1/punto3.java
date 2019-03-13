package TALLER1;

import java.util.Scanner;

public class punto3 {


    
    private static void OperacionesTrigonometricas(){
        Scanner lea=new Scanner (System.in);
        double numero,res;
        int operacion;
        
        System.out.println("\nIndique la operación:"
                + "\n1. Seno"
                + "\n2. coseno"
                + "\n3. tangente"
                + "\n4. Secante"
                + "\n5. Cosecante"
                + "\n6. Cotangente");
        operacion=lea.nextInt();
        
        System.out.println("Ingrese valor");
        numero=lea.nextDouble();
                
        switch (operacion){
            case 1:
                res=Math.sin(numero);
                System.out.println("El seno de "+numero+" es: "+res);
                break;
                
            case 2:
                res=Math.cos(numero);
                System.out.println("El coseno de "+numero+" es: "+res);
                break;
            case 3:
                res=Math.tan(numero);
                System.out.println("La tangente de "+numero+" es: "+res);
                break;
            case 4:
                res=1/Math.cos(numero);
                System.out.println("La secante de "+numero+" es: "+res);
                break;
            case 5:
                res=1/Math.sin(numero);
                System.out.println("El cosecante de "+numero+" es: "+res);
                break;
            case 6:
                res=1/Math.tan(numero);
                System.out.println("El cotangente de "+numero+" es: "+res);
                break;
            default:
                System.out.println(operacion+" No es una opción valida");
                    
                                              
            }
        
    }
    
  
     private static void OperacionesAlgebraicas(){
        Scanner entrada=new Scanner(System.in);
        int a,b,result,oper;
        
        System.out.println("\nIndique la operación:"
                + "\n1. Suma"
                + "\n2. Resta"
                + "\n3. Multiplicación"
                + "\n4. División");
        oper=entrada.nextInt();
        System.out.println("Ingrese el primer número");
        a=entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        b=entrada.nextInt();
        switch (oper){
            case 1:
                result=a+b;
                System.out.println("La suma de "+a+"+"+b+" es: "+result);
                break;
                
            case 2:
                result=a-b;
                System.out.println("La resta de "+a+"-"+b+" es: "+result);
                break;
            case 3:
                result=a*b;
                System.out.println("La multiplicación de "+a+"*"+b+" es: "+result);
                break;
            case 4:
                if (b==0){
                    System.out.println("Error. No se puede dividir por 0");                    
                }
                else{
                    result=a/b;
                    System.out.println("la division de "+a+"/"+b+" es: "+result);                    
                }
                default:
                    System.out.println(oper+" No es una opción valida");
                    
                                              
            }
                
        }
        
        
    
  
     
           
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String continuar;
        int opcion;
        
        System.out.println("OPERACIONES");
        do{
            System.out.println("Elegir tipo de operación"
                                + "\n1.Operaciones Trigonometricas"
                                + "\n2.Operaciones Algebraicas");
            opcion=lector.nextInt();
            
            switch (opcion){
                case 1:
                    OperacionesTrigonometricas();
                    break;
                
                case 2:
                    OperacionesAlgebraicas();
                    break;
                    default:
                    System.out.println(opcion+" no es una opcion valida");              
            }
            System.out.println("Desea continuar S/N");
            continuar = lector.next();
            continuar = continuar.toLowerCase();
        }while(continuar.equals("s"));    
    }
}
