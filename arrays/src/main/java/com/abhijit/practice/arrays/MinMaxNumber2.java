package com.abhijit.practice.arrays;

/**
 * array program to find min /max number without using any redefined method
 */

public class MinMaxNumber2 {
    public static void main(String... args){
        int[] arr={15,8,9,2,11,4};

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            //this logic is for max number
            if(arr[i]>max){
                max=arr[i];
            }
            //this logic is for min number
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min number :: "+min);//2
        System.out.println("max number :: "+max);//15


    }
}
