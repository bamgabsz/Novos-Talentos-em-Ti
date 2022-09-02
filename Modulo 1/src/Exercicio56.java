/*
56) Elabore um programa que apresente no final o 
somatório dos valores pares existentes na faixa de 1 até 500.

ENTRADA
- nao tem!!!

PROCESSAMENTO
- somatoria dos numeros pares entre 1 e 500
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...
SAIDA
-somatorio

*/

public class Exercicio56 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i=1; i <= 500; i++){
            if (i % 2 == 0) { 
                System.out.print(String.format("%d ",i));
                soma = soma + i;
            }
        }
        System.out.println("O total dos números pares de 1 a 500 é: " + soma);
    }
}
