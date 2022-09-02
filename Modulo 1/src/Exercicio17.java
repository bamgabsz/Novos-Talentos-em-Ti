import java.util.Scanner;

/*
João recebeu seu salário e precisa pagar duas 
contas atrasadas. Em razão do seu atraso, ele 
deverá pagar multa de 2% sobre cada conta. 
Faça um programa que calcule e mostre quanto 
restará do salário de João.
ENTRADAS
- valsalario
- valconta1
- valconta2

PROCESSAMENTO
valmulta1 = (valconta1 * 2) / 100
valmulta2 = (valconta2 * 2) / 100
valsalario = valsalario - (valconta1 
+ valconta2 + valmulta1 + valmulta2)

SAIDA
-valsalario

*/

public class Exercicio17 {
    public static void main(String[] args) {
        float valsalario = 0;
        float valconta1 = 0;
        float valconta2 = 0;
        float valmulta1 = 0;
        float valmulta2 = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salario do João");
        valsalario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da primeira conta");
        valconta1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da segunda conta");
        valconta2 = Float.parseFloat(leitor.nextLine());

        valmulta1 = (valconta1 * 2f) / 100f;
        valmulta2 = (valconta2 * 2f) / 100f;
        //valsalario = valsalario - (valconta1 + valconta2 + valmulta1 + valmulta2)
        valsalario -= (valconta1 + valconta2 + valmulta1 + valmulta2);

        System.out.println("O salario restante e: " + valsalario);


    }
}
