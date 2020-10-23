package com.dstest;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[7];
        intArray[0] = 10;
        intArray[1] = 40;
        intArray[2] = 70;
        intArray[3] = 20;
        intArray[4] = 60;
        intArray[5] = 50;
        intArray[6] = 30;

        for (int j : intArray) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
        int[] sorted = bubble(intArray);
        for(int i = 0; i < intArray.length; i++){
            System.out.print(sorted[i] + " " );
        }
    }

    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] bubble(int[] arrayValue){
        for(int lastUnsortedIndex = arrayValue.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i=0; i < lastUnsortedIndex; i++){
                if (arrayValue[i] > arrayValue[i+1]){
                    swap(arrayValue, i, i+1);
                }
            }
        }
        return arrayValue;
    }
}
