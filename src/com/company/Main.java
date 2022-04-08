package com.company;

import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {


    private static final String ABSOLUTE_PATH = "C:\\Users\\HP\\IdeaProjects\\File\\Files"; //дл тренировки
    private static final String RELATIVE_PATH = "Files";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Absolute Path");

        String path = scanner.nextLine();
        try {
            File file = new File(path);
            //создаем объект FileReader для нашего DocNumber
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
                while (line.contains("contract") && line.length()==15)  {
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
