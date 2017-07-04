package homework.matrix;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {randomMatrixElement(), randomMatrixElement(), randomMatrixElement(),},
                {randomMatrixElement(),randomMatrixElement(),randomMatrixElement()},
                {randomMatrixElement(),randomMatrixElement(),randomMatrixElement(),},
                {randomMatrixElement(),randomMatrixElement(),randomMatrixElement()},
                {randomMatrixElement(),randomMatrixElement(),randomMatrixElement(),}
        };
        System.out.println("Сгенерированная матрица: ");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
        }

        countSum(matrix);


    }

    private static void countSum(int[][] matrix) {
       OUTER: for (int i = 0; i < matrix.length; i++) {
           int sum = 0;
           int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] < 0) {
                    continue OUTER;
                }
                sum += row[j];

            }
            System.out.println("Сумма элементов " + i + " ряда: " +sum);
        }

    }

    private static int randomMatrixElement(){
        Random random = new Random();

        int matrixEl = random.nextInt(21) - 10; //случайный числа от -10 до 10

        return matrixEl;
    }


}

