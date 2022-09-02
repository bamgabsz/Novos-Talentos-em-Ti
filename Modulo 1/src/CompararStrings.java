public class CompararStrings{
    public static void main(String[] args) {
        //como comprar se duas strings são iguais
        //NUNCA USE == PARA COMPARAR STRINGS EM JAVA
        String texto1 = "zezinho";

        if(texto1.equals("zezinho")){
            System.out.println("São iguais");
        }
        if(texto1.equals("Huguinho")){
            System.out.println("Não são iguais");
        }
        if(!texto1.equals("Huguinho")){
            System.out.println("São iguais mas não são");
        }

    }
}