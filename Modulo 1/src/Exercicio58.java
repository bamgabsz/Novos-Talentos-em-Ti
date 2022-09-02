import java.util.Scanner;

/*
58) Faça um programa que leia um número N 
que indica quantos valores inteiros e positivos 
devem ser lidos a seguir. Para cada número 
lido, mostre o valor lido e o fatorial desse valor.
ENTRADAS
- n
- um numero de entradas determinadas pelo n (outronumero)

PROCESSAMENTO
- calcular o fatorial do outronumero

SAIDA
- os fatoriais
*/

public class Exercicio58 {
   public static void main(String[] args) {
       int n = 0;
       int outroNumero = 0;
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite o valor de N");
       n = Integer.parseInt(leitor.nextLine());

       for(int i=0; i<n; i++){
           System.out.println("Digite outro numero");
           outroNumero = Integer.parseInt(leitor.nextLine());
           int resulFat = 1;
           for(int j=outroNumero; j >= 1; j--){
               //System.out.print(j);
               resulFat = resulFat * j;
           }
           System.out.println(String.format("%d! = %d",outroNumero,resulFat));
       }
   } 
}
