package Task_7_8;

public class MinMax <E extends Comparable<E>> {
    private E[][] matrix;
    public MinMax(E[][] matrix) {
        this.matrix = matrix.clone();
    }
    public E Min() {
        E min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].compareTo(min) > 0) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    public E Max() {
        E max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].compareTo(max) < 0) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
