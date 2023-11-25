package com.abhijit.unaryoperator;

public class PostIncrement
{
    int number=0;
    void postIncrement(int no)
    {
        System.out.println("postIncrement: " + no++);
        System.out.println("after postIncrement: " + no);

    }
}
