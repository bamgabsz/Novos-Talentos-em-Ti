import java.util.Scanner;

/*
49)Escreva um programa para calcular o valor da bolsa 
de estudos paga pela empresa a seus funcionários, 
utilize a tabela abaixo. De acordo com o Tipo do 
curso existe um percentual pago da bolsa, sendo que 
o valor calculado do percentual não pode superar 
o valor limite por tipo. Insira pelo menos duas 
restrições nos dados de entrada .
+-----------+---------------------+-----------------+
|   Tipo    |   Percentual Pago   |  Valor Limite   |
+-----------+---------------------+-----------------+
|  Inglês   |        40%          |    R$ 200,00    |
|  Espanhol |        40%          |    R$ 200,00    |
| Graduação |        55%          |    R$ 300,00    |
+-----------+---------------------+-----------------+
*/

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float mensalidade = 0, valBolsa=0;;
        String tipo;

        System.out.println("Digite o tipo do curso");
        tipo = leitor.nextLine();
        System.out.println("Digite o valor da mensalidade");
        mensalidade = Float.parseFloat(leitor.nextLine());

        if(tipo.equals("Inglês") || tipo.equals("Espanhol")){
            valBolsa = (mensalidade * 40f) / 100f;
            if(valBolsa > 200f){
                valBolsa = 200f;
            }
        }else{
            valBolsa = (mensalidade * 44f) / 100f;
            if(valBolsa > 300f){
                valBolsa = 300f;
            }
        }
        System.out.println("O valor da bolsa e " + valBolsa);
    }
}
