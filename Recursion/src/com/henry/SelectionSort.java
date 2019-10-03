package com.henry;

public class SelectionSort {
    private static int minIndex(int arr[],int startIndex){
        int min = arr[startIndex];
        int index = startIndex;
        for(int i = startIndex;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void Sorting(int arr[],int startIndex){
        int minIndex;
        int temp;
        if(startIndex> arr.length-1){
            return;
        }
        minIndex = minIndex(arr,startIndex);
        temp = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = temp;
        Sorting(arr,startIndex +1);

    }
}
