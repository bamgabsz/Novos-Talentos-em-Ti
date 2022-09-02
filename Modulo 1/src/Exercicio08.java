import java.util.Scanner;

public class Exercicio08{
    public static void main(String[] args) {
        float umnumero = 0;
        int numinteiro = 0;
        float numdecimal = 0;
        int numarredondado = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero REAL");
        umnumero = Float.parseFloat(leitor.nextLine());
        //Conversão de tipo float para int (com perda de info)
        numinteiro = (int)umnumero;
        numdecimal = umnumero % 1; 
        //numdecimal = umnumero - numinteiro
        numarredondado = Math.round(umnumero);

        System.out.println("O valor inteiro é: " + numinteiro);
        System.out.println("O valor decimal é: " + numdecimal);
        System.out.println("O valor arredondado é: " + numarredondado);

    }
}