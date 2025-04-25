public class DiagonalesMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 4, 6, 8},
            {3, 6, 9, 12},
            {4, 8, 12,16 },
            {5, 10, 15, 20}
        };

        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("nDiagonal secundaria:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
    }
}