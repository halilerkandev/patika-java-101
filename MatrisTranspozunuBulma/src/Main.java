// Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
//
//Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer
// değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur
// (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
// Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
//
//Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpoze = new int[matris[0].length][matris.length];

        for(int i = 0; i < matris.length; i++) {
            for(int j = 0; j < matris[0].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris :");
        for(int i = 0; i < matris.length; i++) {
            for(int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.print("\n");
        }

        System.out.println("Transpoze :");
        for(int i = 0; i < transpoze.length; i++) {
            for(int j = 0; j < transpoze[0].length; j++) {
                System.out.print(transpoze[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
