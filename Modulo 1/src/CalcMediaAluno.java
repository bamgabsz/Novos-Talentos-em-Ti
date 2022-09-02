import java.util.Scanner;

public class CalcMediaAluno {
    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIÁVEIS
        //float nota1=0, nota2=0, nota3=0, nota4=0, media=0;
        //float nota1=0, nota2=0, nota3=0, nota4=0;
        //VARIAVEL - TIPO NOME = VALOR;
        final float nota1, nota2, nota3, nota4;
        float percPresenca = 0;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        //conversao entre tipo objeto pra tipo primitivo
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o percentual de presença do aluno");
        //converte o texto digitado (nextLine) de String para um primitivo float
        percPresenca = Float.parseFloat(leitor.nextLine());
        
        //CONSTANTE = modificador final
        //"tipo" a palavra VAR permite que o JAVA
        //crie a variável com o tipo do valor
        //que foi ATRIBUIDO no código
        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f;
        
        //Comparação entre valores

        //REGRA aluno aprovado = media >= 7
        //REGRA aluno aprovado = percPrenca >= 75
        //AND && - OR || - NOT !
        boolean situacao = media >= 7  && percPresenca >= 75;

        //media = 0;
        System.out.println(situacao);
        System.out.println("Situação: " + (situacao?"Aprovado":"Reprovado"));
        System.out.println("A media do aluno e " + media);
        
        leitor.close();

    }
}
