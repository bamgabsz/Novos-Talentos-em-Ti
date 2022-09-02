import java.util.Scanner;

/*
45)Escreva um algoritmo que calcule o valor
 de desconto que será oferecido ao comprador
 de uma loja de acordo com o valor da compra:
 compras até R$100 desconto de 5%, compras
 maiores que R$ 100 e ate R$400 desconto de
 10%, e acima de R$ 400 desconto de 13%. Após 
 o calculo do valor com desconto, acrescente o
 valor da taxa de entrega que é de R$ 1,5 
 por item comprado.
*/

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float valCompra = 0, valDesconto=0, valFinal=0;
        int qtdItens = 0;

        System.out.println("Digite o valor da compra");
        valCompra = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a qtd de itens");
        qtdItens = Integer.parseInt(leitor.nextLine());

        if(valCompra <= 100){
            valDesconto = (valCompra * 5f) / 100f;
        }else{
            if(valCompra > 100 && valCompra <= 400){
                valDesconto = (valCompra * 10f) / 100f;
            }else{
                if(valCompra >= 400){
                    valDesconto = (valCompra * 13f) / 100f;
                }
            }
        }
        System.out.println("O valor do desconto e " + valDesconto);
        valFinal = (valCompra - valDesconto) + (1.5f * qtdItens);
        System.out.println("O valor final e " + valFinal);
    }
}
