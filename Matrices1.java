import javax.swing.JOptionPane;
public class Matrices1 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para la matriz 1:"));
            }
        }
        for (int x = 0; x < 2; x++) {
            for (int k = 0; k < 2; k++) {
                matriz2[x][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para la matriz 2:"));
            }
        }
        int[][] resultMatrix = multiMatrices(matriz1, matriz2);
        JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion de las matrices es: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiMatrices(int[][] matriz1, int[][] matriz2) {
        int rowsA = matriz1.length;
        int colsA = matriz1[0].length;
        int colsB = matriz2[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultMatrix;
    }
}