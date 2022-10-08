/**
 * @author: MARK ANDREW DUZA
 */

public class App { // class file
    public static void main(String[] args) throws Exception { // main method
        // 2D-array
        int[][] grades = new int[][] { { 82, 74, 89, 100 },
                { 93, 96, 85, 86 },
                { 83, 72, 95, 89 },
                { 91, 98, 79, 88 },
                { 85, 90, 96, 89 } };

        // declared variables
        float avarage;
        int total;

        for (int row = 0; row < grades.length; row++) {
            total = 0;
            for (int col = 0; col < grades[row].length; col++) {
                total += grades[row][col];
            }
            avarage = ((float) total / grades[0].length);
            System.out.printf("Average: %.2f \n", avarage); // %.2f means get 2 decimals of float/double
        }

        System.out.println("\nrows: " + grades.length);
        System.out.println("columns: " + grades[0].length);
    }
}
