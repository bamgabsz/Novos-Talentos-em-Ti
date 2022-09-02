import javax.swing.JOptionPane;

public class TesteJanelinha {
    public static void main(String[] args) {
        StringBuilder tabelinha = new StringBuilder();
        tabelinha.append("<html>");
        tabelinha.append("<table border='1'>");
        tabelinha.append("<tr>");
        tabelinha.append("<td> NAO TRANCA O CURSO POR FAVOR!!!!</td>");
        tabelinha.append("<td> MAS VAI PIORAR MUITO AINDA</td>");
        tabelinha.append("</tr>");
        tabelinha.append("<tr>");
        tabelinha.append("<td> primeira coluna</td>");
        tabelinha.append("<td> segunda coluna</td>");
        tabelinha.append("</tr>");
        tabelinha.append("</table>");
        tabelinha.append("</html>");
        JOptionPane.showMessageDialog(null, tabelinha.toString());
        
    }
}
