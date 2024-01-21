package com.abhijit.oldFasioned;

import java.io.File;
import java.util.Arrays;

public class FileOperations
{
    private static final String FILE_PATH="C:\\Users\\Abhijit Desai\\Downloads\\fileDemo\\";
    private static final String FILE_NAME="text.txt";

    public static void main(String[] args) {
        File myFolder= new File(FILE_PATH);
        File myFile= new File(FILE_PATH+FILE_NAME);
       System.out.println("---------------------------------");
        if(myFile.isFile())
        {
            System.out.println(FILE_NAME +" present at "+FILE_PATH+" THIS IS A FILE NOT A FOLDER");
        }
        System.out.println("-----------------------------------------------------------");
        if(!myFile.isDirectory())
        {
            System.out.println(FILE_PATH + " is a file and not a folder.");
        }
        System.out.println("------------------------------------------------------------");
        if (myFolder.isDirectory())
        {
            System.out.println(FILE_PATH+ " IS A FOLDER NOT A FILE");
        }
        System.out.println("------------------------------------------------------------");
        if (myFile.exists())
        {
            System.out.println(FILE_NAME + " FILE IS ALREADY CRATED.");
        }
        System.out.println("------------------------------------------------------------");
        if (myFolder.exists())
        {
            System.out.println(FILE_PATH + " FOLDER IS ALREADY CREATED");
        }
        System.out.println("------------------------------------------------------------");
        if (myFolder.canRead())
        {
            System.out.println(FILE_PATH+" is readable");
        }
        System.out.println("------------------------------------------------------------");
        if (myFile.canRead())
        {
            System.out.println(FILE_NAME+ " is readable");
        }
        System.out.println("------------------------------------------------------------");
        if (myFile.canExecute())
        {
            System.out.println(FILE_NAME+" CAN be Executed");
        }
        System.out.println("------------------------------------------------------------");
        if (myFile.canWrite())
        {
            System.out.println(FILE_NAME+" IS WRITEABLE");
        }
        System.out.println("------------------------------------------------------------");
        if (!myFile.isHidden())
        {
            System.out.println(FILE_NAME+" is not a hidden file");
        }
        System.out.println("------------------------------------------------------------");
//        String[] list = myFolder.list();
//        Arrays.stream(list).toList();
//        System.out.println("list of iles present inside "+ FILE_PATH +":"+Arrays.stream(list).toList() );

        System.out.println("list of files present inside" + FILE_PATH+" : "+ (Arrays.stream(myFolder.list()).toList()));
        System.out.println("------------------------------------------------------------");
        System.out.println( "Parent folder of '" + FILE_PATH + "' -> " + myFolder.getParent());
        System.out.println("------------------------------------------------------------");
        System.out.println( "Free space in disk at " + FILE_PATH + ":" + (myFolder.getFreeSpace()/1024) + " kb");
        System.out.println( "Free space in disk at " + FILE_PATH + ":" + (myFolder.getFreeSpace()/1024/1024) + " mb");
        System.out.println( "Free space in disk at " + FILE_PATH + ":" + (myFolder.getFreeSpace()/1024/1024/1024) + " gb");
        System.out.println("------------------------------------------------------------");
        File newFolder = new File(FILE_PATH + "new-folder");
        if (newFolder.mkdir()) {
            System.out.println("New folder has been created inside " + FILE_PATH + " named as new-folder");
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------");
        if (newFolder.delete()) {
            System.out.println("New folder has been deleted from " + FILE_PATH);
        }
        System.out.println("------------------------------------------------------------");

    }
}
