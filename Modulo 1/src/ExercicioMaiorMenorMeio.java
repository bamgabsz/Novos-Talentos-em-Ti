import java.util.Scanner;

public class ExercicioMaiorMenorMeio {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo numero");
        num2 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o terceiro numero");
        num3 = Integer.parseInt(leitor.nextLine());

        if (num1 > num2) {
            // então = ESQUERDO
            if (num1 > num3) {
                System.out.println("O maior e " + num1);
                if (num2 > num3){
                    //entao
                    System.out.println("O do meio e " + num2);
                    System.out.println("O menor e " + num3);
                }else{
                    //senao (num2 > num3)
                    System.out.println("O do meio e " + num3);
                    System.out.println("O menor e " + num2);
                }
            } else {
                // senao (num1 > num3)
                System.out.println("O maior e " + num3);
                System.out.println("O do meio e " + num1);
                System.out.println("O menor e " + num2);
            }
        } else {
            // senao (num1 > num2)
            if (num2 > num3){
                //entao
                System.out.println("O maior e " + num2);
                if (num1 > num3){
                    //entao
                    System.out.println("O do meio e " + num1);
                    System.out.println("O menor e " + num3);
                }else{
                    //senao
                    System.out.println("O do meio e" + num3);
                    System.out.println("O menor e " + num1);
                }
            }else{
                //senao
                System.out.println("O maior e "+ num3);
                System.out.println("O do meio e "+ num2);
                System.out.println("O menor e "+ num1);
            }
        }
    }
}
