import java.util.Scanner;

/*
46)Construa um algoritmo que calcule o 
consumo de combustível de um veículo qualquer 
baseado nas informações de quilometragem  
inicial e final de um percurso, e a quantidade 
de gasolina consumida em litros. Caso o consumo 
esteja entre 10 e 16 litros/km mostre a 
mensagem “consumo normal”, caso seja maior que 
16 litros/km apresente a mensagem “consumo anormal”.
*/

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float kminicial=0;
        float kmfinal=0;
        float distancia = 0;
        float qtdGasolina=0;
        float consumo=0;

        System.out.println("Digite a Km Inicial");
        kminicial = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a Km Final");
        kmfinal = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a qtd de gasolina");
        qtdGasolina = Float.parseFloat(leitor.nextLine());
        distancia = kmfinal - kminicial;

        consumo = qtdGasolina / distancia;
        System.out.println("Consumo " + consumo);
        if( consumo >= 10 && consumo <= 16){
            System.out.println("Consumo normal");
        }else{
            if( consumo > 16){
                System.out.println("Consumo anormal");
            }
        }
    }
}
