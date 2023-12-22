package com.abhijit.practice.arrays;

public class ArraysTwo
{
    public static void main(String[] args)
    {
        int marks[] = new int[5];
        marks[0]=55;
        marks[1]=56;
        marks[2]=47;
        marks[3]=74;
        marks[4]=36;

        System.out.println("Size of array: "+marks.length);

        //while loop demo for array
        int position=0;
        System.out.println("demo of while loop:");
        while (position < marks.length)
        {
            System.out.println(marks[position]);
            position++;
        }

        System.out.println("==============================================");
        //for loop demo for array
        System.out.println("demo of for loop:");
        for (int index=0;index<marks.length;index++)
        {
            System.out.println(marks[index]);
        }

        System.out.println("==============================================");
        //for each demo for array
        System.out.println("demo of for each:");
        for (int mark:marks)
        {
            System.out.println(mark);
        }
    }
}
