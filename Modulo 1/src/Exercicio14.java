import java.util.Scanner;

/*
Faça um programa que calcule e mostre a área 
de um quadrado. Sabe-se que: area= lado * lado

ENTRADA
-lado
PROCESSAMENTO
area = lado * lado
SAIDA
-area
*/
public class Exercicio14 {
    public static void main(String[] args) {
        float lado = 0;
        float area = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho de um dos lados?");
        lado = Float.parseFloat(leitor.nextLine());
        area = lado * lado;
        System.out.println("A area do quadrado é: " + area);

    }
}
