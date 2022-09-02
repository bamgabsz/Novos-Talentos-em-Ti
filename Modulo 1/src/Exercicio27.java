

/*
Faça um programa que receba a quantidade de dinheiro 
em reais que uma pessoa que vai viajar possui. Essa 
pessoa vai passar por vários países e precisa converter 
seu dinheiro em dólares, marco alemão e libra esterlina. 
Sabe-se que a cotação do dólar é R$ 1,80 do marco 
alemão R$2,00 e da libra esterlina de R$ 1,57. 
O programa deve fazer as conversões e mostrá-las.
ENTRADA
-valreais

PROCESSAMENTO
valdolar = valreais / 1.80
valmarcoalemao = valreais / 2
vallibras = valreais / 1.57

SAIDA
- valdolar
- valmarcoalemao
- vallibras
*/

import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        float valreais=0;
        float valdolar=0;
        float valmarcoalemao = 0;
        float vallibras = 0;
        Scanner leitor = new Scanner(System.in);
        //ENTRADAS
        System.out.println("Digite o valor em reais");
        valreais = Float.parseFloat(leitor.nextLine());
        //PROCESSAMENTO
        valdolar = valreais / 1.8f;
        valmarcoalemao = valreais / 2f;
        vallibras = valreais / 1.57f;

        System.out.println("O valor do dolar e " + valdolar);
        System.out.println("O valor do marco e " + valmarcoalemao);
        System.out.println("O valor da libra e " + vallibras);

    }
}
