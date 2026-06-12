package File_Handling;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class FileHandlingCode2 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/SIDDHANT/GLA UNIVERSITY/Coding Programs/Java Programs/src/File_Handling/StudentFileTest.txt");

        // create file
//        if (file.createNewFile()) {
//            System.out.println("File Created");
//        } else {
//            System.out.println("Already Exists");
//        }

        //check file properties
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());

        //write into a file
        FileWriter writer = new FileWriter(file);

        writer.write("Hello World\n");
        writer.write("Java File Handling");
        //writer.close();

        //append data
        writer.write("\nNew Line Added");
        writer.close();

        //read file data
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();

        // read using bufferedReader
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

        //write using BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("Learning Java");
        bw.close();

        //delete a file
        //if(file.delete()){
          //  System.out.println("Deleted");
        //}
        //else{
         //   System.out.println("Cannot Delete");
        //}


        // create a folder
        File folder = new File("C:/SIDDHANT/GLA UNIVERSITY/Coding Programs/Java Programs/src/File_Handling/MyFolderTest");
        folder.mkdir();

        //list files in a directory
        File[] files = folder.listFiles();

        for(File f : files){
            System.out.println(f.getName());
        }
    }

}




