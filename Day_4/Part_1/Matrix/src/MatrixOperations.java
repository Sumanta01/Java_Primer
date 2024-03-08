import java.util.*;
public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows1 = sc.nextInt();
        int columns1 = sc.nextInt();
        Matrix matrix1 = new Matrix(rows1, columns1);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                int value = sc.nextInt();
                matrix1.setElement(i, j, value);
            }
        }

        System.out.println("First ");
        matrix1.displayMatrix();


        int rows2 = sc.nextInt();
        int columns2 = sc.nextInt();
        Matrix matrix2 = new Matrix(rows2, columns2);



        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                int value = sc.nextInt();
                matrix2.setElement(i, j, value);
            }
        }

        
    }
}
