import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int numpessoas = 0;
        int qtdcarne = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de convidados");
        numpessoas = Integer.parseInt(leitor.nextLine());

        qtdcarne = numpessoas * 250;

        System.out.println("A qtd de carne em gramas e: " + qtdcarne);

        leitor.close();
    }
}
