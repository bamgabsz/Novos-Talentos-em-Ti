import java.util.Scanner;

/*
60) Elaborar um programa que efetue a leitura de 10 
valores numéricos e apresente no final o total do 
somatório e a média do total.

*/

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int umnumero = 0, soma=0;
        float media=0;
        //for(var e valor inicial; condição ; incr/decre )
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero");
            umnumero = Integer.parseInt(leitor.nextLine());
            //acumulador
            soma += umnumero;  // soma = soma + umnumero;
        }
        media = soma / 10f;
        System.out.println("A soma e " + soma);
        System.out.println("A media e " + media);
    }
}
