// I know That I shouldn't make a push to main with comments
// but I forgot it, I'm sorry Teacher Arancha
// I ask for you teacher to don't read the comments lines since the 6 line
// I have just made all this comments as a way to relax myself
// And get out from my mind many bad toughs about give up

// I didn't get a **** of what this programm says or how it works
// This is the correction that Gemini made to a program that I passed to him for make "some corrections"
// but basiclly Gemini changed it everything
// My original programm is "comentado" down
//       ||
//       ||
//     \ || /
//      \  /
//       \/
import javax.swing.JOptionPane;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        // Fill matrix 1
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para la matriz 1:"));
            }
        }

        // Fill matrix 2
        for (int x = 0; x < 2; x++) {
            for (int k = 0; k < 2; k++) {
                matriz2[x][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para la matriz 2:"));
            }
        }

        // Perform matrix multiplication
        int[][] resultMatrix = multiMatrices(matriz1, matriz2);

        // Construct result string
        StringBuilder resultString = new StringBuilder("El resultado de la multiplicacion de las matrices es:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultString.append(resultMatrix[i][j]).append(" ");
            }
            resultString.append("\n");
        }

        // Display result
        JOptionPane.showMessageDialog(null, resultString.toString());
    }

    public static int[][] multiMatrices(int[][] matriz1, int[][] matriz2) {
        int rowsA = matriz1.length;
        int colsA = matriz1[0].length;
        int colsB = matriz2[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        // Matrix multiplication logic
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

// original programm:
//       ||
//       ||
//     \ || /
//      \  /
//       \/
// import java.lang.reflect.Array;
// import java.util.ArrayList;

// import javax.swing.JOptionPane;
// public class Matrices {
//     public static void main(String[] args) {
//         ArrayList<Integer> matriz1 = new ArrayList<Integer>();
//         ArrayList<Integer> matriz2 = new ArrayList<Integer>();

//         for (int i = 0; i < 5; i++) {
//             int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la matriz 1:"));
//             matriz1.add(n);
//         }
//         for (int x = 0; x < 5; x++) {
//             int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la matriz 2:"));
//             matriz2.add(n);
//         }
//         Array matricesMultiplicadas = multiMatrices(null, matriz1, null, matriz2);
//         JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion de las matrices es: ");
//         JOptionPane.showMessageDialog(null, matricesMultiplicadas);
//     }
//     public static Array multiMatrices(Array matriz1, Array matriz2) {
//         ArrayList<Array> matriztemp1 = new ArrayList<Array>();
//         ArrayList<Array> matriztemp2 = new ArrayList<Array>();
//         int indice = [0];
//         for (int z = 0; z < 5; z++) {
//             indice++;
//             for (int y = 0; y < 5; y++) {
//                 matriz1[indice] * matriz2[indice];
//             }
//         }
//         return matriztemp1.toString();
//         return matriztemp2.toString();
//     }
// }