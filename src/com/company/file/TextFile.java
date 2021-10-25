package com.company.file;

import com.company.model.Electronics;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFile {
    private static ObjectInputStream input;
    private static ObjectOutputStream output;




    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("electronics.txt")));
            System.out.println("File   is opened");
        } catch (IOException e) {
            System.out.println("filed");
            e.printStackTrace();
        }
    }

    public static void openFilef() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("electronics.txt")));
            System.out.println("File   is opened");
        } catch (IOException e) {
            System.out.println("filed");
            e.printStackTrace();
        }
    }
    public static void addRecords(Electronics   elect) {
        try {
            output.writeObject(elect);
            System.out.println("Record is added");
        } catch (IOException e) {
            System.out.println("can't add");
            e.printStackTrace();
        }
    }
    public static void readRecords() {

        try {
            Electronics elect = (Electronics) input.readObject();
            System.out.println(elect.toString());
        } catch (IOException e) {
            System.out.println("can't read A    ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("can't read");
        }

    }

    public static void closeFile() {
        if (output != null) {
            try {
                output.close();
                System.out.println("filed closed");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("can't close");
            }
        }
    }

}
