import java.util.Scanner;

/*
65) Faça um algoritmo que leia um número inteiro e 
calcule o seu fatorial. Se o número for negativo, 
informe que o valor é inválido. Sabemos que o fatorial 
de um número n, representado por n!, é dado por:
n * (n-1) * (n-2) * ... * 1, para n > 0 e n! = 1 para n = 0
5! = 5 * (5-1) * (5-2) * (5-3) *   1
5! = 5 *   4   *   3   *    2  *   1
0! = 1
*/

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int fat = 0;

        System.out.println("Digite o numero do fatorial");
        fat = Integer.parseInt(leitor.nextLine());

        if(fat < 0){
            System.out.println("Valor invalido para fatorial");
        }else{
            if(fat == 0){
                System.out.println("0! = 1");
            }else{
                int resultfat=1;
                for(int i=fat;i>0;i--){
                    resultfat = resultfat * i;
                }
                System.out.println(String.format("%d! = %d",fat,resultfat));
            }
        }
    }
}
