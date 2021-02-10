public class Excercise {
    private static int auxCount(double[] row, int min) {
        int contador = 0;
        for (int i = 0; i < row.length; i++){
            if (row[i] > min){
                contador++;
            }
        }
        return contador;
    }
    

    public static int count(double[][] mat, int min) {
        int result = 0;
        for (int i = 0; i < mat.length; i++){
               result += auxCount(mat[i], min);
        }
        return result;
    }
}