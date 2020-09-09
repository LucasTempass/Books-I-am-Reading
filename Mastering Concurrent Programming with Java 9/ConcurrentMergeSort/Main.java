package ConcurrentMergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Main {
    
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++)
            list.add((int) (Math.random() * 1000));
        var array = list.toArray(new Integer[0]);
        mergeSort(array, 0, array.length, 4);
        System.out.println("array = " + Arrays.toString(array));
        
    }
    
    public static void mergeSort(Integer[] data, int start, int end, int max) {
        MergeSortTask task = new MergeSortTask(data, start, end, null, max);
        ForkJoinPool.commonPool().invoke(task);
        
    }
    
}
