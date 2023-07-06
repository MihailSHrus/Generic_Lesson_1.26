package Task_7_8;
public class GenericMatrix <E extends Number> {
    private E[][] matrix;
    public GenericMatrix() { }
    public GenericMatrix(E[][] in) {
        this.matrix = in.clone();
    }
    // Блок методов
    public Double[][] sumMatrix(E[][] matrix2) {
        Double[][] result = new Double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = matrix[i][j].doubleValue() + matrix2[i][j].doubleValue();
            }
        }
        return result;
    }
    public Double[][] multiplyNumMatrix(int num) {
        Double[][] result = new Double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = matrix[i][j].doubleValue() * num;
            }
        }
        return result;
    }
    public static <E extends Number> void printMatrix(E[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    System.out.printf("%.4s" +" ", matrix[i][j]);
                }
            System.out.println("");
            }
        }
    }
