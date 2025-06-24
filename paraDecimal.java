import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class paraDecimal {
    public static void main(String[] args){
        Scanner lendoTeclado = new Scanner(System.in);

        /*
        int binario=0;
        int octal=0;
        int hexadecimal = 0;
        int decimal=0;
        int potenciaAtual = 1;

        System.out.println("Informe o número: ");
        int numeroDigitado = lendoTeclado.nextInt();

        System.out.println("Informe a base que está o número (2,8,12,16): ");
        int baseDigitado = lendoTeclado.nextInt();

        if (baseDigitado == 8){
            while(numeroDigitado>0){
                int resto = numeroDigitado%10;
                decimal = decimal + (resto * potenciaAtual);
                potenciaAtual = potenciaAtual * 8;
                numeroDigitado = numeroDigitado /10;
            }
            System.out.printf("VALOR: %d em octal\n",decimal);
        }
        if (baseDigitado == 2) {
            while (numeroDigitado > 0) {
                int resto = numeroDigitado % 10;
                binario = binario + (resto * potenciaAtual);
                potenciaAtual = potenciaAtual * 2;
                numeroDigitado = numeroDigitado / 10;
            }
            System.out.printf("VALOR: %d em decimal\n",binario);

        }

         */


        System.out.println("Informe o número: ");
        int numeroDigitado = lendoTeclado.nextInt();

        String numeroDig = Integer.toString(numeroDigitado);

        char[] meuVetor = numeroDig.toCharArray();
        System.out.printf(Arrays.toString(meuVetor));


    }

}
