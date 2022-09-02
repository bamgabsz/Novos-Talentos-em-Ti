import java.util.Scanner;

/*
41)Escreva um algoritmo que calcule o número de
 páginas mínimo que um leitor deve ler para 
 terminar um livro em um determinado numero 
 de dias informado. Caso o número de paginas 
 a ler por dia for maior que 100, informe ao 
 usuário que  é impossível de realizar a leitura, 
 caso contrário apresente o número de paginas.
*/

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numPagLivro = 0;
        int numDias = 0;
        float numPagLer = 0;

        System.out.println("Digite o numero de paginas do livro");
        numPagLivro = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o numero de dias");
        numDias = Integer.parseInt(leitor.nextLine());

        numPagLer = numPagLivro / numDias;
        if(numPagLer > 100){
            System.out.println("Não é possível ler o livro");
        }else{
            System.out.println("Voce deve ler " + numPagLer + " por dia");
        }
    }
}
