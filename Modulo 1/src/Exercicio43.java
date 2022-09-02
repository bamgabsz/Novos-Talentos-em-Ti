import java.util.Scanner;

/*
43)Escreva um algoritmo que calcule o numero 
de prateleiras necessárias para guardar uma 
quantidade informada de livros. Considerando 
que em média uma prateleira comporta 32 livros.

*/
public class Exercicio43 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numLivros = 0;
        float qtdPrateleiras = 0;
        System.out.println("Digite a quantidade de livros");
        numLivros = Integer.parseInt(leitor.nextLine());

        qtdPrateleiras = numLivros / 32f;
        System.out.println("Serão necessárias " + qtdPrateleiras + " prateleiras");

    }    
}
