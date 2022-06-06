package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder logs = new StringBuilder();

        File src = new File("C://Games//src");
        if (src.mkdir()) {
            logs.append("Создан каталог " + src + "\n");
        }

        File res = new File("C://Games//res");
        if (res.mkdir()) {
            logs.append("Создан каталог " + res + "\n");
        }

        File savegames = new File("C://Games//savegames");
        if (savegames.mkdir()) {
            logs.append("Создан каталог " + savegames + "\n");
        }

        File temp = new File("C://Games//temp");
        if (temp.mkdir()) {
            logs.append("Создан каталог " + temp + "\n");
        }

        File main = new File("C://Games//src//main");
        if (main.mkdir()) {
            logs.append("Создан каталог " + main + "\n");
        }

        File test = new File("C://Games//src//test");
        if (test.mkdir()) {
            logs.append("Создан каталог " + test + "\n");
        }

        File mainJava = new File("C://Games//src//main//Main.java");
        try {
            if (mainJava.createNewFile())
                logs.append("Создан файл " + mainJava + "\n");
        } catch (IOException ex) {
            logs.append(ex.getMessage());
        }

        File utilsJava = new File("C://Games//src//main//Utils.java");
        try {
            if (utilsJava.createNewFile())
                logs.append("Создан файл " + utilsJava + "\n");
        } catch (IOException e) {
            logs.append(e.getMessage());
        }

        File drawables = new File("C://Games//res//drawables");
        if (drawables.mkdir()) {
            logs.append("Создан каталог " + drawables + "\n");
        }

        File vectors = new File("C://Games//res//vectors");
        if (vectors.mkdir()) {
            logs.append("Создан каталог " + vectors + "\n");
        }

        File icons = new File("C://Games//res//icons");
        if (icons.mkdir()) {
            logs.append("Создан каталог " + icons + "\n");
        }

        File tempTxt = new File("C://Games//temp//temp.txt");
        try {
            if (tempTxt.createNewFile())
                logs.append("Создан файл " + tempTxt + "\n");
        } catch (IOException ex) {
            logs.append(ex.getMessage());
        }

        String logsText = logs.toString();
        try (FileWriter writer = new FileWriter(tempTxt, false)) {
            writer.write(logsText);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



