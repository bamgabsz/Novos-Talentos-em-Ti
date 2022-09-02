import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        int idade = 0;
        //System.in - receba dados do buffer de teclado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade");
        idade = Integer.parseInt(leitor.nextLine());
        if (idade >= 18) {
            //então (sim - verdade)
            System.out.println("Maior de idade");
        }else{
            //senão (não - false)
            System.out.println("Não é maior de idade");
        }

    }
}
