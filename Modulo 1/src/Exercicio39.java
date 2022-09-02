

/**
 * Escreva o algoritmo de um programa que solicite
 * dois números quaisquer ao usuário, se os números
 * forem iguais mostre uma mensagem e mostre a media
 * dos dois, caso contrário mostre qual o maior número
 * e qual o menor número. 
 */
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1=0, num2=0;

        System.out.println("Digite um numero");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite outro numero");
        num2 = Integer.parseInt(leitor.nextLine());

        if(num1 == num2){
            System.out.println("Os numeros sao iguais");
            //não precisa calcular a média de dois numeros iguais
            System.out.println("A media dos numeros e "+ num1);
        }else{
            if(num1 > num2){
                System.out.println("O maior e " + num1);
                System.out.println("O menor e " + num2);
            }else{
                System.out.println("O maior e " + num2);
                System.out.println("O menor e " + num1);
            }
        }
    }
}
