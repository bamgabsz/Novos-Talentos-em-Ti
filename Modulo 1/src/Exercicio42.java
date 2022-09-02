import java.util.Scanner;

/*
42) Escreva um algoritmo que calcule o 
valor da multa (em UFIR) que um motorista 
deve receber de acordo com a velocidade 
de seu carro. Acima de 60km/h e ate 100km/h 
multa media 60 UFIR, acima de 100 km/h até 
160km/h grave 120 UFIR, e acima de 160km/h 
gravíssima 180 UFIR
*/

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        float velocidade = 0;

        System.out.println("Digite a velocidade");
        velocidade = Float.parseFloat(leitor.nextLine());

        if(velocidade > 60 && velocidade <= 100){
            System.out.println("Multa de 60 ufir");
        }else{
            if(velocidade > 100 && velocidade <= 160){
                System.out.println("Multa de 120 ufir");
            }else{
                if(velocidade > 160 ){
                    System.out.println("Multa de 180 ufir");
                }
            }
        }
    }
}
