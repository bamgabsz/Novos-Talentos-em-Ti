import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        float distancia = 0;
        float qtdlitros = 0;
        float valreembolso = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida");
        distancia = Float.parseFloat(leitor.nextLine());

        qtdlitros = distancia / 13;
        valreembolso = qtdlitros * 2.20f;

        System.out.println("O valor do reembolso e: R$ " + valreembolso);
        leitor.close();
    }
}
