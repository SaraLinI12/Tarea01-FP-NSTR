import java.util.Scanner;

/**
 * Kilowats
 */
public class Kilowats {

    public static void main(String[] args) {
        //2.11
        //Definir variables
        double Kilowatsconsumidos, cobroporkilowat, preciototal;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilowats consumidos");
        Kilowatsconsumidos= lt.nextDouble();
        System.out.println("Ingrese la cantidad a cobrar por kilowat");
        cobroporkilowat= lt.nextDouble();
        //Proceso
        preciototal=Kilowatsconsumidos*cobroporkilowat;
        //Datos de salida
        System.out.println("La cantidad a cobrarse por los kilowats usados es de:" +preciototal);
    }
}
    

