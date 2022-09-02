import java.util.Scanner;

/*
51)Faça um programa que receba o número de horas 
trabalhadas, o valor do salário mínimo e o 
número de horas extras trabalhadas. Calcule e 
mostre o salário a receber seguindo as regras abaixo:
a)    a hora trabalhada vale 1/8 do salário mínimo;
b)    a hora extra vale ¼ do salário mínimo;
c)    o salário bruto equivale ao número de 
horas trabalhadas multiplicado pelo valor 
da hora trabalha (apresente o valor para o usuário);
d)    a quantia a receber pelas horas extras 
equivale ao número de horas extras trabalhadas 
multiplicado pelo valor da hora extra (apresente 
o valor para o usuário);
e)    o salário a receber equivale ao salário 
bruto mais a quantia a receber pelas horas 
extras(apresente o valor para o usuário);
*/

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numHorasTrab = 0;
        float valSalarioMin=0;
        float numHorasExtras = 0;
        float valHoraTrab=0;
        float valHorasExtras=0;
        float valSalBruto=0;
        float valSalBrutoExtra=0;
        float valSalReceber=0;

        System.out.println("Digite o numero de horas trabalhadas");
        numHorasTrab = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o numero de horas extras trabalhadas");
        numHorasExtras = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salario minimo");
        valSalarioMin = Float.parseFloat(leitor.nextLine());
        valHoraTrab = valSalarioMin / 8f;
        System.out.println("O valor da hora trabalhada e " + valHoraTrab);
        valHorasExtras = valSalarioMin / 4f;
        System.out.println("O valor da hora extra trabalhada e " + valHorasExtras);

        valSalBruto = valHoraTrab * numHorasTrab;
        System.out.println("O valor do salario bruto e " + valSalBruto);
        valSalBrutoExtra = valHorasExtras * numHorasExtras;
        System.out.println("O valor das horas extras e " + valSalBrutoExtra);
        valSalReceber = valSalBruto + valSalBrutoExtra;
        System.out.println("O salario a receber e " + valSalReceber);

    }
}
