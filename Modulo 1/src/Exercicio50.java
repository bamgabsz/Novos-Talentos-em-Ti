

/*
50)Em uma eleição sindical concorreram ao cargo 
de presidente três candidatos (A, B e C). Escreva 
um programa que solicite a quantidade de votos de 
cada candidato, a quantidade de votos nulos e votos 
em branco. Calcule o percentual DE CADA CANDIDATO em 
relação ao total de votos válidos. E o percentual de 
votos nulos e votos em branco do total geral de votos.
*/
import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int votosA=0, votosB=0, votosC=0, votosBranco=0, votosNulos=0;
        float percVotosA=0, percVotosB=0, percVotosC=0, 
            percVotosBranco=0, percVotosNulos=0;
        int totalValidos = 0, totalGeral = 0;

        System.out.println("Digite a qtd votos de A");
        votosA = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a qtd votos de B");
        votosB = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a qtd votos de C");
        votosC = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a qtd votos em Branco");
        votosBranco = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a qtd votos Nulos");
        votosNulos = Integer.parseInt(leitor.nextLine());

        totalValidos = votosA + votosB + votosC;
        totalGeral = votosA + votosB + votosC + votosBranco + votosNulos;

        percVotosA = (totalValidos * votosA) / 100f;
        percVotosB = (totalValidos * votosB) / 100f;
        percVotosC = (totalValidos * votosC) / 100f;
        percVotosBranco = (totalGeral * votosBranco) / 100f;
        percVotosNulos = (totalGeral * votosNulos) / 100f;

        System.out.println("O perc de votos de A e " + percVotosA);
        System.out.println("O perc de votos de B e " + percVotosB);
        System.out.println("O perc de votos de C e " + percVotosC);
        System.out.println("O perc de votos em Branco e " + percVotosBranco);
        System.out.println("O perc de votos Nulos e " + percVotosNulos);
    }
}
