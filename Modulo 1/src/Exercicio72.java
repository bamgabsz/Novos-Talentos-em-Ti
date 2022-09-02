

/*
72) Faça um programa que receba dez números e 
armazene em uma lista. Em seguida percorra toda a 
lista mostrando apenas os números que cujo valor 
seja superior a 10.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio72 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10];

        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<10 ;i++){
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        }
        //System.out.println(Arrays.toString(listaNumeros));

        for(int i=0; i<10; i++){
            if (listaNumeros[i] > 10){ //FILTRO!!!!
                System.out.println(listaNumeros[i]);
            }
        }
    }
}



