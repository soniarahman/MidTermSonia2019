package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //InsertationSort
        sort.insertionSort(unSortedArray);
        System.out.println("After Intertation Sort");
        for (int i:unSortedArray) {
            System.out.println(i+ " ");
        }
        System.out.println();

        //BubbleSort
        sort.bubbleSort(unSortedArray);
        System.out.println("After Bubble Sort");
        for (int j:unSortedArray) {
            System.out.println(j+ " ");
        }

        System.out.println();

        //MergeSort

        sort.mergeSort(unSortedArray);
        System.out.println("After Merge Sort");
        for (int k:unSortedArray) {
            System.out.println(k+ " ");
        }
        System.out.println();

        //HeapSort
        sort.heapSort(unSortedArray);
        System.out.println("After Heap Sort");
        for (int l:unSortedArray) {
            System.out.println(l+ " ");
        }
        System.out.println();

        //BucketSort

        sort.bucketSort(unSortedArray);
        System.out.println("After Bucket Sort");
        for (int m:unSortedArray) {
            System.out.println(m+ " ");
        }
        System.out.println();

        //ShellSort

        sort.shellSort(unSortedArray);
        System.out.println("After Shell Sort");
        for (int n :unSortedArray) {
            System.out.println(n + " ");
        }
        System.out.println();



    }
}
