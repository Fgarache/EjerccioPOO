package suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Suma de dos numeros");
        System.out.println("numero 1");
        int valor1 = entrada.nextInt();

        System.out.println("numero 2");
        int valor2 = entrada.nextInt();


        Suma valores = new Suma(valor1, valor2);

        valores.imprimir();



    }

}
