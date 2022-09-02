import java.util.Scanner;

public class ExemploEstruturaDeDados2 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros2[0]);

        char[] nome = {'u','n','i','v','i','l','l','e'};
        //for each - iterador
        for(char umaLetra : nome){
            System.out.println((int)umaLetra);
        }

        String nome2 = "univille";
        System.out.println(nome2.hashCode());
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());
        //STRINGS SAO IMUTÁVEIS
        nome2 = "UNIVILLE"; //string pool
        System.out.println(nome2.hashCode());

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite UNIVILLE");
        String entrada = leitor.nextLine();

        // verfique se os valores são iguais ignorando maiusculo e minusculo
        if(nome2.equalsIgnoreCase(entrada)){ 
            System.out.println("Sao iguais");
        }else{
            System.out.println("Não são iguais");
        }

    }
}
