//import Java.*;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileDemo
{
    public static void main(String[] args) throws IOException {
        //string block content declaration in till Java-11
        String content="hello world,this is sample content that actuaally need to be"+
                "written in file using java-11 new File API.\nLet's perform this activity";

        //String block content declaration in java -17
        content = """
            hello world, this is sample content that actually needs to be written in File using Java-11 new File API.
            Let's perform this activity.
            """;

        //String tempFolder = "/home/Abhijit Desai/Downloads/fileDemo";    --in linux we wrote like this
        String tempFolder = "C:\\Users\\Abhijit Desai\\Downloads\\fileDemo\\";

        //String tempFolder = System.getProperty("java.io.tmpdir");

        //create path from a sequence of Strings
        Path filePath =Path.of(tempFolder,"content.txt");
        System.out.println("Path : "+ filePath);
        System.out.println("files Exists : "+ Files.exists(filePath));
        System.out.println("-------------------------------------------------------------------");

//
        //write content to file
        filePath=Files.writeString(filePath,content);
        System.out.println("Path after writing content to file: "+filePath);
        System.out.println("------------------------------------------------------------------------");
//
        //check is file exist after writing content to new file
        boolean isExists = Files.exists(filePath);
        System.out.println("File exist after writing content to new file "+isExists);
        System.out.println("-----------------------------------------------------------------------------");
//
        //reading what we wrote to file
        System.out.println("data of file prsent at "+filePath +" :");
        Stream<String> data = Files.lines(filePath);
        data.forEach(System.out::println);
        data.close();
        System.out.println("-----------------------------------------------------------------------------");

        //delete file
        System.out.println("file deleted :" + Files.deleteIfExists(filePath));
        System.out.println("--------------------------------------------------------");

        //create temp file
        String uriFullPath = "file:///"+tempFolder.replace("\\","/")+
                "content.txt";
        URI uri= URI.create(uriFullPath);
        System.out.println("created URI to demonstrate URI API :" +uri);
        System.out.println("--------------------------------------------------------");

//        filePath=null;
//        //create path from a URI
//        System.out.println("file path created from URI :"+filePath);
//        System.out.println("--------------------------------------------------------");
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//




System.out.println("Hello world!");
}
}