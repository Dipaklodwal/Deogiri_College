package Randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;

public class Randomaccessfile1 {

    static final String Filepath = "C:\\java_demo\\Output\\testdemo.txt  ";

    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(Filepath, 0, 80)));
            writeToFile(Filepath, " I LOVE MY COUNTRY AND MY INDIAN PEOPLE ",75);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    private static byte[] readFromFile(String Filepath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(Filepath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String Filepath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(Filepath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
