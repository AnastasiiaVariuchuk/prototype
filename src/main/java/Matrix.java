import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    private int dimension; //размерность матрицы
    private int[][] matrix;

    public Matrix(int dimension) {
        this.dimension = dimension;
        this.matrix = new int[this.dimension][this.dimension];;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "dimension=" + dimension +
                ", matrix=" + Arrays.toString(matrix) +
                '}';
    }

    public Matrix matrixFilling(Node[] nodes) {
        return null;
    }
}
