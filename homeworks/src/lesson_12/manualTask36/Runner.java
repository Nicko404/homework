package lesson_12.manualTask36;

import java.io.File;
import java.util.ArrayList;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.
public class Runner {
    public static void main(String[] args) {
        File dir = new File("D://cource/homework/homeworks/src");
        ArrayList<String> directories = new ArrayList<>();
        ArrayList<String> files = new ArrayList<>();

        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    directories.add(item.getName());
                } else {
                    files.add(item.getName());
                }
            }
        }

        if (directories.isEmpty()) {
            System.out.println("Directories not found.");
        } else {
            System.out.println("Directories:");
            for (String str : directories) {
                System.out.println("\t" + str);
            }
        }

        if (files.isEmpty()) {
            System.out.println("Files not found");
        } else {
            System.out.println("Files:");
            for (String str : files) {
                System.out.println("\t" + str);
            }
        }
    }
}
