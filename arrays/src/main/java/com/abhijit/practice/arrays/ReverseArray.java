package com.abhijit.practice.arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr={15,8,9,2,11,4};//15,8,9,2,11,4

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");//4 11 2 9 8 15
        }

        //but in above code we r just printing in reverse order
        //we need to reverse an array

        System.out.println("-------------------------------------------");
        //create new array and copy the size as original array
        int temp[] =new int[arr.length];
        //make a counter
        int count=0;

        for(int i=arr.length-1;i>=0;i--){
            temp[count]=arr[i];
            count++;
        }

        for(int n:temp){
            System.out.print(n +" ");
        }
    }
}
