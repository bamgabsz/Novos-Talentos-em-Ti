import java.util.Scanner;

public class ExercicioIdades {
    public static void main(String[] args) {
        int idade = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade <= 20){
            //ENTAO
            System.out.println("JOVEM");
        }else{
            //SENAO
            if(idade <= 60){
                System.out.println("ADULTA");
            }else{
                System.out.println("IDOSO");
            }
        }
        /*if (idade > 0 && idade <=20){
            System.out.println("JOVEM");
        }
        if (idade > 20 && idade <= 60){
            System.out.println("ADULTO");
        }
        if (idade > 60){
            System.out.println("IDOSO");
        }*/
        /*if (idade <= 20){
            System.out.println("JOVEM");
        }else if (idade <=60){
            System.out.println("ADULTO");
        }else {
            System.out.println("IDOSO");
        }*/
    }
}

