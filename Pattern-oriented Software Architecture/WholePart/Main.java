package WholePart;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        String[][] grid = new String[20][20];
        for (String[] row : grid) Arrays.fill(row, "0");
        Point a = new Point(0, 0);
        Point b = new Point(1, 3);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        display(grid, a, b, c);
        triangle.moveTo(3, 3);
        display(grid, a, b, c);
        triangle.resize(2);
        display(grid, a, b, c);
        
    }
    
    private static void display(String[][] iGrid, Point iA, Point iB, Point iC) {
        for (String[] row : iGrid) Arrays.fill(row, " - ");
        iGrid[iA.getY()][iA.getX()] = " X ";
        iGrid[iB.getY()][iB.getX()] = " X ";
        iGrid[iC.getY()][iC.getX()] = " X ";
        System.out.println();
        for (String[] row : iGrid) {
            System.out.println();
            for (String x : row) System.out.print(x);
        }
        
    }
    
}
