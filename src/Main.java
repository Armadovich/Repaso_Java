// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        char[] array = {'a', 's', 'd', 'f'};
        System.out.println(getSentence(array));
    }

    public static int countContainWords(String[] phrases, String words){
        int contador = 0;
        for (int i = 0; i < phrases.length; i++) {
            if (phrases[i].toLowerCase().contains(words.toLowerCase())){
                contador++;
            }
        }
        return contador;
    }

    public static double getFinalNum(int num, double percentage){

        double numPercentage = (num * percentage) / 100;

        if (numPercentage < 1000 && numPercentage > 100) return numPercentage/3;
        else if (numPercentage < 100 && numPercentage > 10) return numPercentage;
        else if (numPercentage < 10)return numPercentage * 3;
        else return numPercentage;
    }

    public static int[] getFirstRow(int[][] matrix, int columns){
        int[] array= new int[columns];
        for (int i = 0; i < columns; i++) {
            array[i] = matrix[0][i];
        }
        return array;
    }

    public static int[] getMinColumNum(int[][] matrix){
        int num = 0;
        int[] array = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int numeroMax = 999999999;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < numeroMax) array [i] = matrix[j][i];
            }
        }
        return array;
    }

    public static int[] getMaxNums(int[][] matrix){
        int contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 10) contador++;
            }
        }

        int[] resultado = new int[contador];
        contador = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 10) {
                    resultado[contador] = matrix[i][j];
                    contador++;
                }
            }
        }
        return resultado;
    }

    public static int getMax(int[] array){
        int maxnum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxnum) maxnum = array[i];
        }
        return maxnum;
    }

    public static String getSentence(char[] array){
        String word = "";
        for (int i = 0; i < array.length; i++) {
            word += array[i];
        }
        return word;
    }
    public static boolean checkWord(char[] array, String secuencia){
        return getSentence(array).contains(secuencia);
    }

    public static boolean checkWords(char[] array, String[] arrayString){
        for (int i = 0; i < arrayString.length; i++) {
            if (!getSentence(array).contains(arrayString[i])) return false;
        }
        return true;
    }

    public static boolean checkSentence(char[] array, String sentence){
        return getSentence(array).equalsIgnoreCase(sentence);
    }
}