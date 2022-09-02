import java.util.Arrays;

/**
 * 80) Faça um programa que carregue dois vetores 
 * de dez elementos numéricos cada um e mostre um 
 * vetor resultante da intercalação desses dois 
 * vetores.
 */

public class Exercicio80 {
    public static void main(String[] args) {
        int[] A = {10,20,30,40,50,60,70,80,90,100};
        int[] B = {110,120,130,140,150,160,170,180,190,200};
        int[] R = new int[20];
        int proxlivre = 0;
        for(int i=0;i<10;i++){
            R[proxlivre] = A[i];
            proxlivre = proxlivre + 1;
            R[proxlivre] = B[i];
            proxlivre = proxlivre + 1;
        }
        System.out.println(Arrays.toString(R));

    }
}
