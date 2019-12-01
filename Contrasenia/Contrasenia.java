
/**
 * Determina si la contraseña introducida es la misma que la de acceso.
 * 
 * @author Garcia Garcia Jose Angel 
 * @version 30/11/2019
 */
import java.util.Scanner;
public class Contrasenia
{ 
   /**
     * Método principal que ejecuta el programa
     * @param args Omitir, no necesario
      */
   public static void main(String []args){ // Inicio del main
      verificar(); //Ejecucción del método verifica
    } // Cierre del main 
    /**
      * Método que imprime si la contraseña introducida es correcta o no.
      * 
       */
   public static void verificar(){ // Inicio del método
       int n = 3; // Variable que guarda el número de intentos que se tienen 
       Scanner leer = new Scanner(System.in); // Variable utilizada para leer desde teclado 
       do{ // Inicio del do - while
           System.out.println("Introduce la contraseña"); // Impresión solicitando la contraseña 
           String es = leer.next(); // Se guarda en la variable "es" el dato introducido 
           if(es.equals("Hola123")){ // Se compara el dato introducido con el de la contraseña de acceso
                System.out.println("Contraseña correcta"); 
                break; // Se termina el método cuando la contraseña es la de acceso 
           }else{ // Fin del if e inicio del else 
               System.out.println((n-1 == 0 ) ? "Se terminaron los intentos " :"Vuelva a intentarlo, tiene " + (n-1) + " intentos mas"); // Impresion de los intentos que le quedan al usuario 
            } // Fin del else
           n--;  // Se disminuye la variable de intentos 
        }while(n !=0 ); // Se repite el ciclo mientrsa se tengan intentos 
    } // Cierre del método
} // Cierre de la clase
