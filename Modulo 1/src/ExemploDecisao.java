import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
        int numero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = Integer.parseInt(leitor.nextLine());
        /*
        if(condição/TESTE){
            //bloco de codigo (ENTAO - VERDADEIRO)
        }else{
            //bloco de codigo (SENAO - FALSO)
        }

        if(condição/TESTE){
            //bloco de codigo (ENTAO - VERDADEIRO)
        }
        */
        if(numero >= 10){
            System.out.println("O numero é maior ou igual a DEZ");
        }else{
            System.out.println("O numero e menor que DEZ");
        }
        System.out.println("FIM DO PROGRAMA");



    }
}
