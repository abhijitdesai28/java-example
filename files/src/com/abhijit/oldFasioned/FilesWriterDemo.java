package com.abhijit.oldFasioned;

import java.io.FileWriter;
import java.io.IOException;

public class FilesWriterDemo
{
    private static final String FILE_PATH="C:\\Users\\Abhijit Desai\\Downloads\\fileDemo\\";
    private static final String FILE_NAME="text.txt ";

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter=null;

        try{

            fileWriter = new FileWriter(FILE_PATH +FILE_NAME);

            //writing the content into the FileoperationExample.txt file
            fileWriter.write("This is sample data written to file..\\n\\n" +
                    "This data is written to new line in this file.");

            System.out.println("Content is successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("closing file writer..");
            //closing the stream
            fileWriter.close();
        }    }
}
