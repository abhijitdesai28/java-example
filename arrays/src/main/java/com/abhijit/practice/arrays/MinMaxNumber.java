package com.abhijit.practice.arrays;

import java.util.Arrays;

public class MinMaxNumber {
    public static void main(String[] args){
        //finding min/max number using predefined method
        int [] arr={15,8,9,2,11,4};
        //before sort array
        for(int i:arr){
            System.out.println(i);
        }

        System.out.println("------------------------------------------");

        //now sort array using predefined method
        Arrays.sort(arr);
        //after sort array
        for(int i:arr){
            System.out.println(i);
        }

        System.out.println("min number from array:: "+arr[0] );
        System.out.println("max number from array:: "+ arr[arr.length-1]);

    }
}
