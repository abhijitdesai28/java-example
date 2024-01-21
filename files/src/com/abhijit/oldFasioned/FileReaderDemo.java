package com.abhijit.oldFasioned;

import java.io.*;

public class FileReaderDemo
{
   // private static final String FILE_PATH="C:\\Users\\Ahijit Desai\\Dawnloads\\fileDemo\\";
    private static final String FILE_PATH="C:\\Users\\Abhijit Desai\\Downloads\\fileDemo\\";

    private static final String FILE_NAME="text.txt";

    public static void main(String[] args) {
        BufferedReader buffer = null;

        try {
            Reader fileReader = new FileReader(FILE_PATH + FILE_NAME);
            buffer = new BufferedReader(fileReader);
            System.out.println("----------start reading file-------------");
            String strCurrentLine;
            while ((strCurrentLine = buffer.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
            System.out.println("------------ end of file ------------");

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            //throw new RuntimeException(e);
        } finally {
            try {
                if (buffer != null) {
                    buffer.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                // throw new RuntimeException(ex);
            }
        }
    }
    }
