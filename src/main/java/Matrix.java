import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void print() {
        for(int i = 0; i < dimension; i++) {
            List<Integer> integerList = new ArrayList<>();
            for(int j = 0; j < dimension; j++) {
                integerList.add(matrix[i][j]);
            }
            System.out.println(integerList);
        }
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
        for(int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            for(int j = 0; j < nodes.length; j++) {
                Node node1 = nodes[j];
                NodeAndLink nodeAndLink = new NodeAndLink(0, node, node1.nodeToLink());
                if (INL.find(nodeAndLink) != null) {
                    matrix1[i][j] = 1;
                } else {
                    matrix1 [i][j] = 0;
                }
            }
        }
        Matrix matrix = new Matrix(nodes.length, matrix1);
        return matrix;
    }
}
