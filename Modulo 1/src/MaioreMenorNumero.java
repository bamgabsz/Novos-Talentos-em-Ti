import java.util.Scanner;

public class MaioreMenorNumero{
    public static void main(String[] args) {
        int numero = 0;
        int omaiornumero = 0;
        int omenornumero = 0;
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        do{
            System.out.println("Digite um numero maior ou igual a zero");
            numero = Integer.parseInt(leitor.nextLine());
            if (numero < 0) break;

            if (numero > omaiornumero){
                omaiornumero = numero;
            }
            //NAO MISTURAR AS LOGICAS DO MAIOR E DO MENOR
            if (contador == 0){
                omenornumero = numero;
            } else { 
                if (numero  < omenornumero){
                    omenornumero = numero;
                }
            }
            contador ++;
        }while(numero >= 0);
        //mostrar o resultado FORA do bloco de repetição
        System.out.println("O maior numero e: " + omaiornumero);
        System.out.println("O menor numero e: " + omenornumero );
    }
}