package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3
{
    public static void main(String[] args)
    {
        //create an array of string type
        String[] arr= {"dog","cat","mouse","horse"};
        //print array
        //System.out.println(Arrays.toString(arr));//[dog, cat, mouse, horse]

        for(String str:arr)
        {
            System.out.println(str);
        }

        //create arraylist from array
        ArrayList animals=new ArrayList(List.of(arr));
        ArrayList animal = new ArrayList(Arrays.asList(arr));
        //above both ways are valid
        System.out.println(animals);//[dog, cat, mouse, horse]
        System.out.println(animal);//[dog, cat, mouse, horse]


    }
}
