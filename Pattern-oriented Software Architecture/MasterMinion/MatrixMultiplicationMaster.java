package MasterMinion;

public class MatrixMultiplicationMaster {
    
    public MatrixMultiplicationMaster() { }
    
    public double[][] multiply(double[][] a, double[][] b) {
        double[][] result = new double[b.length][a[0].length];
        for (int e = 0; e < result.length; e++)
            for (int i = 0; i < result[e].length; i++)
                result[e][i] = new Minion(getColumn(b,i), a[e]).compute();
        return result;
        
    }
    
    private double[] getColumn(double[][] matrix, int index) {
        double[] result = new double[matrix[0].length];
        for (int i = 0; i < result.length; i++)
            result[i] = matrix[i][index];
        return result;
        
    }
    
}
