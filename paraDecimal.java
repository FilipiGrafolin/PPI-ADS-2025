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

        System.out.println("Informe a base do número: ");
        int baseDigitada = lendoTeclado.nextInt();

        String numeroDig = Integer.toString(numeroDigitado);
        int tamanhoString = numeroDig.length();

        char[] vetor = numeroDig.toCharArray();
        System.out.printf(Arrays.toString(vetor));

        int potencia=0;
        int ultimaPosicao = (vetor.length)-1;
        int resultado =0;

        //System.out.println(vetor[ultimaPosicao]);
        //System.out.printf("ULTIMA POSICAO: %d", ultimaPosicao);

        for (int cont = ultimaPosicao; cont>=0; cont--){
            potencia++;
            for (int i = 0 ; i <= potencia ; i++) {
                resultado *= vetor[cont];
            }
            System.out.printf("\nCONT: %d\nVALOR: "+vetor[cont]+"\nPOTENCIA: %d\nRESULTADO %d",cont,potencia,resultado);

            
            /*if (resultado == 0){
                resultado = resultado - resultado + 1;
                System.out.printf("\nRESULTADO: %d",resultado);
            }else {
                System.out.printf("\nRESULTADO: %d",resultado);
            }

             */

        }


    }

}
