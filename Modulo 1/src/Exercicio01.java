import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numhorasdia = 0;
        int numdiasmes = 0;
        int numhorasmes = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas por dia");
        numhorasdia = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o numero de dias trabalhados por mês");
        numdiasmes = Integer.parseInt(leitor.nextLine());

        numhorasmes = numhorasdia * numdiasmes;

        System.out.println("O numero de horas no mes e: " + numhorasmes);


        
    }
}
