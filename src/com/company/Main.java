package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her
        maxSan(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        minSan(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});

    }
    static void maxSan(int[] array){
        int maxS = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i]>maxS){
                maxS = array[i];
            }

        }
        System.out.println(maxS);

    }
    static void minSan(int[] intArray2){
        int minS = intArray2[0];
        for(int i = 1; i< intArray2.length; i++){
            if(intArray2[i]<minS){
                minS = intArray2[i];
            }
        }
        System.out.println(minS);


    }
}
