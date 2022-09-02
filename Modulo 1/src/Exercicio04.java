import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int numfotos=0;
        float valortotal = 0f;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de fotos");
        numfotos = Integer.parseInt(leitor.nextLine());

        valortotal = numfotos * 0.9f;

        System.out.println("O valor total e: " + valortotal);

    }
}
