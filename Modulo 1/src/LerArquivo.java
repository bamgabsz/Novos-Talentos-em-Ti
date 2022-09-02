import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) {
        ArrayList<Dado> listaDeDados = new ArrayList<>();
        //Bloco de codigo que lê o arquivo
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyHH:mm");
            Scanner leitor = new Scanner(new File("./src/outroarquivo.csv"));
            leitor.nextLine(); //pulando a primeira linha (menos um panda no mundo)
            while(leitor.hasNext()){
                String[] linhaArquivo = leitor.nextLine().replace("\"","").split(","); //aqui foi outro panda....
                float mult = Float.parseFloat(linhaArquivo[0]);
                String  resul = linhaArquivo[1];
                Date data;
                data = sdf.parse(linhaArquivo[2]+linhaArquivo[3]);
                listaDeDados.add(new Dado(mult,resul,data));
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
        //Bloco de código que lista os dados
        for(var umDado : listaDeDados){
            System.out.println(umDado.getMultiplicador());
            System.out.println(umDado.getResultado());
            System.out.println(umDado.getData());
        }
    }
}
class Dado{
    private float multiplicador;
    private String resultado;
    private Date data;

    public Dado(float multiplicador, String resultado, Date data) {
        this.multiplicador = multiplicador;
        this.resultado = resultado;
        this.data = data;
    }
    public float getMultiplicador() {
        return multiplicador;
    }
    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    
}