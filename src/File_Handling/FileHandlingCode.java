package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingCode {
    File file = new File("C:/SIDDHANT/GLA UNIVERSITY/Coding Programs/Java Programs/src/File_Handling/FileTest.txt");

    void createFile() throws IOException {
        if (file.createNewFile()) {
            System.out.println("file created successfully " + file.getName());
        } else {
            System.out.println("file already exists");
        }
    }

    void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("welcome to file handling concepts");
        fileWriter.close();
        System.out.println("file written");
    }

    void readFileData() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String fileContent = sc.nextLine();
        System.out.println(fileContent);
    }

    void delete(){
        file.delete();
        System.out.println("file deleted successfully : " + file.getName());
    }

    public static void main(String[] args) throws IOException {
        FileHandlingCode file1 = new FileHandlingCode();

        //file1.createFile();
        //file1.writeFile();
        //file1.readFileData();
        //file1.delete();

    }


}
