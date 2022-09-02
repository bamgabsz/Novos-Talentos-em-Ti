import java.util.Scanner;

/*
Sabe-se que, para iluminar de maneira correta os cômodos
de uma casa, para cada metro quadrado, deve-se usar 
18Watts de potência. Faça um programa que receba as 
duas dimensões de um cômodo (em metros), calcule e  
mostre a sua área (em metros quadrados) e a potência de 
iluminação que deverá ser utilizada.
ENTRADAS
-largura
-comprimento

PROCESSAMENTO
area = largura * comprimento
potencia = 18 * area

SAIDA
-area
-potencia
*/

public class Exercicio19 {
    public static void main(String[] args) {
        float largura = 0;
        float comprimento = 0;
        float area = 0;
        float potencia = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a largura");
        largura = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o comprimento");
        comprimento = Float.parseFloat(leitor.nextLine());

        area = largura * comprimento;
        potencia = 18f * area;

        System.out.println("A area é " + area);
        System.out.println("A potencia é " + potencia);

    }
}
