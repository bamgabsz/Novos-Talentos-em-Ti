import java.util.Scanner;

public class ExemploBlocoRepeticao {
    public static void main(String[] args) {
        // enquanto
        int contador = 0;
        while (contador <= 10) {
            System.out.println("rodando... " + contador);
            //operador de incremento pós fixado
            //contador = contador + 1
            //contador += 1
            contador++;
        }
        contador = 10;
        //VOCE NUNCA SABE QUANTAS VEZES ELE VAI REPETIR
        while(contador >= 0){
            System.out.println("rodando... " + contador);
            contador--;
        }

        int resposta = 5;
        Scanner leitor = new Scanner(System.in);
        //VOCE NUNCA SABE QUANTAS VEZES ELE VAI REPETIR
        do{
            System.out.println("sim eu vou entrar pelo menos uma vez");
            System.out.println("Digite o numero 5");
            //resposta = Integer.parseInt(leitor.nextLine());
            if(resposta != 5){
                //if(resposta != 5) continue; - pula a repetição atual do bloco e continua
                System.out.println("Valor invalido");
                //break; - quebra o bloco de repetição mais próximo
            }
        }while(resposta != 5);
        //contador = contador + 2
        //contador += 2
        //             for ( inicializar ; condição de repetição ; incre/decre ) { corpo }
        //primeira vez           1                   2
        //nas outras vezes                           2                  1
        //SEMPRE SABE QUANTAS VEZES VAI REPETIR
        for(int i=0; i<5; i++){
            System.out.println("FOR " + i);
        }

    }
}
