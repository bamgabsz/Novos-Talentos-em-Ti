import java.util.Arrays;
import java.util.Scanner;

/*
78) Faça um programa que receba dez números e 
armazene em uma lista. Em seguida copie todos 
os números da primeira lista para uma segunda 
lista, mas na ordem invertida da 
primeira lista.

*/

public class Exercicio78 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        int[] listaInvertida = new int[10];
        Scanner leitor = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            lista[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i=0;i<10;i++){
            listaInvertida[i] = lista[9-i];
        }
        System.out.println(Arrays.toString(listaInvertida));

    }
}
