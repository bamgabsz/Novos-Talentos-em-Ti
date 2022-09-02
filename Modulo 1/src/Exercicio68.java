import java.util.Scanner;

/*
68) Faça um algoritmo que calcule a média de 
todas as turmas de uma escola (media da escola).
Considere como entradas o número de turmas 
e o número de alunos de cada turma. 
A média de cada turma deve ser apresentada, além da média
 geral, que será o resultado da média das turmas.
*/

public class Exercicio68 {
    public static void main(String[] args) {
        int numturmas = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de turmas");
        numturmas = Integer.parseInt(leitor.nextLine());
        float somanotasturmas=0;
        for(int contaturma=0; contaturma < numturmas; contaturma++){
            System.out.println("TURMA NUMERO: " + (contaturma + 1));
            System.out.println("Digite o numero de alunos");
            int numalunos = Integer.parseInt(leitor.nextLine());
            float somanotas=0;
            for(int contaaluno=0; contaaluno < numalunos; contaaluno++){
                System.out.println("ALUNO NUMERO: " + (contaaluno + 1));
                System.out.println("Digite a sua media");
                float media = Float.parseFloat(leitor.nextLine());
                somanotas += media;
            }
            float mediaturma = somanotas / numalunos;
            somanotasturmas += mediaturma;
            System.out.println("A media da turma e: " + mediaturma);
        }
        float mediaescola = somanotasturmas / numturmas;
        System.out.println("A media da escola e: " + mediaescola);
    }
}
