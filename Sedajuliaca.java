import java.util.Scanner;

/**
 * Sedajuliaca
 */
public class Sedajuliaca {

    public static void main(String[] args) {
        //2.10
        //Definir variables
        double metrosdeaguausados, cobropormetrodeagua, pagoentotal;
         //Datos de entrada
         Scanner lt=new Scanner(System.in);
         System.out.println("Ingrese la cantidad de metros cúbicos de agua consumidos");
         metrosdeaguausados= lt.nextDouble();
         System.out.println("Ingrese la cantidad a cobrar por metro cúbico de agua");
         cobropormetrodeagua= lt.nextDouble();
         //Proceso
         pagoentotal=metrosdeaguausados*cobropormetrodeagua;
         //Datos de salida
         System.out.println("La cantidad a cobrarse por los metros cúbicos de agua usados es de:" +pagoentotal);
    }
}
