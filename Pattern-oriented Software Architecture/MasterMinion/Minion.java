package MasterMinion;

class Minion {
    
    private double[] column, row;
    
    Minion(double[] iColumn, double[] iRow) {
        column = iColumn;
        row = iRow;
        
    }
    
    Double compute() {
        double sum = 0;
        for (int e = 0; e < row.length; e++)
            sum += row[e] * column[e];
        return sum;
        
    }
    
}
