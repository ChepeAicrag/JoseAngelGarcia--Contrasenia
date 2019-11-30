
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
   public static void main(String []args){
      verificar();
    }
    /**
      * Método que imprime si la contraseña introducida es correcta o no.
      * 
       */
   public static void verificar(){
       int n = 3;
       Scanner leer = new Scanner(System.in);
       do{
           System.out.println("Introduce la contraseña");
           String es = leer.next();
           if(es.equals("Hola123")){
                System.out.println("Contraseña correcta");
                break;
           }else{
               System.out.println((n-1 == 0 ) ? "Se terminaron los intentos " :"Vuelva a intentarlo, tiene " + (n-1) + " intentos mas");
            }
           n--;     
        }while(n !=0 );
    } 
}
