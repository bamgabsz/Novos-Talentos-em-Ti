import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerTexto {
  public static void main(String[] args) {
      
        try{
            Scanner leitor = new Scanner(new File("./src/arquivo.csv"));
            while(leitor.hasNext()){
                //System.out.println(leitor.nextLine());
                for(String umValor : leitor.nextLine().split(";")){
                    System.out.println(umValor);
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
  }  
}
