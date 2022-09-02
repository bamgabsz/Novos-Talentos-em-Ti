import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int umnumero = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero");
        umnumero = Integer.parseInt(leitor.nextLine());
        //O simbolo de % calcula o RESTO da divisão de dois numeros
        if (umnumero % 2 == 0){
            System.out.println("Numero é PAR");
        }else{
            System.out.println("Numero não é PAR");
        }
    }
}
