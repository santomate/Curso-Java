//Mi clase en java
public class HolaMundo {
    public static void main(String[] args) {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
               System.out.println(miVariableCadena); 
            
        //var va a ser inferencia de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
       
               
           //Valores permitidos en nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var  ámiVariable = x no se recomienda utilizar
        //var #miVariable = x no se permiten utilizar caracteres especiales
        
    }
}
