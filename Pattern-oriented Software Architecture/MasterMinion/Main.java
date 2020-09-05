package MasterMinion;

import java.util.Arrays;

public class Main {
    
    //||| Concurrent capabilities were not implemented ||||
    public static void main(String[] args) {
        var master = new MatrixMultiplicationMaster();
        var a = new double[][]{new double[]{2, 3}, new double[]{1, 2}};
        var b = new double[][]{new double[]{2, 2}, new double[]{1, 2}};
        System.out.println(Arrays.deepToString(master.multiply(a, b)));
        
    }
    
}
