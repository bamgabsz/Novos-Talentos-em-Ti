import java.util.Scanner;

/*
Um trabalhador recebeu seu salário e depositou em 
sua conta corrente bancária. Esse trabalhador emitiu
dois cheques e agora deseja saber seu saldo atual. 
Sabe-se que cada operação bancária de retirada paga 
CPMF de 0,38% e o saldo inicial da conta esta zerado.
ENTRADA
- valsalario
- valcheque1
- valcheque2

PROCESSAMENTO
valcpmf1 = (valcheque1 * 0.38) / 100
valcpmf2 = (valcheque2 * 0.38) / 100
saldoatual = valsalario - (valcheque1 + valcpmf1 + valcheque2 + valcpmf2)

SAIDA
- saldoatual
*/

public class Exercicio25 {
    public static void main(String[] args) {
        float valsalario = 0;
        float valcheque1 = 0;
        float valcheque2 = 0;
        float valcpmf1 = 0;
        float valcpmf2 = 0;
        float saldoatual = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salario");
        valsalario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do cheque 1");
        valcheque1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do cheque 2");
        valcheque2 = Float.parseFloat(leitor.nextLine());

        valcpmf1 = (valcheque1 * 0.38f) / 100f;
        valcpmf2 = (valcheque2 * 0.38f) / 100f;
        saldoatual = valsalario - (valcheque1 + valcpmf1 + valcheque2 + valcpmf2);
        System.out.println("O saldo atual e " + saldoatual);
    }
}
