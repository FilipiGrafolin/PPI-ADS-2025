import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class paraDecimal {
    public static void main(String[] args){
        Scanner opcoesConv = new Scanner(System.in);


        System.out.println("MENU\n==========================================\nDIGITE O NÚMERO CORRESPONDENTE\n1 - CONVERTER PARA DECIMAL\n2 - CONVERTER DE DECIMAL PARA OUTRAS BASES\n3 - CONVERTER BASES DIFERENTES(fora decimal)");
        System.out.println("==========================================");
        int opcoesMenu = opcoesConv.nextInt();

        if (opcoesMenu==1){//FILIPI
            Scanner lendoTeclado = new Scanner(System.in);
            System.out.print("OUTRAS BASES PARA DECIMAL\n");

            System.out.println("Informe o número: ");
            String numeroDigitado = lendoTeclado.next();

            System.out.println("Informe a base do número digitado anteriormente: ");
            int baseDigitada = lendoTeclado.nextInt();

            char[] vetor = numeroDigitado.toCharArray();
            //System.out.printf(Arrays.toString(vetor)); TA AQUI SÓ PRA MOSTRAR COMO ESTÁ O VETOR

            int ultimaPosicao = (vetor.length) - 1;
            double resultadoFinal = 0.0;
            int potencia = 0;

            for (int cont = ultimaPosicao; cont >= 0; cont--) { //LOOPA O MESMO NÚMERO DE CASAS DO VETOR

                int valor = Character.getNumericValue(vetor[cont]);
                double conversaoValor = valor * Math.pow(baseDigitada, potencia);

                if (baseDigitada == 16) {
                    if (vetor[cont] == 'A') {
                        vetor[cont] = 10;
                    }
                    if (vetor[cont] == 'B') {
                        vetor[cont] = 11;
                    }
                    if (vetor[cont] == 'C') {
                        vetor[cont] = 12;
                    }
                    if (vetor[cont] == 'D') {
                        vetor[cont] = 13;
                    }
                    if (vetor[cont] == 'E') {
                        vetor[cont] = 14;
                    }
                    if (vetor[cont] == 'F') {
                        vetor[cont] = 15;
                    }

                }

                resultadoFinal += conversaoValor;
                potencia++;
            }
            System.out.printf("\nNúmero na base 10: %.2f", resultadoFinal);
        }
        if (opcoesMenu==2){//MARCIO
            Scanner decbases = new Scanner(System.in);

            System.out.print("DECIMAL PARA OUTRAS BASES"+"\n");
            System.out.print("Informe o número: "+"\n");
            int numerodecimal = decbases.nextInt();
            System.out.print("Informe a base que deseja converter: "+"\n");
            int base16 = decbases.nextInt();
            System.out.print("\n");

            int[] resultados = new int[100];
            if(base16 == 16) {
                int posicaoarray = 0;
                int divisaoinicial = numerodecimal/base16;
                int divisaoinicial2 = numerodecimal%base16;
                resultados[posicaoarray] = divisaoinicial2;
                posicaoarray++;

                while(divisaoinicial > 0) {

                    int outrasdivisoes = divisaoinicial/base16;
                    int outrasdivisoes2 = divisaoinicial%base16;
                    divisaoinicial = outrasdivisoes;
                    divisaoinicial2 = outrasdivisoes2;
                    resultados[posicaoarray] = divisaoinicial2;
                    posicaoarray++;
                }
                System.out.print("Número na base 16: ");
                for (int i = posicaoarray - 1; i >= 0; i--) {
                    int restos = resultados[i];
                    if (restos == 10) {
                        System.out.print("A");

                    }else if (restos == 11) {
                        System.out.print("B");

                    }else if (restos  == 12) {
                        System.out.print("C");

                    }else if (restos  == 13) {
                        System.out.print("D");

                    }else if (restos == 14) {
                        System.out.print("E");

                    }else if (restos == 15) {
                        System.out.print("F");

                    } else {
                        System.out.print(restos);
                    }
                }


            }


            if(base16 == 8) {
                int posicaoarray = 0;
                int divisaoinicial = numerodecimal/base16;
                int divisaoinicial2 = numerodecimal%base16;
                resultados[posicaoarray] = divisaoinicial2;
                posicaoarray++;
                while(divisaoinicial > 0) {

                    int outrasdivisoes = divisaoinicial/base16;
                    int outrasdivisoes2 = divisaoinicial%base16;
                    divisaoinicial = outrasdivisoes;
                    divisaoinicial2 = outrasdivisoes2;
                    resultados[posicaoarray] = divisaoinicial2;
                    posicaoarray++;
                }
                System.out.print("Número na base 8: ");
                for (int i = posicaoarray - 1; i >= 0; i--) {
                    System.out.print(resultados[i]);
                    if (divisaoinicial2 == 8) {
                        System.out.print("10");

                    }		if (divisaoinicial2 == 9) {
                        System.out.print("11");

                    }		if (divisaoinicial2 == 10) {
                        System.out.print("12");

                    }		if (divisaoinicial2 == 11) {
                        System.out.print("13");

                    }		if (divisaoinicial2 == 12) {
                        System.out.print("14");

                    }		if (divisaoinicial2 == 13) {
                        System.out.print("15");

                    }		if (divisaoinicial2 == 14) {
                        System.out.print("16");

                    }		if (divisaoinicial2 == 15) {
                        System.out.print("17");

                    }		if (divisaoinicial2 == 16) {
                        System.out.print("20");

                    }		if (divisaoinicial2 == 17) {
                        System.out.print("21");

                    }
                }

            }

            if(base16 == 2) {
                int posicaoarray = 0;

                int divisaoinicial  = numerodecimal / base16;
                int divisaoinicial2 = numerodecimal % base16;
                resultados[posicaoarray] = divisaoinicial2;
                posicaoarray++;

                while (divisaoinicial > 0) {
                    int outrasdivisoes  = divisaoinicial / base16;
                    int outrasdivisoes2 = divisaoinicial % base16;
                    divisaoinicial  = outrasdivisoes;
                    divisaoinicial2 = outrasdivisoes2;
                    resultados[posicaoarray] = divisaoinicial2;
                    posicaoarray++;
                }

                System.out.print("Número na base 2: ");
                for (int i = posicaoarray - 1; i >= 0; i--) {
                    System.out.print(resultados[i]);
                }
            }
        }
        if (opcoesMenu==3){
            Scanner lendoTeclado = new Scanner(System.in);

            System.out.println("OUTRAS BASES (FORA DECIMAL)");

            System.out.println("Informe o número: ");
            String numeroDigitado = lendoTeclado.next();

            System.out.println("Informe a base do número digitado anteriormente: ");
            int baseDigitada = lendoTeclado.nextInt();

            char[] vetor = numeroDigitado.toCharArray();

            int ultimaPosicao = (vetor.length) - 1;
            int resultadoFinal = 0;
            int potencia = 0;

            for (int cont = ultimaPosicao; cont >= 0; cont--) { //LOOPA O MESMO NÚMERO DE CASAS DO VETOR

                int valor = Character.getNumericValue(vetor[cont]);

                double conversaoValor = valor * Math.pow(baseDigitada, potencia);

                if (baseDigitada == 16) {

                    if (vetor[cont] == 'A') {
                        vetor[cont] = 10;
                    }

                    if (vetor[cont] == 'B') {
                        vetor[cont] = 11;
                    }

                    if (vetor[cont] == 'C') {
                        vetor[cont] = 12;
                    }

                    if (vetor[cont] == 'D') {
                        vetor[cont] = 13;
                    }

                    if (vetor[cont] == 'E') {
                        vetor[cont] = 14;
                    }

                    if (vetor[cont] == 'F') {
                        vetor[cont] = 15;
                    }
                }

                resultadoFinal += conversaoValor;

                potencia++;

            }

            int numerodecimal = resultadoFinal;
            Scanner decbases = new Scanner(System.in);

            System.out.print("Informe a base a qual deseja converter: "+"\n");
            int base16 = decbases.nextInt();

            System.out.print("\n");
            int[] resultados = new int[100];

            if(base16 == 16) {
                int posicaoarray = 0;
                int divisaoinicial = numerodecimal/base16;
                int divisaoinicial2 = numerodecimal%base16;
                resultados[posicaoarray] = divisaoinicial2;
                posicaoarray++;

                while(divisaoinicial > 0) {
                    int outrasdivisoes = divisaoinicial/base16;
                    int outrasdivisoes2 = divisaoinicial%base16;
                    divisaoinicial = outrasdivisoes;
                    divisaoinicial2 = outrasdivisoes2;
                    resultados[posicaoarray] = divisaoinicial2;
                    posicaoarray++;

                }

                System.out.print("Número na base 16: ");
                for (int i = posicaoarray - 1; i >= 0; i--) {
                    int restos = resultados[i];
                    if (restos == 10) {
                        System.out.print("A");

                    }else if (restos == 11) {
                        System.out.print("B");

                    }else if (restos  == 12) {
                        System.out.print("C");

                    }else if (restos  == 13) {
                        System.out.print("D");

                    }else if (restos == 14) {
                        System.out.print("E");

                    }else if (restos == 15) {
                        System.out.print("F");

                    } else {
                        System.out.print(restos);
                    }
                }
            }
            if(base16 == 8) {
                int posicaoarray = 0;
                int divisaoinicial = numerodecimal/base16;
                int divisaoinicial2 = numerodecimal%base16;
                resultados[posicaoarray] = divisaoinicial2;
                posicaoarray++;

                while(divisaoinicial > 0) {
                    int outrasdivisoes = divisaoinicial/base16;
                    int outrasdivisoes2 = divisaoinicial%base16;
                    divisaoinicial = outrasdivisoes;
                    divisaoinicial2 = outrasdivisoes2;
                    resultados[posicaoarray] = divisaoinicial2;
                    posicaoarray++;

                }

                System.out.print("Número na base 8: ");

                for (int i = posicaoarray - 1; i >= 0; i--) {

                    System.out.print(resultados[i]);

                    if (divisaoinicial2 == 8) {

                        System.out.print("10"+"\n");

                    }		if (divisaoinicial2 == 9) {

                        System.out.print("11"+"\n");

                    }		if (divisaoinicial2 == 10) {

                        System.out.print("12");

                    }		if (divisaoinicial2 == 11) {

                        System.out.print("13");

                    }		if (divisaoinicial2 == 12) {

                        System.out.print("14");

                    }		if (divisaoinicial2 == 13) {

                        System.out.print("15");

                    }		if (divisaoinicial2 == 14) {

                        System.out.print("16");

                    }		if (divisaoinicial2 == 15) {

                        System.out.print("17");

                    }		if (divisaoinicial2 == 16) {

                        System.out.print("20");

                    }		if (divisaoinicial2 == 17) {

                        System.out.print("21");

                    }

                }

            }

            if(base16 == 2) {

                int posicaoarray = 0;
                int divisaoinicial  = numerodecimal / base16;
                int divisaoinicial2 = numerodecimal % base16;
                resultados[posicaoarray] = divisaoinicial2;
                posicaoarray++;

                while (divisaoinicial > 0) {
                    int outrasdivisoes  = divisaoinicial / base16;
                    int outrasdivisoes2 = divisaoinicial % base16;
                    divisaoinicial  = outrasdivisoes;
                    divisaoinicial2 = outrasdivisoes2;
                    resultados[posicaoarray] = divisaoinicial2;
                    posicaoarray++;
                }

                System.out.print("Número na base 2: ");
                for (int i = posicaoarray - 1; i >= 0; i--) {
                    System.out.print(resultados[i]);
                }
            }
        }
    }
}
