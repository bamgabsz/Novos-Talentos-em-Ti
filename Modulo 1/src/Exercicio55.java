/*
55) Faça um programa que apresente no final 
o somatório dos números de 1 até 100.
*/

public class Exercicio55 {
    public static void main(String[] args) {
        int contador = 1;
        int soma=0; //acumulador
        while(contador <= 100){
            //System.out.println(contador);
            soma = soma + contador;
            contador++;
        }
        System.out.println("A SOMA E " + soma);
    }
}
