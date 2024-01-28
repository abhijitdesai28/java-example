public class FileDemo {
    public static void main(String[] args) {
        // string block content declaration in till Java-11
        String content = "hello world, this is sample content that actually needs to be "
                + "written in File using Java-11 new File API.\nLet's perform this activity.";

        // string block content declaration in Java-17
        content = """
                hello world, this is sample content that actually needs to be written in File using Java-11 new File API.
                Let's perform this activity.
                """;

        //String tempFolder = "/home/kodtodya/Downloads/fileDemo";
        String tempFolder = "C:\\Users\\Abhijit Desai\\Downloads\\fileDemo\\";
    }
}