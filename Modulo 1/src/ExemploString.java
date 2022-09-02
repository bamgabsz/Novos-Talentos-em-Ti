
import java.util.Arrays;
public class ExemploString {
    public static void main(String[] args) {
        String texto = "Universidade da Região de Joinville";
        char[] textoarray = texto.toCharArray();
        System.out.println(Arrays.toString(textoarray));
        // retorna um caracter na posição informada
        System.out.println(texto.charAt(0));
        // troca um ou mais caracteres por outros caracteres
        // STRING SAO OBJETOS IMUTAVEIS
        //System.out.println(texto.replace(" ", ","));
        texto = texto.replace(" ", ",");
        System.out.println(texto);
        //corta o texto
        System.out.println(texto.substring(26, 35));
        //Quantos caracteres tem no texto
        System.out.println(texto.length());
        System.out.println(Arrays.toString(texto.split(",")));

        String outroTexto = " \"no meio\" ";
        System.out.println(outroTexto);


        
        
    }
}
