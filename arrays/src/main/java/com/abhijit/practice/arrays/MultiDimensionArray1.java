package com.abhijit.practice.arrays;

import java.util.Arrays;

public class MultiDimensionArray1 {
    public static void main(String[] args){
        //syntax of multidimensional array
        //int arr [] []= new int [rowSize] [ColumnSize];


        int arr[] [] = new int [2][2];
        arr[0][0]=100;
        arr[0][1]=101;
        arr[1][0]=102;
        arr[1][1]=103;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i] [j]);
            }
        }

        System.out.println("-----------------------------------------");

        //get multidimensional array using for each loop

        for(int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }

    }
}
