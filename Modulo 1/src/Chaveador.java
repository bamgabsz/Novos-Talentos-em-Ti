public class Chaveador{
    public static void main(String[] args) {
        int opcao = -1;

        if (opcao == 0) {
            //entao - sim - verdadeiro
            System.out.println("IF: Valor ZERO");
        } else {
            //senao - nao - falso
            if(opcao == 1){
                System.out.println("IF: Valor é um");
            } else {
                if (opcao == -1){
                    System.out.println("IF: Valor negativo");
                }
            }
        }
        switch (opcao) {
            case -1: case -2: case -3: case -4: case-5:
                System.out.println("SWITCH: valor negativo");
            break;
        
            case 0:
                System.out.println("SWITCH: Valor ZERO");
            break;

            case 1:
                System.out.println("SWITCH: valor é um");
            break;

            default:
                System.out.println("Nenhum dos casos anteriores!");
            break;
        }



    }
}