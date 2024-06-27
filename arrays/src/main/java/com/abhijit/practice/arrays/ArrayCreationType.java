package com.abhijit.practice.arrays;

public class ArrayCreationType {
    public static void main(String[] args){
        //array creation type
        //first type
        int [] arr1 =new int[3];
        //store value
        arr1[0]=101;
        arr1[1]=102;
        arr1[2]=103;

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("-------------------------------------------------");

        //type 2
        int arr2[]={201,202,203};

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
