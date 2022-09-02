import java.util.Scanner;

/*
Faça um programa que receba o peso de uma pessoa, calcule e mostre:
   - o novo peso, se a pessoa engordar 15% sobre o peso digitado;
   - o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.
ENTRADA
- pesoatual

PROCESSAMENTO
   KG             %
pesoatual   ---- 100
pesoengordou      15
pesoengordou * 100 = pesoatual * 15
---------------------------------------
pesoengordou = (pesoatual * 15) / 100
novopesoengorda = pesoatual + pesoengordou

pesoemagrece = (pesoatual * 20) / 100
novopesoemagrece = pesoatual - pesoemagrece

SAIDAS
-novopesoengorda
-novopesoemagrece
*/

public class Exercicio11 {
    public static void main(String[] args) {
        float pesoatual = 0;
        float pesoengordou = 0;
        float novopesoengorda = 0;
        float pesoemagrece = 0;
        float novopesoemagrece = 0;

        Scanner leitor = 
            new Scanner(System.in);
        System.out.println("Digite seu peso atual");
        pesoatual = Float.parseFloat(leitor.nextLine());

        pesoengordou = (pesoatual * 15) / 100;
        novopesoengorda = pesoatual + pesoengordou;

        pesoemagrece = (pesoatual * 20) / 100;
        novopesoemagrece = pesoatual - pesoemagrece;

        System.out.println("O novo peso caso engordar é: " + novopesoengorda);
        System.out.println("O novo peso caso emagreça é: " + novopesoemagrece);
        
    }
}
