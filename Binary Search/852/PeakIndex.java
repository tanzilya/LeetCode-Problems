package com.example.tanzilyayakshimbetova.javatest;

public class PeakIndex {

    public int peakIndexInMountainArray(int[] A) {
        return searchForItem(A, 0, A.length -1);
    }


    public int searchForItem(int[] A, int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;

            if (A[middle] < A[middle+1]){
                return searchForItem(A, middle +1, end);
            } else {
                return searchForItem(A, start, middle);
            }
        }
        return end;
    }

}
