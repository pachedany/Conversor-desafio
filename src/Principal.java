import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Principal{
    private static Object opcion;

    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion;
        do {
            Scanner lectura = new Scanner(System.in);
            ConsultaDivisa consulta = new ConsultaDivisa();
            System.out.println("Escribe la divisa de origen. \n" +
                    "Después escribe la divisa a consultar entre:\n" +
                    "MXN (peso mexicano), USD (dolar estadounidense), ARS(peso argentino), BRL(real brasileño): ");

            String divisaPais = lectura.nextLine();
            Divisa divisa;

            String divisaNew = lectura.nextLine();
            try {
                divisa = consulta.buscaDivisa(divisaPais, divisaNew);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(divisa + divisaNew);


            Scanner cambio = new Scanner(System.in);

            System.out.println("\nSelecciona el tipo de cambio \ny despes escribe el monto a convertir:\n\n" +
                    "*************************************************\n" +
                    "1.- MXN a USD  " +
                    "2.- MXN a ARS  " +
                    "3.- MXN a BRL\n" +
                    "*************************************************\n" +
                    "4.- USD a MXN  " +
                    "5.- USD a ARS  " +
                    "6.- USD a BRL\n" +
                    "*************************************************\n" +
                    "7.- ARS a MXN  " +
                    "8.- ARS a USD  " +
                    "9.- ARS a BRL\n" +
                    "*************************************************\n" +
                    "10.- BRL a MXN  " +
                    "11.- BRL a USD  " +
                    "12.- BRL a ARS\n" +
                    "**************************************************\n" +
                    "0.- SALIR");

            opcion = cambio.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("MXN a USD");
                    int moneda = lectura.nextInt();
                    double valorMxnUsd = (moneda * divisa.conversion_rate());
                    System.out.println(valorMxnUsd + " USD");
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("MXN a ARS");
                    int moneda2 = lectura.nextInt();
                    double valorMxnARs = (moneda2 * divisa.conversion_rate());
                    System.out.println(valorMxnARs + " ARS");
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println("MXN a BRL");
                    int moneda3 = lectura.nextInt();
                    double valorMxnBrl = (moneda3 * divisa.conversion_rate());
                    System.out.println(valorMxnBrl + " BRL");
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.println("USD a MXN");
                    int moneda4 = lectura.nextInt();
                    double valorUsdMxn = (moneda4 * divisa.conversion_rate());
                    System.out.println(valorUsdMxn + " MXN");
                    System.out.println("-------------------------------------");
                    break;
                case 5:
                    System.out.println("USD a ARS");
                    int moneda5 = lectura.nextInt();
                    double valorUsdArs = (moneda5 * divisa.conversion_rate());
                    System.out.println(valorUsdArs + " ARS");
                    System.out.println("-------------------------------------");
                    break;
                case 6:
                    System.out.println("USD a BRL");
                    int moneda6 = lectura.nextInt();
                    double valorUsdBrl = (moneda6 * divisa.conversion_rate());
                    System.out.println(valorUsdBrl + " BRL");
                    System.out.println("-------------------------------------");
                    break;
                case 7:
                    System.out.println("ARS a MXN");
                    int moneda7 = lectura.nextInt();
                    double valorArsMxn = (moneda7 * divisa.conversion_rate());
                    System.out.println(valorArsMxn + " MXN");
                    System.out.println("-------------------------------------");
                    break;
                case 8:
                    System.out.println("ARS a USD");
                    int moneda8 = lectura.nextInt();
                    double valorArsUsd = (moneda8 * divisa.conversion_rate());
                    System.out.println(valorArsUsd + " USD");
                    System.out.println("-------------------------------------");
                    break;
                case 9:
                    System.out.println("ARS a BRL");
                    int moneda9 = lectura.nextInt();
                    double valorArsBrl = (moneda9 * divisa.conversion_rate());
                    System.out.println(valorArsBrl + " BRL");
                    System.out.println("-------------------------------------");
                    break;
                case 10:
                    System.out.println("BRL a MXN");
                    int moneda10 = lectura.nextInt();
                    double valorBrlMxn = (moneda10 * divisa.conversion_rate());
                    System.out.println(valorBrlMxn + " MXN");
                    System.out.println("-------------------------------------");
                    break;
                case 11:
                    System.out.println("BRL a USD");
                    int moneda11 = lectura.nextInt();
                    double valorBrlUsd = (moneda11 * divisa.conversion_rate());
                    System.out.println(valorBrlUsd + " USD");
                    System.out.println("-------------------------------------");
                    break;
                case 12:
                    System.out.println("BRL a ARS");
                    int moneda12 = lectura.nextInt();
                    double valorBrlArs = (moneda12 * divisa.conversion_rate());
                    System.out.println(valorBrlArs + " ARS");
                    System.out.println("-------------------------------------");
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("elige otra opcion");

            }
        }
        while (opcion != 0);
        System.out.println("¡Hasta pronto!");
    }

}