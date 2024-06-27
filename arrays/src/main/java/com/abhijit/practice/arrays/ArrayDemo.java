package com.abhijit.practice.arrays;
class ArrayDemo
    {
        public static  void main(String []args)
        {
            //array declaration
            //int [] arr;

            //array creation
            //arr = new int [5];

            //declare and creation int one line
            //int [] arr=new int[5];

            int [] arr= new int[5];
            arr[0]=100;
            arr[1]=101;
            arr[2]=102;
            arr[3]=103;
            arr[4]=104;

            System.out.println("printing value which r present inside array using sout");
            System.out.println(arr[0]);//100
            System.out.println(arr[1]);//101
            System.out.println(arr[2]);//102
            System.out.println(arr[3]);//103
            System.out.println(arr[4]);//104
            System.out.println("------------------------------------------------");

            System.out.println("printing value which r present inside array using for loop");
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }

            System.out.println("------------------------------------------------");

            System.out.println("printing value which r present inside array using for each loop");
            for(int i:arr)
            {
                System.out.println(i);
            }
        }
    }

