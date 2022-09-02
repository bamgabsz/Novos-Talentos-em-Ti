/*
59) Elaborar um programa que apresente os valores
 de conversão de graus Celsius em Fahrenheit, 
 de 10 em 10 graus, iniciando a contagem em 
 10 graus Celsius e finalizando em 100 graus Celsius. 
 O programa deverá apresentar os valores das duas 
 temperaturas.
ENTRADA
NAO TEM!!!

PROCESSAMENTO
- Gerar temperaturas em celsius de 10 ate 100 (passo/step 10)
F = (c * 1.8) + 32

SAIDA
- Temp em Celsius e Fahrenheit
*/

public class Exercicio59 {
    public static void main(String[] args) {
        //tempc += 10
        //tempc = tempc + 10
        for(int tempc = 10; tempc <= 100; tempc += 10){
            float tempf = (tempc * 1.8f) + 32f;
            System.out.println(
                String.format("Celsius %d - Fahrenheit %.2f", tempc, tempf));
            //System.out.println("Celsius " + tempc + " Fahrenheit " + tempf);
        }
    }
}
