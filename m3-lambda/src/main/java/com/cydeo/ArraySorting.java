package com.cydeo;

import java.lang.reflect.Array;

public class ArraySorting {//quicksort, BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSorting qs = new QuickSorting();
        BubbleSort bs = new BubbleSort();
        as.sort(bs);
        as.sort(qs);

    }

    private void sort(Sorting sorting) {
        sorting.sort();

    }
}
