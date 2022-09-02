import java.util.Arrays;
import java.util.Scanner;

/*
74) Faça um programa que receba dez números 
e armazene em uma lista. Em seguida, 
substitua todos os números cujo valor seja 
menor que 10 pelo valor ZERO. Imprima a lista em tela.

*/
public class Exercicio74 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        //entradas
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }
        //processamento
        for(int i=0;i<10;i++){
            if(numeros[i] < 10){
                numeros[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
