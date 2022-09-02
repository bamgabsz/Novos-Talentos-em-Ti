import java.util.Scanner;

/*
Faça um programa que receba dez números e armazene em uma lista.
Em seguida calcule a soma de todos os números 
percorrendo novamente a lista.
Apresente a soma e em seguida a média baseada na soma
e no número de números armazenados.
*/

public class Exercicio75 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        float media = 0;
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i=0;i<10;i++){
            soma = soma + numeros[i];
        }
        media = soma / 10f;
        System.out.println("A soma e " + soma);
        System.out.println("A media e " + media);
    }
}
