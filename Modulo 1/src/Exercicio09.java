import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        float precoproduto = 0;
        float valdesc = 0;
        float novopreco = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        precoproduto = Float.parseFloat(leitor.nextLine());

        
        valdesc = (precoproduto * 10f) / 100f;
        novopreco = precoproduto - valdesc;

        System.out.println("O novo preço é: " + novopreco);

    }
}
