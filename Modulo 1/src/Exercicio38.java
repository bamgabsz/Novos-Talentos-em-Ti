/**
Faça um programa que receba o preço de um produto e o seu código de origem e mostre a sua procedência. A procedência obedece a tabela a seguir:
Código de origem    Procedência
1                               Sul
2                               Norte
3                               Leste
4                               Oeste
5 ou 6                       Noroeste
7 ou 8 ou 9               Sudeste
10 a 20                     Centro-Oeste
21 a 30                     Nordeste
 */

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        float preco = 0;
        int codorigem = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço do produto");
        preco = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo da origem");
        codorigem = Integer.parseInt(leitor.nextLine());

        if(codorigem == 1){
            System.out.println("Origem SUL");
        }else{
            if(codorigem == 2){
                System.out.println("Origem NORTE");
            }else{
                if(codorigem == 3){
                    System.out.println("Origem LESTE");
                }else{
                    if(codorigem == 4){
                        System.out.println("Origem OESTE");
                    }else{
                        if(codorigem >= 5 && codorigem <= 6){
                            System.out.println("Origem NOROESTE");
                        }else{
                            if(codorigem >= 7 && codorigem <= 9){
                                System.out.println("Origem SUDESTE");
                            }else{
                                if(codorigem >= 10 && codorigem <= 20){
                                    System.out.println("Origem CENTRO-OESTE");
                                }else{
                                    if(codorigem >= 21 && codorigem <= 30){
                                        System.out.println("Origem NORDESTE");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
