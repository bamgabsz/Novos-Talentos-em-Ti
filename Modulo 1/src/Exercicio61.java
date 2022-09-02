import java.util.Scanner;

/*
61) Elaborar um programa que efetue a leitura sucessiva 
de valores numéricos e apresente no final o total do 
somatório, a média e o total de valores lidos. O 
programa deve fazer as leituras dos valores enquanto 
o usuário estiver fornecedor valores positivos. Ou 
seja, o programa deve parar quando o usuário 
fornecer um valor negativo.
*/

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int umnumero = 0;
        int soma = 0, contador=0;
        float media = 0;

        do{
            System.out.println("Digite um numero");
            umnumero = Integer.parseInt(leitor.nextLine());
            if(umnumero<0){
                break;
            }
            contador++;
            soma += umnumero;
        }while(umnumero >= 0);      
        media = soma / contador;
        System.out.println("A soma dos numeros e " + soma);
        System.out.println("A media e " + media);
    }
}
