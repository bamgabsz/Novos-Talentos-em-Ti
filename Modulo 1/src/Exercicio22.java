import java.util.Scanner;

/*
Faça um programa que receba o salário-base de um 
funcionário, calcule e mostre o seu salário a receber, 
sabendo-se que esse funcionário tem gratificação de 
R$ 50,00 e paga imposto de 10% sobre o salário-base. 
ENTRADA
- salariobase
PROCESSAMENTO
- valimposto
    R$            %
salariobase      100
valimposto        10
valimposto * 100 = salariobase * 10
valimposto = (salariobase * 10) / 100

salreceber = (salariobase + 50) - valimposto
SAIDA
-salreceber
*/

public class Exercicio22 {
    public static void main(String[] args) {
        float salariobase =0;
        float valimposto = 0;
        float salreceber = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salario base");
        salariobase = Float.parseFloat(leitor.nextLine());
        
        valimposto = (salariobase * 10f) / 100f;
        salreceber = (salariobase + 50f) - valimposto;

        System.out.println("O salario a receber e " + salreceber);
    }
}
