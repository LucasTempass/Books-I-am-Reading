package ConcurrentMergeSort;

import java.util.concurrent.CountedCompleter;

public class MergeSortTask extends CountedCompleter<Void> {
    
    private Integer[] data;
    private int start, end;
    private int middle;
    private int max;
    
    MergeSortTask(Integer[] data, int start, int end, MergeSortTask parent, int maxItems) {
        super(parent);
        this.data = data;
        this.start = start;
        this.end = end;
        this.max = maxItems;
        
    }
    
    @Override
    public void compute() {
        if (end - start >= max) {
            middle = (end + start) >>> 1;
            MergeSortTask task = new MergeSortTask(data, start, middle, this, max);
            MergeSortTask taskB = new MergeSortTask(data, middle, end, this, max);
            addToPendingCount(1);
            task.fork();
            taskB.fork();
        }
        else {
            mergeSort(data, start, end);
            tryComplete();
        }
        
    }
    
    @Override
    public void onCompletion(CountedCompleter<?> caller) {
        if (middle == 0)
            return;
        merge(data, start, middle, end);
        
    }
    
    private void mergeSort(Integer[] data, int start, int end) {
        if (end - start < 2)
            return;
        int middle = (end + start) >>> 1;
        mergeSort(data, start, middle);
        mergeSort(data, middle, end);
        merge(data, start, middle, end);
        
    }
    
    private void merge(Integer[] data, int start, int middle, int end) {
        int length = end - start + 1;
        Integer[] tmp = new Integer[length];
        int i, j, index;
        i = start;
        j = middle;
        index = 0;
        while ((i < middle) && (j < end)) {
            if (data[i] <= data[j])
                tmp[index] = data[i++];
            else
                tmp[index] = data[j++];
            index++;
        }
        while (i < middle)
            tmp[index++] = data[i++];
        while (j < end)
            tmp[index++] = data[j++];
        for (index = 0; index < (end - start); index++)
            data[index + start] = tmp[index];
        
    }
    
}
