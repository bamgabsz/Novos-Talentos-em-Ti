

/*
Faça um programa que calcule o valor da multa por 
atraso de pagamento de um boleto bancário. Solicite 
o valor do boleto e o percentual de multa. 

ENTRADAS
- valboleto (R$)
- percmulta (%)

PROCESSAMENTO
    R$          %
valboleto ---- 100
valmulta  ---- percmulta

valmulta * 100 = valboleto * percmulta

valmulta = (valboleto * percmulta) / 100 

SAIDA
- valmulta
*/
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        float valboleto = 0, valmulta = 0, percmulta = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do boleto?");
        valboleto = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual da multa");
        percmulta = Float.parseFloat(leitor.nextLine());

        valmulta = (valboleto * percmulta) / 100f;

        System.out.println("O valor da multa é: R$" + valmulta);
    }
}
