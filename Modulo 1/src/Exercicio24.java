import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        int numhorastrab=0;
        float salminimo=0;
        float valhora=0;
        float salbruto=0;
        float valimposto=0;
        float salreceber=0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o num de horas trabalhadas");
        numhorastrab = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salario minimo");
        salminimo = Float.parseFloat(leitor.nextLine());

        valhora = salminimo / 2f;
        salbruto = numhorastrab * valhora;
        valimposto = (salbruto * 3f) / 100f;
        salreceber = salbruto - valimposto;
        System.out.println("O salario a receber e" + salreceber);
    }
}
