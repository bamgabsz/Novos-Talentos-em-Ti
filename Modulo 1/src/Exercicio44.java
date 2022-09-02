import java.util.Scanner;

/*
44)Escreva um algoritmo que calcule o valor
 de uma chamada de telefone. Deverá ser 
 informado a quantidade de minutos falados 
 durante a ligação além de sua origem. 
 Considere que uma ligação “local” custa 
 R$0.020, ligação “intermunicipal” R$0,08 
 e “interestadual” R$0,1.
*/

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String origem = null;
        int qtdMinutos=0;
        float preco = 0;

        System.out.println("Digite a origem da chamada");
        origem = leitor.nextLine();
        System.out.println("Digite a qtd de minutos");
        qtdMinutos = Integer.parseInt(leitor.nextLine());

        if(origem.equals("local")){
            preco = 0.02f * qtdMinutos;
        }else{
            if(origem.equals("intermunicipal")){
                preco = 0.08f * qtdMinutos;
            }else{
                if(origem.equals("interestadual")){
                    preco = 0.1f * qtdMinutos;
                }
            }
        }
        System.out.println("O preco da ligação e " + preco);

    }
}
