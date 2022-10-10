import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {
    private int dimension; //размерность матрицы
    private int[][] matrix;

    public Matrix() {
    }

    public Matrix(int dimension) {
        this.dimension = dimension;
    }

    public Matrix(int dimension, int[][] matrix) {
        this.dimension = dimension;
        this.matrix = matrix;
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
        int[][] matrix1 = new int[nodes.length][nodes.length];
        INL.add();
        for(int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            for(int j = 0; j < nodes.length; i++) {
                Node node1 = nodes[j];
                if(INL.isContains(node.getNode(), node1.getNode()) && !node.equals(node1)) {
                    matrix1 [i][j] = 1;
                } else {
                    matrix1 [i][j] = 0;
                }
            }
        }
        Matrix matrix = new Matrix(nodes.length, matrix1);
        return matrix;
    }
}
