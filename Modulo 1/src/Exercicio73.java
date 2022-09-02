

/*
73) Faça um programa que receba dez números e armazene 
em uma lista. Em seguida conte quantos números 
são impar e quantos são par. Apresente os contadores na tela.
*/

import java.util.Arrays;
import java.util.Scanner;
public class Exercicio73 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        int contapar = 0;
        int contaimpar=0;

        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        System.out.println(Arrays.toString(numeros));
        for(int i=0;i<10;i++){
            if(numeros[i] % 2 == 0){
                contapar++;
            }else{
                contaimpar++;
            }
        }
        System.out.println("O numero de numeros pares e " + contapar);
        System.out.println("O numero de numeros impares e " + contaimpar);
    }
}
