import java.util.Scanner;

/*
64) Faça um algoritmo que calcule a multiplicação 
de dois números inteiros sem utilizar o operador “*”. 
Em vez disso, utilize apenas o operador de adição 
“+”. Para implementar esse algoritmo, devemos lembrar 
que qualquer multiplicação pode ser expressa por meio 
de somas. Por exemplo, o resultado da expressão 6 * 3 
é o mesmo que 6 + 6 + 6 ou 3 + 3 + 3 + 3 + 3 + 3. 
Ou seja, soma-se um elemento com ele próprio o número 
de vezes do segundo elemento.
*/

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1=0, num2=0;
        int acumulador = 0;
        System.out.println("Digite o primeiro numero");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo numero");
        num2 = Integer.parseInt(leitor.nextLine());

        for(int i=0; i<num1 ; i++){
            acumulador = acumulador + num2;
        }
        System.out.println(String.format("%d x %d = %d",num1,num2,acumulador));
    }
}
