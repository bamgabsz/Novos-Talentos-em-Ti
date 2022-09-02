

/*
33)Faça um programa que receba:
    - o código de um produto comprado, supondo que a digitação do 
código do produto seja sempre válida, isso é, um número inteiro entre 1 e 10;
    - o peso do produto em quilos;
    - o código do país de origem, supondo que a digitação do 
código seja sempre válida, isso é, um número inteiro entre 1 e 3.

Tabelas:
Código do produto    Preço por grama
1 a 4                    R$ 10,00 
5 a 7                    R$ 25,00 
8 a 10                   R$ 35,00                                                                                        

Código do país de origem    Imposto
1                              0%
2                              15%
3                              25%

Calcule e mostre:
- o peso do produto convertido em gramas;
- o preço total do produto comprado;
- o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto comprado e depende do país de origem;
- o valor total, preço total do produto mais imposto.
*/
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        int codproduto=0;
        float pesokg = 0;
        float pesoemgramas = 0;
        int codpais = 0;
        float preco = 0;
        float precoTotal = 0;
        float percImpto=0, valImpto=0;
        float valFinal = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o codigo do produto (1 a 10)");
        codproduto = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o peso do produto em KG");
        pesokg = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo do pais (1 a 3)");
        codpais = Integer.parseInt(leitor.nextLine());
        pesoemgramas = pesokg * 1000f;
        System.out.println("O peso em gramas e " + pesoemgramas);

        if(codproduto >= 1 && codproduto <= 4){
            preco = 10f;
        }else{
            if(codproduto >= 5 && codproduto <= 7){
                preco = 25f;
            }else{
                preco = 35f;
            }
        }
        System.out.println("O preço por grama e " + preco);
        precoTotal = pesoemgramas * preco;
        System.out.println("O preço total " + precoTotal);
        if (codpais == 1) {
            percImpto = 0;
        }else{
            if(codpais == 2){
                percImpto = 15;
            }else{
                percImpto = 25;
            }
        }
        valImpto = (precoTotal * percImpto) / 100;
        System.out.println("O valor do imposto e " + valImpto);
        valFinal = precoTotal + valImpto;
        System.out.println("O preço total final é R$ " + valFinal);
    }
}
