public class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;


    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }


    public int getRows() {
        return rows;
    }


    public int getColumns() {
        return columns;
    }


    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position");
        }
    }


    public Matrix addMatrix(Matrix otherMatrix) {
        if (this.rows == otherMatrix.rows && this.columns == otherMatrix.columns) {
            Matrix resultMatrix = new Matrix(rows, columns);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    resultMatrix.elements[i][j] = this.elements[i][j] + otherMatrix.elements[i][j];
                }
            }

            return resultMatrix;
        } else {
            System.out.println("Not Added");
            return null;
        }
    }


    public Matrix multiplyMatrix(Matrix otherMatrix) {
        if (this.columns == otherMatrix.rows) {
            Matrix resultMatrix = new Matrix(this.rows, otherMatrix.columns);

            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < otherMatrix.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        resultMatrix.elements[i][j] += this.elements[i][k] * otherMatrix.elements[k][j];
                    }
                }
            }

            return resultMatrix;
        } else {
            System.out.println("Matrices cannot be multiplied. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return null;
        }
    }


    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

