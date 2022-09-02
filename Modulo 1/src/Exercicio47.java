import java.util.Scanner;

/*
47)Escreva um algoritmo que calcule o 
valor de Imposto de Renda que uma Pessoa 
Física deve pagar de acordo com o valor 
total de seu rendimento anual: abaixo de 
R$19.200 isento, acima deste valor e até 
R$30.000 8%. Mais que R$30.000 anuais 11%.
*/

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float totRendimento = 0;
        float valImposto = 0;

        System.out.println("Digite o valor total do seu rendimento");
        totRendimento = Float.parseFloat(leitor.nextLine());

        if(totRendimento <= 19200f){
            valImposto = 0;
        }else{
            if(totRendimento > 19200f && totRendimento < 30000f){
                valImposto = (totRendimento * 8f) / 100f;
            }else{
                valImposto = (totRendimento * 11f) / 100f;
            }
        }
        System.out.println("O valor do imposto e " + valImposto);
    }
}
