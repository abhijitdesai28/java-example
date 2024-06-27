package com.abhijit.practice.arrays;

/**
 * note
 * We can find size of array using length property
 */
public class FindArrayLength {
    public static void main(String[] args){
        System.out.println("declare array");
        int [] arr;
        System.out.println("-----------------------------------------------------");

        System.out.println("creation or instantiate");
        arr=new int[5];
        System.out.println("-----------------------------------------------------");

        System.out.println("Store value inside array");
        arr[0]=101;
        arr[1]=102;
        arr[2]=103;
        arr[3]=104;
        arr[4]=105;
        System.out.println("-----------------------------------------------------");

        System.out.println("print value of array using for loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("print the length of array");
        System.out.print("array length :" +arr.length);
    }
}
