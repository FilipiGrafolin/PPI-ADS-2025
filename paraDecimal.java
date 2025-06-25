import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class paraDecimal {
    public static void main(String[] args){
        Scanner lendoTeclado = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int numeroDigitado = lendoTeclado.nextInt();

        System.out.println("Informe a base do número: ");
        int baseDigitada = lendoTeclado.nextInt();

        String numeroDigString = Integer.toString(numeroDigitado);

        char[] vetor = numeroDigString.toCharArray();
        //System.out.printf(Arrays.toString(vetor)); TA AQUI SÓ PARA MOSTRAR COMO ESTÁ O VETOR

        int ultimaPosicao = (vetor.length)-1;
        double resultadoFinal =0.0;
        int potencia =0;

        for (int cont = ultimaPosicao; cont>=0; cont--){ //LOOPA O MESMO NÚMERO DE CASAS DO VETOR

            int valor = Character.getNumericValue(vetor[cont]);
            double conversaoValor=valor * Math.pow(baseDigitada,potencia);

            resultadoFinal+=conversaoValor;

           // System.out.printf("\nVALOR: %d\nPOTENCIA: %d\nCÁLCULO %d x 8^%d",valor,potencia,valor,potencia,conversaoValor);
            potencia++;
        }
        System.out.printf("\nRESULTADO: %.2f",resultadoFinal);
    }
}
